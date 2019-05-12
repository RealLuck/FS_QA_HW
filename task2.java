package task2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfPlay;
        System.out.println("Сколько игроков будет ? Один или два ?");
        numberOfPlay = in.nextInt();
        if (numberOfPlay < 1 || numberOfPlay > 2) {
            do {
                System.out.println("У нас нет столько игроков!");
                System.out.println("Попробуй еще раз");
                numberOfPlay = in.nextInt();
            }
            while (numberOfPlay < 1 || numberOfPlay > 2);
        }
        System.out.println("Компьютер загадывает число от 0 до 9");
        int number = (int) (Math.random() * 10);
        int firstPlayer;
        int secondPlayer;
        if (numberOfPlay == 2) {

            System.out.println("Теперь игроки должны угадать это число ,\nЕсли вы будете указывать другие числа ,то вы никогда не угадаете :)");

            do {
                System.out.println("Предположение первого игрока?");
                firstPlayer = in.nextInt();
                if (firstPlayer > 9 || firstPlayer < 0) {
                    do {
                        System.out.println("Введено неверное число ");
                        System.out.println("Попробуй снова");
                        firstPlayer = in.nextInt();
                    }
                    while (firstPlayer > 9 || firstPlayer < 0);
                }
                System.out.println("Первый игрок предположил число " + firstPlayer);
                System.out.println("Предположение второго игрока?");
                secondPlayer = in.nextInt();
                if (secondPlayer > 9 || secondPlayer < 0) {
                    do {
                        System.out.println("Введено неверное число ");
                        System.out.println("Попробуй снова");
                        secondPlayer = in.nextInt();
                    }
                    while (secondPlayer > 9 || secondPlayer < 0);
                }
                System.out.println("Второй игрок предположил число " + secondPlayer);
                if (firstPlayer == number || secondPlayer == number) {
                    System.out.println("У нас есть победитель!");
                    if (firstPlayer == number && secondPlayer != number) {
                        System.out.println("Победил первый игрок!");
                    } else if (secondPlayer == number && firstPlayer != number) {
                        System.out.println(" Победил второй игрок!");
                    } else {
                        System.out.println("Победили оба!");
                    }
                } else {
                    System.out.println("Игроки должны попробовать снова");
                }
            }
            while (firstPlayer != number && secondPlayer != number);
        } else {
            System.out.println("Теперь игрок должен угадать это число");
            do {
                System.out.println("Предположение игрока?");
                firstPlayer = in.nextInt();
                if (firstPlayer > 9 || firstPlayer < 0){
                    do {
                        System.out.println("Введенно неверное число");
                        System.out.println("Попробуй снова");
                        firstPlayer = in.nextInt();
                    }
                    while (firstPlayer >9 || firstPlayer < 0);
                }
                System.out.println("Игрок предположил число " + firstPlayer);
                if (firstPlayer == number){
                    System.out.println("Ты угадал!");
                }
                else {
                    System.out.println("Ты не угадал!");
                }
            }while (firstPlayer != number);

        }
    }
}




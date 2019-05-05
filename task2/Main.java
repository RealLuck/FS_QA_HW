package task2;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println("Компьютер загадывает число от 0 до 9");
       int number = (int)(Math.random()*10);
       int firstPlayer ;
       int secondPlayer ;
       Scanner in = new Scanner(System.in);
        System.out.println("ТЕперь игроки должны угадать это число ,\n Если вы будете указывать другие числа ,то вы никогда не угадаете :)");


        do{
            System.out.println("Предположение первого игрока?");
            firstPlayer = in.nextInt();
           System.out.println("Первый игрок предположил число " + firstPlayer);
           System.out.println("Предположение второго игрока?");
            secondPlayer = in.nextInt();
           System.out.println("Второй игрок предположил число " + secondPlayer);
           if (firstPlayer == number || secondPlayer == number){
               System.out.println("У нас есть победитель!");
               if(firstPlayer == number && secondPlayer != number){
                   System.out.println("Победил первый игрок!");}
                   else if (secondPlayer == number && firstPlayer != number){
                       System.out.println(" Победил второй игрок!");}
                       else{
                   System.out.println("Победили оба!");}
                   }else {
               System.out.println("Игроки должны попробовать снова");}
               }while (firstPlayer != number && secondPlayer != number);
           }
       }




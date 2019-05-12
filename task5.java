package task5;
import java.util.*;
public class task5 {
    public static void main(String[] args) {
        int a;
        int b;
        int number = 0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите любое число");
        a = in.nextInt();
        System.out.println("Введите любое число,больше предыдущего");
        b = in.nextInt();
            if (a > b) {
                System.out.println("Ввели неправильные числа! Второе должно быть больше первого!");}
            else {
                for (int i = a; i <= b; i++) {
                    if ((i % 12) == 0) {
                       number++; }
                   }
                System.out.println("Ответ " + number);
                }
            }
        }

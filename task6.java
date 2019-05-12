package task6;
import java.util.*;
public class task6 {
    public static void main(String[] args){
        int k;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите натуральное число k ");
        k = in.nextInt();
        if (k<1){
            System.out.println("Введено неверное число ");
        }else {
        System.out.println("Определяем есть такое число n , что бы 1+2+3+...n=k");
        double d;
        d = Math.pow(1+8*k , 0.5);
        double n1;
        n1 = (-1+d)/2;
        double n2;
        n2 = (-1-d)/2;
        if ((n1 > 0 && (n1 % 1 == 0))||( n2 > 0 && (n2 % 1 == 0))){
            if (n1 > 0){
            System.out.println("Такое число есть , n равно " + n1);}
            else {
                System.out.println("Такое число есть, n равно " + n2);
            }
        }
        else {
            System.out.println("Такого числа n нет");
        }
        }
    }
}

package task4;

import java.util.*;

public class task4 {
    public static void main(String[] args) {
        int arr[] = new int [99];
        Random rnd = new Random() ;
        String array = "";
        for (int i=0;i < arr.length;i++){

                arr[i]=rnd.nextInt(89)+10;
                array = array + String.valueOf(arr[i]);

    }


        System.out.println(Arrays.toString(arr));
//        System.out.println(array);
        int k;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число k от 0 до 180");
        k =  in.nextInt();
        if (k >180 || k <0){
            do {
                System.out.println("Введенно неверное число\nПопробуйте снова");
                k =  in.nextInt();
            }while (k>180 || k<0);

        }

        if (k > 180 || k < 1){
            System.out.println("Введенно неверное число");
        }


        System.out.println("K-ая цифра последовательности это " + array.charAt(k-1));
}
}

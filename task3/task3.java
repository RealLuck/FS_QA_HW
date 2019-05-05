package task3;

import java.util.Random;


public class task3 {
    public static void main(String[] args) {

        int arr[][] = new int [5][5];
        Random rnd = new Random() ;
        for (int i=0;i < arr.length;i++){
            for (int j=0;j < arr[i].length;j++){
                arr[i][j]=rnd.nextInt(10)+1;
            }
        }
        for (int i=0;i < arr.length;i++,System.out.println()){
            for (int j=0;j < arr[i].length;j++){
                System.out.print(arr[i][j]+" ");

            }}
            for (int i = 0; i < arr.length  ; i++) {
                for (int j = i; j < arr.length ; j++) {


                    if (i==j){ continue;}

                    arr[i][j]=arr[ j][i]+ arr[i][j];
                    arr[j][i] = arr[i][j] - arr[j][i]  ;
                    arr [i][j] = arr [i][j] - arr[j][i];
                }
            }
        System.out.println("Перевернутый массив");
            for (int i=0;i < arr.length;i++,System.out.println()){
            for (int j=0;j < arr[i].length;j++){
                System.out.print(arr[i][j]+" ");}}


    }
}




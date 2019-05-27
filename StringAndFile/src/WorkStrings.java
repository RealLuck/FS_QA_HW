import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class WorkStrings {


        private Scanner scanner;
        private String enteredString;
        private String trimmedString;
        private int begin;
        private int end;

        public WorkStrings(Scanner scanner) {
            this.scanner = scanner;
        }

        public String scanner(){
            System.out.println("Enter you'r string");
            enteredString = scanner.nextLine();
            System.out.println(String.format("You entered %s" ,enteredString));
            return null;

        }



        public String reverse() {

            char[] charsString = enteredString.toCharArray();
            System.out.println("Reversed string by chars");

            for(int i=charsString.length - 1; i>= 0 ; i--){
                System.out.print(charsString[i]);
            }

            StringBuilder stringBuilder = new StringBuilder(enteredString);

            System.out.println("\nReversed sting by stringbuilder");
            System.out.println(stringBuilder.reverse());

            return null;
        }

        public String format(){

            System.out.println("del spacing in the begiging and in the end");
            trimmedString = enteredString.trim();
            System.out.println(trimmedString);
        return null;
        }

        public String format1(){

            char[] charsString = enteredString.toCharArray();
            System.out.println("del spacing by chars in the begiging and in the end");


            for (int i =0 , j = enteredString.length() - 1; Character.isWhitespace( charsString[i] ) && Character.isWhitespace( charsString[j] );){


                if (Character.isWhitespace( charsString[i] )){

                    i++ ;
                       }
                if (Character.isWhitespace( charsString[j] ) ){
                    j--;
                }
                begin = i;
                end = j;
            }


            char[] chars = Arrays.copyOfRange( charsString, begin , end+1 );
            for (int i = 0 ; i < end  ; i++ ){
                System.out.print(chars[i]);
            }

            System.out.println();
            return null;
        }
        public String caseFormat(){
            String uppercase = enteredString.toUpperCase();
            System.out.println("You'r string in upper case " + uppercase);
            String lowercase = enteredString.toLowerCase();
            System.out.println("You'r string in lowercase " + lowercase);

            return null;
        }

        public String substring(){
            System.out.println("Enter the beginIndex and endIndex for the substring");

            int beginIndex = scanner.nextInt();
            int endIndex = scanner.nextInt();

            System.out.println("The substring: " + enteredString.substring( beginIndex, endIndex ));

            return null;
        }

}

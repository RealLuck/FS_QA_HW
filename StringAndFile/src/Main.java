import java.io.IOException;
import java.util.Scanner;

public class Main {
private static Scanner scanner;
private static String stringOrFile;
    public static void main(String[] args) throws IOException {
        SwitchStringFile switchStringFile = new SwitchStringFile();
        do {
            System.out.println("What do you want to do? \n1 - work whit strings\n2 - work whit files");
            scanner = new Scanner( System.in );
             stringOrFile = scanner.nextLine();
            if(stringOrFile.equals( "1" )) {
                System.out.println("Strings");
                switchStringFile.SwitchString();
            }else if (stringOrFile.equals( "2" )){
                System.out.println("Files");
                switchStringFile.SwitchFile();

            }
        }while (!stringOrFile.equals( "1" ) && !stringOrFile.equals( "2" ));



    }
}
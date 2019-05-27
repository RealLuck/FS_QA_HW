import java.io.IOException;
import java.util.Scanner;

public class SwitchStringFile {

    private Scanner scanner;
    private String switchchoise;
    public String SwitchString(){
        WorkStrings workStrings = new WorkStrings(new Scanner(System.in));
        workStrings.scanner();

        do {

        System.out.println("What do you want to do whit strings?\n1 - reverse string \n2 - del spacing in the begiging and in the end " +
                "\n3 - del spacing by chars in the begiging and in the end \n4 - case format \n5 - get substring\n6 - exit");

        scanner = new Scanner( System.in );
        switchchoise = scanner.nextLine();

        switch (switchchoise) {

            case "1":
                workStrings.reverse();
                break;

            case "2":
                workStrings.format();
                break;

            case "3":
                workStrings.format1();
                break;

            case "4":
                workStrings.caseFormat();
                break;

            case "5":
                workStrings.substring();
                break;

            case "6":
                break;

            default:
                System.out.println( "What?" );
                break;
        }
        } while (!switchchoise.equals( "6" ));




        return null;
    }

    public String SwitchFile() throws IOException {

        Files files = new Files();

        do {
            System.out.println( "What do you want to do whit files?\n1 - write one string in file \n2 - write many strings in file " +
                    "\n3 - create a new dirrectory \n4 - delete dirrectory \n5 - exit" );
            scanner = new Scanner( System.in );
            switchchoise = scanner.nextLine();

            switch (switchchoise) {

                case "1":
                    files.writeInFileOneString();
                    break;

                case "2":
                    files.writeInFileManyStrings();
                    break;

                case "3":
                    files.createDirr();
                    break;

                case "4":
                    files.delDirr();
                    break;

                case "5":
                    break;

                default:
                    System.out.println( "What?" );
                    break;
            }
        }while (!switchchoise.equals( "5" ));


        return null;
    }
}

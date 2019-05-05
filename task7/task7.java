package task7;
import java.util.* ;
public class task7 {

    public static void main(String[] args) {
        int mounth ;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        mounth = in.nextInt();

        switch (mounth){
            case 12:
            case 1:
            case 2:
                System.out.println("это зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("это весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("это лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("это осень");
                break;
                default:
                    System.out.println("Такого месяца нет");
                    break;
        }

    }
}



import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Dictionary dictionary = new Dictionary();

        TranslateRussiaToEnglish russiaToEnglish;

        TranslateEnglishToRussia englishToRussia;

        Menu menu = new Menu();

        String choise;

        do {

            menu.show();



            choise = scan.nextLine();



            switch (choise) {



                case "1":

                    System.out.println("Enter english word:");

                    String english = new Scanner(System.in).nextLine();

                    System.out.println("Enter translate:");

                    String russia = new Scanner(System.in).nextLine();

                    dictionary.addWord(english, russia);

                    break;

                case "2":


                    System.out.println("Enter english sentence:");

                    String englishSentence = new Scanner(System.in).nextLine();

                    englishToRussia = new TranslateEnglishToRussia(dictionary);

                    englishToRussia.Trans(englishSentence);

                    break;

                case "3":

                    System.out.println("Enter russian sentence:");

                    String russiaSentence = new Scanner(System.in).nextLine();

                    russiaToEnglish = new TranslateRussiaToEnglish(dictionary);

                    russiaToEnglish.Trans(russiaSentence);

                    break;



                case "4":

                    if (dictionary.getDictionary().size() == 0)

                        System.out.println("Your dictionary is empty! Please add word or load dictionary from file.");

                    else System.out.println(dictionary.getDictionary());

                    break;

                default:



                        System.out.println("Invalid choose!");

                    break;

            }

        } while (!choise.equals( "0" ));

    }

}
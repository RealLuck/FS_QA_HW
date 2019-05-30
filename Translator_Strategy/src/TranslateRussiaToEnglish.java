import java.util.Map;
import java.util.Set;

public class TranslateRussiaToEnglish implements Translator {

    Set<Map.Entry<String, String>> vocabularySet;


    public TranslateRussiaToEnglish(Dictionary dictionary) {

        vocabularySet = dictionary.getDictionary().entrySet();
    }

    @Override
    public void Trans(String phrase) {

        String[] str = phrase.split(" ");

        for (int i = 0; i < str.length; i++) {

            int j = 0;

            if (i == 0) {

                System.out.println();

            }

            for (Map.Entry<String, String> entry : vocabularySet) {

                if (entry.getValue().equalsIgnoreCase(str[i])) {

                    System.out.print(entry.getKey() + " ");

                    break;

                }



                else if (j == vocabularySet.size() - 1) {

                    System.out.print(str[i] + " ");

                }

                j++;

            }

        }

    }
}


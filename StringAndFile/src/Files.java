import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Files {
    private Scanner scanner;
    private String fileName;
    private String dirrName;
    private String choise;
    private List<String> listStrings;


    public String writeInFileOneString() throws IOException {
        System.out.println("Input file name to work whit");
        scanner = new Scanner(System.in);
        fileName = scanner.nextLine();
        File createFile = new File(fileName);
        if(!createFile.exists()){
            createFile.createNewFile();
        }

        try (FileWriter writer = new FileWriter(fileName, false)){
            System.out.println("Input string");
            String oneString = scanner.nextLine();
            writer.write(oneString);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String writeInFileManyStrings() throws IOException {
        System.out.println("Input file name to work whit");
        scanner = new Scanner( System.in );
        fileName = scanner.nextLine();
        File createFile = new File( fileName );

        if (!createFile.exists()){
            createFile.createNewFile();
        }

        try (FileWriter writer = new FileWriter( fileName, false )){
            listStrings = new ArrayList<>(  );
           do {
                System.out.println("Input string");
                String manyStrings = scanner.nextLine();
                System.out.println("Do you want to input another string in " + fileName + "? \nY?");
                choise = scanner.nextLine();
                listStrings.add( manyStrings );
                   }while (choise.equalsIgnoreCase(  "Y"));

                for(String line : listStrings)
                {
                    writer.write(line);
                    writer.write(System.getProperty("line.separator"));

                }

                writer.flush();
            }catch (IOException ex){ex.printStackTrace();}

        return null;
    }

    public String createDirr() throws IOException {
        System.out.println("Input dirrectiry that you want to create");
        scanner = new Scanner(System.in);
        dirrName = scanner.nextLine();
        File createDirr = new File(dirrName);
        if(createDirr.exists()){
            System.out.println("This dirrectory already exists");
        }else {
            createDirr.mkdir();
        }
        return null;
    }

    public String delDirr(){
        System.out.println("Input dirrectory that you want to deleate");
        scanner=new Scanner( System.in );
        dirrName = scanner.nextLine();
        File deleateDirr = new File( dirrName );
        if (!deleateDirr.exists()){
            System.out.println("This dirrectory does not exist");
        }else  {
            deleateDirr.delete();
        }
        return null;
    }
}


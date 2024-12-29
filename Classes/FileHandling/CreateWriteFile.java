package Classes.FileHandling;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CreateWriteFile {

    public static void main(String[] args) {

        try{

            File myObj = new File("C:\\Users\\Jesver Kevin Abelda\\Desktop\\Filename.txt");
            
            if (myObj.createNewFile()) {

                System.out.println("File Created " + myObj.getName());

            } 

            else {

                System.out.println("File already exists");

            }

        }

        catch (IOException e) {

            System.out.println("An error occured!!!");
            e.printStackTrace();

        }

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Input: ");
            String input = scanner.nextLine();

            FileWriter myWriter = new FileWriter("C:\\Users\\Jesver Kevin Abelda\\Desktop\\Filename.txt");
            myWriter.write(input);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            scanner.close();

        }

        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
          }

        }
        
    } 
    


package Classes.FileHandling;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFiles {

    public static void main(String[] args) {

        /*
         * Read a File
        In the previous chapter, you learned how to create and write to a
        file.

        In the following example, we use the Scanner class to read the 
        contents of the text file we created in the previous chapter:
         */

        try {

            File myObj = new File("C:\\Users\\Jesver Kevin Abelda\\Desktop\\Filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
                String data  = myReader.nextLine();
                System.out.println(data);
            }

            myReader.close();

        }

        catch (FileNotFoundException e) {

            System.out.println("An error occurred!!!");
            e.printStackTrace();

        }

        /*
         * Get File Information
        To get more information about a file, 
        use any of the File methods:
         */

        File myObj = new File("C:\\Users\\Jesver Kevin Abelda\\Desktop\\Filename.txt");
        if (myObj.exists()) {

            System.out.println("File name: " + myObj.getName());
            System.out.println("Absolute path: " + myObj.getAbsolutePath());
            System.out.println("Writeable: " + myObj.canWrite());
            System.out.println("Readable: " + myObj.canRead());
            System.out.println("File Size in bytes: " + myObj.length());

        }

        else {
            System.out.println("File does not exist.");
        }

    }
    
}


/*
 * Note: There are many available classes in the Java API that can be 
 * used to read and write files in Java: FileReader, BufferedReader, 
 * Files, Scanner, FileInputStream, FileWriter, BufferedWriter, 
 * FileOutputStream, etc. Which one to use depends on the Java 
 * version you're working with and whether you need to read bytes or 
 * characters, and the size of the file/lines etc.

Tip: To delete a file, read our Java Delete Files chapter.
 */
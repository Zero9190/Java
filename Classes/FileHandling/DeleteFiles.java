package Classes.FileHandling;
import java.io.File;

public class DeleteFiles {

    public static void main(String[] args) {

        /*
         * Delete a File
        To delete a file in Java, use the delete() method:
         */

        File myObj = new File("C:\\Users\\Jesver Kevin Abelda\\Desktop\\Filename.txt");
        if (myObj.delete()) {

            System.out.println("File has been deleted: " + myObj.getName());

        }

        else {

            System.out.println("Failed to delete the file.");

        }

        /*
         * Delete a Folder
        You can also delete a folder. However, it must be empty:
         */

        File myFolder = new File("C:\\Users\\\\Jesver Kevin Abelda\\Desktop\\New");
         
        if (myFolder.delete()) {

            System.out.println("Deleted Folder: " + myFolder.getName());

        }

        else {

            System.out.println("Failed to delete the Folder");

        }

    }
    
}

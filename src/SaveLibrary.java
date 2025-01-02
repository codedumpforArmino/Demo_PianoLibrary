import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SaveLibrary {
    public static void SaveLibrary(ArrayList<PianoPiece> Library) {
        try(FileOutputStream fileOut = new FileOutputStream("Plibrary.ser");
            ObjectOutputStream library = new ObjectOutputStream(fileOut);){

            library.writeObject(Library);
            System.out.println("Saved!");
        }catch(Exception e){ //IOexception
            e.printStackTrace();
        }

    }
}
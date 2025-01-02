import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class LoadLibrary {
    public static ArrayList<PianoPiece> loadLibrary() {
        ArrayList<PianoPiece> savedLibrary = null;

        try(FileInputStream fileIn = new FileInputStream("Plibrary.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);){

            savedLibrary = (ArrayList<PianoPiece>)in.readObject();
        } catch(FileNotFoundException e){
            SaveLibrary.SaveLibrary(new ArrayList());
            savedLibrary = loadLibrary();
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return savedLibrary;
    }
}
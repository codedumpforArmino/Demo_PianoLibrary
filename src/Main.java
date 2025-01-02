import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<PianoPiece> PianoLibrary = LoadLibrary.loadLibrary();
        System.out.println("Hello and welcome!");
        Scanner myInput = new Scanner(System.in);

        char choice;
        do {
            System.out.println("Enter Operation: ");
            int op = myInput.nextInt();
            String name;
            switch (op) {
                case 1:
                    myInput.nextLine();
                    System.out.print("Song to add:");
                    name = myInput.nextLine();
                    PianoLibrary.add(new PianoPiece(name));
                    break;
                case 2:
                    for(PianoPiece p : PianoLibrary){
                        System.out.println("Piece Name: " + p.getName());
                        System.out.println("Last Played: ");
                    }
                    break;
                case 3:
                    //play
                    break;
            }

            System.out.println("Do you want to repeat (y/n): ");
            choice = myInput.next().charAt(0);
        } while(choice != 'n');

        SaveLibrary.SaveLibrary(PianoLibrary);
    }
}
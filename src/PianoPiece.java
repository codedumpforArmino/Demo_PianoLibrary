import java.io.Serializable;
import java.time.LocalDate;

public class PianoPiece implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    LocalDate LastPlayed;
    boolean isNeverplayed;

    public PianoPiece(String inputName) {
        this.name = inputName;
        this.LastPlayed = null;
        this.isNeverplayed = true;
        System.out.println(this.name + " Piano Piece added");
    }

    public void playPiece() {
        if (this.isNeverplayed) {
            this.isNeverplayed = false;
        }

        this.LastPlayed = LocalDate.now();
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        String Date = "";
        if (!this.isNeverplayed) {
            Date = this.LastPlayed.toString();
        }

        return "Piano Piece: " + this.name + "\nLastPlayed: " + Date;
    }
}
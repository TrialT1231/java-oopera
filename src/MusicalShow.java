import java.util.ArrayList;

public class MusicalShow extends Show {
    protected String musicAuthor;
    protected String librettoText;
 public MusicalShow(String title, int duration, String director, ArrayList<Actor> listOfActors, String musicAuthor ,  String librettoText) {
     super(title, duration, director, listOfActors);
     this.musicAuthor = musicAuthor;
     this.librettoText = librettoText;
 }
 public void getLibrettoText() {
     System.out.println("Текст либретто для "+ this.title);
     System.out.println(librettoText);
 }
}

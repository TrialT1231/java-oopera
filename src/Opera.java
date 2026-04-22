import java.util.ArrayList;

public class Opera extends MusicalShow{
    private int choirSize;
    public  Opera(String title, int duration, String director, ArrayList<Actor> listOfActors, String musicAuthor ,  String librettoText , int choirSize){
        super(title, duration, director, listOfActors, musicAuthor,  librettoText );
        this.choirSize = choirSize;
    }
    public Opera(MusicalShow musicalShow, int choirSize){
        super(musicalShow.title, musicalShow.duration, musicalShow.director, musicalShow.listOfActors, musicalShow.musicAuthor, musicalShow.librettoText);
            this.choirSize = choirSize;

    }
}

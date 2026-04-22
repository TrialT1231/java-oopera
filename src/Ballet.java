import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private String choreographer;
    public Ballet(String title, int duration, String director, ArrayList<Actor> listOfActors, String musicAuthor ,  String librettoText , String choreographer){
                super(title, duration, director, listOfActors, musicAuthor,  librettoText );
                this.choreographer = choreographer;
    }
    public Ballet(MusicalShow musicalShow, String choreographer){
        super(musicalShow.title, musicalShow.duration, musicalShow.director, musicalShow.listOfActors, musicalShow.musicAuthor, musicalShow.librettoText);
            this.choreographer = choreographer;

    }
}

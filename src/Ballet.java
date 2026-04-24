import java.util.ArrayList;

public class Ballet extends MusicalShow{
    private Person choreographer;
    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor ,  String librettoText , Person choreographer){
                super(title, duration, director, listOfActors, musicAuthor,  librettoText );
                this.choreographer = choreographer;
    }
    public Ballet(MusicalShow musicalShow, Person choreographer){
        super(musicalShow.title, musicalShow.duration, musicalShow.director, musicalShow.listOfActors, musicalShow.musicAuthor, musicalShow.librettoText);
            this.choreographer = choreographer;

    }
}

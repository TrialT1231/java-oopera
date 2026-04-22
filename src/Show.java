import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected String director;
    public ArrayList<Actor> listOfActors;

    public Show() {
        this.listOfActors = new ArrayList<>();
    }

    public Show(String title, int duration, String director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printAllActors() {
        System.out.println("Список актеров в преставлении " + this.title);
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void AddNewActor(Actor actor) {

        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " добавлен в : " + this.title);

        } else {
            System.out.println("ОШИБКА!!!Актёр " + actor + " уже есть в спектакле!!!");
        }
    }

    public void ChangeActor(Actor actor1, Actor actor2) {
        if( actor1 != null && actor2 != null ) {
            listOfActors.set(listOfActors.indexOf(actor1), actor2);
            System.out.println("Актер успешно заменен!");
        }else {
            System.out.println("ОШИБКА, актера не существует !!!");
        }
    }
}

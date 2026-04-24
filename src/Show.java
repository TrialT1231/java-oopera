import java.util.ArrayList;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    public ArrayList<Actor> listOfActors;
    public Show() {
        this.listOfActors = new ArrayList<>();
    }

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
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

    public void addNewActor(Actor actor) {
        if (!listOfActors.contains(actor)) {
            listOfActors.add(actor);
            System.out.println("Актёр " + actor + " добавлен в : " + this.title);
        } else {
            System.out.println("ОШИБКА!!!Актёр " + actor + " уже есть в спектакле!!!");
        }
    }

    public void changeActor(Actor actor1, String actor2) {
        boolean f = false;
        listOfActors.remove(actor1);
        Actor actor;
        for (int i = 0; i < Theatre.theatreActors.size(); i++) {
            if(Theatre.theatreActors.get(i).getSurname().equals(actor2)) {
                actor = Theatre.theatreActors.get(i);
                listOfActors.add(actor);
                f = true;
                break;
            }
        }
        listOfActors.remove(actor1);
        if (f) {
            System.out.println("Актер успешно заменен!");
        } else {
            System.out.println("ОШИБКА, актера не существует !!!");
        }

    }
}

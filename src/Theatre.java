import java.util.ArrayList;
public class Theatre {
    public static ArrayList<Actor> theatreActors = new ArrayList<>();

    public static void main(String[] args) {
        Director director1 = new Director("Арсений", "Баснюков", Gender.MALE, 15);
        Director director2 = new Director("Виктор", "Сидарчук", Gender.MALE, 11);
        Person choreographer = new Person("Виктор" , "Василенко", Gender.MALE);
        Person musicalAuthor = new Person("Екатирина", "Стук", Gender.MALE);

        Show show = new Show("Гамлет", 180, director1, new ArrayList<>());
        Ballet ballet = new Ballet("Балет", 180, director2, new ArrayList<>(), musicalAuthor, "Если только у тебя есть глаза, ты всюду увидишь цукатные рощи", choreographer);
        Opera opera = new Opera("Опера", 160, director1, new ArrayList<>(), musicalAuthor, "Посланец разгневанного Бога,ассирийский царь обрушился на нас!", 22);
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 176);
        Actor actor2 = new Actor("Валентин", "Петров", Gender.MALE, 180); // полностью совпадает с actor1
        Actor actor3 = new Actor("Григорий", "Есенин", Gender.MALE, 185);

        theatreActors.add(actor1);
        theatreActors.add(actor2);
        theatreActors.add(actor3);

        show.addNewActor(actor1);
        show.addNewActor(actor2);
        show.printAllActors();
        ballet.addNewActor(actor1);
        ballet.addNewActor(actor3);
        ballet.addNewActor(actor3);
        ballet.printAllActors();
        opera.addNewActor(actor2);
        opera.addNewActor(actor3);
        show.changeActor(actor1, "Есенин");
        show.printAllActors();
        opera.getLibrettoText();
        ballet.getLibrettoText();
    }
}

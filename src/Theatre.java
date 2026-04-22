import java.util.ArrayList;
public class Theatre {

    public static void main(String[] args) {

        Show show = new Show("Гамлет", 180, "Немирович-Данченко", new ArrayList<>());
        Ballet ballet = new Ballet("Балет", 180, "Котиков", new ArrayList<>(), "Бетховен", "Если только у тебя есть глаза, ты всюду увидишь цукатные рощи", "Иванчук");
        Opera opera = new Opera("Опера", 160, "Сергеев", new ArrayList<>(), "Васнюков", "Посланец разгневанного Бога,ассирийский царь обрушился на нас!", 22);
        Actor actor1 = new Actor("Иван", "Иванов", "М", 176);
        Actor actor2 = new Actor("Валентин", "Петров", "М", 180); // полностью совпадает с actor1
        Actor actor3 = new Actor("Григорий", "Есенин", "М", 185);

        Director director1 = new Director("Арсений", "Баснюков", "M", 15);
        Director director2 = new Director("Виктор", "Сидарчук", "M", 11);
        Person choreographer = new Person("Виктор" , "Василенко", "M");
        Person musicalAuthor = new Person("Екатирина", "Стук", "F");
        show.AddNewActor(actor1);
        show.AddNewActor(actor2);
        show.printAllActors();
        ballet.AddNewActor(actor1);
        ballet.AddNewActor(actor3);
        ballet.AddNewActor(actor3);
        ballet.printAllActors();
        opera.AddNewActor(actor2);
        opera.AddNewActor(actor3);
        show.ChangeActor(actor1, actor3);
        show.printAllActors();
        opera.getLibrettoText();
        ballet.getLibrettoText();
    }
}

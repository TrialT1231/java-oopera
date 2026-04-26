import java.util.ArrayList;
public class Theatre {

    public static void main(String[] args) {
        Director director1 = new Director("Арсений", "Баснюков", Gender.MALE, 15);
        Director director2 = new Director("Виктор", "Сидарчук", Gender.MALE, 11);
        Person choreographer = new Person("Виктор" , "Василенко", Gender.MALE);
        Person musicalAuthor = new Person("Екатирина", "Стук", Gender.MALE);

        Show show = new Show("Гамлет", 180, director1, new ArrayList<>());
        Ballet ballet = new Ballet("Балет", 180, director2, new ArrayList<>(), musicalAuthor, "Если только у тебя есть глаза, ты всюду увидишь цукатные рощи", choreographer);
        Opera opera = new Opera("Опера", 160, director1, new ArrayList<>(), musicalAuthor, "Посланец разгневанного Бога,ассирийский царь обрушился на нас!", 22);
        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 176);
        Actor actor2 = new Actor("Валентин", "Петров", Gender.MALE, 180);
        Actor actor3 = new Actor("Григорий", "Есенин", Gender.MALE, 185);

        show.addNewActor(actor1);//ДОБАВЛЕНИЕ В КЛАСС Show АКТЕРОВ!!!!
        show.addNewActor(actor2);//ДОБАВЛЕНИЕ В КЛАСС Show АКТЕРОВ!!!!
        show.printAllActors();
        ballet.addNewActor(actor1);//ДОБАВЛЕНИЕ В КЛАСС Ballet АКТЕРОВ!!!!
        ballet.addNewActor(actor3);//ДОБАВЛЕНИЕ В КЛАСС Ballet АКТЕРОВ!!!!
        ballet.addNewActor(actor3);//ДОБАВЛЕНИЕ В КЛАСС Ballet АКТЕРОВ!!!!
        ballet.printAllActors();
        opera.addNewActor(actor2);//ДОБАВЛЕНИЕ В КЛАСС Opera АКТЕРОВ!!!!
        opera.addNewActor(actor3);//ДОБАВЛЕНИЕ В КЛАСС Opera АКТЕРОВ!!!!
        opera.printAllActors();
        show.changeActor(actor3, "Петров");
        show.printAllActors();
        opera.getLibrettoText();
        ballet.getLibrettoText();

        show.printDirector();
        ballet.printDirector();
    }
}

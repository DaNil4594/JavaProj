import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Movie m1 = new Movie("Елки 1223", "Комедия",11,"9:00/20:00");
        Movie m2 = new Movie("Дед Мороз", "Сказка",2,"19:00/21:00");
        Movie m3 = new Movie("Бегущий", "Триллер/Хорорр",3,"16:00/19:00");
        Movie m4 = new Movie("Смешарики 8D", "Фэнтези",2,"15:00/17:00");
        Movie m5 = new Movie("Бойцовский клуб", "Жизненная правда",3,"19:00/22:00");
        Movie m6 = new Movie("Драйв", "Триллер",2,"7:00/9:00");

        Securirity s1 = new Securirity("Вольдемар",45);
        Securirity s2 = new Securirity("Серега",67);
        Securirity s3 = new Securirity("Иван",19);

        Cahier c1 = new Cahier("Галина", 50);
        Cahier c2 = new Cahier("Анна", 23);
        Cahier c3 = new Cahier("Кристина", 29);

        List<Movie> movieListForHall1 = new ArrayList<>();
        movieListForHall1.add(m1);
        movieListForHall1.add(m2);


        List<Movie> movieListForHall2 = new ArrayList<>();
        movieListForHall1.add(m3);
        movieListForHall1.add(m4);


        List<Movie> movieListForHall3 = new ArrayList<>();
        movieListForHall1.add(m5);
        movieListForHall1.add(m6);



        Hall h1 = new Hall(1,250,movieListForHall1,s1);
        Hall h2 = new Hall(2,250,movieListForHall2,s2);
        Hall h3 = new Hall(3,250,movieListForHall3,s3);


        Ticket t1 = new Ticket(m1,h1,700);
        Ticket t2 = new Ticket(m2,h1,700);
        Ticket t3 = new Ticket(m3,h2,850);
        Ticket t4 = new Ticket(m4,h2,850);
        Ticket t5 = new Ticket(m5,h3,700);
        Ticket t6 = new Ticket(m6,h3,700);


        Client client1 = new Client("Кирилл",35,"муж");
        Client client2 = new Client("Узмар",52,"муж");
        Client client3 = new Client("Анастасия",23,"жен");

        Volonter volonter1 = new Volonter("Валерия", 18,"жен");
        Volonter volonter2 = new Volonter("Дмитрий", 30,"муж");
        Volonter volonter3 = new Volonter("Диана", 23,"жен");

        List<Movie> movieListForCinema = new ArrayList<>();
        List<EmployeeOfCinema> employeeOfCinemas = new ArrayList<>();
        List<Hall> hallsForCinema = new ArrayList<>();


        movieListForCinema.add(m1);
        movieListForCinema.add(m2);
        movieListForCinema.add(m3);
        movieListForCinema.add(m4);
        movieListForCinema.add(m5);
        movieListForCinema.add(m6);

        employeeOfCinemas.add(s1);
        employeeOfCinemas.add(s2);
        employeeOfCinemas.add(s3);
        employeeOfCinemas.add(c1);
        employeeOfCinemas.add(c2);
        employeeOfCinemas.add(c3);

        hallsForCinema.add(h1);
        hallsForCinema.add(h2);
        hallsForCinema.add(h3);


        Cinema cinema1 = new Cinema(movieListForCinema,employeeOfCinemas,hallsForCinema);

        //А сейчас демонстрация методов

        Movie.showInfoAboutFilm(m1);
        Movie.showInfoAboutFilm(m2);
        Movie.showInfoAboutFilm(m3);
        System.out.println();
        System.out.println();
        t1.showInfoByTicket();
        System.out.println();
        System.out.println();
        h1.showInfoByHall();
        Movie m7 = new Movie("Седбмой фильм","Неизвестен",24,"00:00/00:00");
        h1.registrFilmByHall(m7);
        System.out.println();
        h1.showInfoByHall();
        System.out.println();
        System.out.println();
        volonter1.whoAmI();
        System.out.println();
        System.out.println();
        client1.whoAmI();

    }
}
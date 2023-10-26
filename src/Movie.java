import java.io.IOException;

public class Movie {
    private String nameOfFilm;
    private String genre;
    private int duration;
 //Решил не играться с дататаймом, тк это проблематично и займет много времени
    //получится конечно кривая, но реализация

    private String time;
    public Movie() throws IllegalArgumentException{
        throw new IllegalArgumentException("Вы не можете создать пустой экземпляр фильма\nПерезапустите программу и больше так не делайте");
    }


    public static void showInfoAboutFilm(Movie movie){
        System.out.println("Информация о фильме:\n" +
                "Название: "+movie.getNameOfFilm()+
                "\nЖанр: "+movie.getGenre() +
                "\nПродолжительность: "+movie.getDuration()+
                "\nВремя показа: "+ movie.getTime());
        System.out.println();
    }

    public Movie(String nameOfFilm, String genre, int duration,String time) {
        this.nameOfFilm = nameOfFilm;
        this.genre = genre;
        this.duration = duration;
        this.time=time;
    }

    public String getNameOfFilm() {
        return nameOfFilm;
    }



    public String getGenre() {
        return genre;
    }


    public int getDuration() {
        return duration;
    }

    public String getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Фильм{" +
                "Название='" + nameOfFilm + '\'' +
                ", Жанр='" + genre + '\'' +
                ", Продолжительность=" + duration +
                ", Время показа='" + time + '\'' +
                '}';
    }
}

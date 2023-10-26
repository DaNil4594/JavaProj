import java.util.List;

public class Hall {
    private int numberOfHall;
    private int capacity;

    private List<Movie> movieList;

    private Securirity securirity;


    public Hall(int numberOfHall, int capacity, List<Movie> movieList, Securirity securirity) {
        this.numberOfHall = numberOfHall;
        this.capacity = capacity;
        this.movieList = movieList;
        this.securirity = securirity;

    }

    public void registrFilmByHall(Movie movie){
        movieList.add(movie);
    }

    public void showInfoByHall(){
        System.out.println("Информация о зале номер "+ numberOfHall+".");
        System.out.println("Вместитмость (Количество человек): "+capacity);
        System.out.println("Список фильмов показываемых  в этом зале: ");
        if (movieList.isEmpty()){
            System.out.println("В этом зале не показываются фильмы");
        } else {

            for (Movie movie:movieList) {
                Movie.showInfoAboutFilm(movie);
            }
        }
    }

    public int getNumberOfHall() {
        return numberOfHall;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Movie> getMovieList() {
        return movieList;
    }

    public Securirity getSecuririty() {
        return securirity;
    }



    @Override
    public String toString() {
        return "Зал{" +
                "Номер зала=" + numberOfHall +
                ", Вместительность=" + capacity +
                ", Список фильмов=" + movieList +
                ", Охранник зала = "+securirity+
                '}';
    }
}

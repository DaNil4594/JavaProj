import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private List<Movie> movies;
    private List<EmployeeOfCinema> employees;
    private List<Hall> halls;


    public Cinema(List<Movie> movies, List<EmployeeOfCinema> employees, List<Hall> halls) {
        this.movies = movies;
        this.employees = employees;
        this.halls = halls;
    }

    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void removeMovie(Movie movie) {
        movies.remove(movie);
    }

    public void addEmployee(EmployeeOfCinema employee) {
        employees.add(employee);
    }

    public void removeEmployee(EmployeeOfCinema employee) {
        employees.remove(employee);
    }

    public void addHall(Hall hall) {
        halls.add(hall);
    }

    public void removeHall(Hall hall) {
        halls.remove(hall);
    }
}

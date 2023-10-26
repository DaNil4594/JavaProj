public class Ticket {
    private Movie movie;
    private Hall hall;
    private int cost;



    public void showInfoByTicket(){
        System.out.println("Информация по билету в кинотеатр");
        System.out.println("Фильм:\n"+movie);
        System.out.println("Зал:\n"+hall);
        System.out.println("Стоимость: "+cost);
        System.out.println();
    }



    public Ticket(Movie movie, Hall hall, int cost) {
        this.movie = movie;
        this.hall = hall;
        this.cost = cost;
    }

    public Movie getMovie() {
        return movie;
    }

    public Hall getHall() {
        return hall;
    }

    public int getCost() {
        return cost;
    }
}

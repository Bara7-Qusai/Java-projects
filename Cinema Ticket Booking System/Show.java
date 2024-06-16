import java.time.LocalDateTime;

public class Show {
    private Movie movie;
    private LocalDateTime showTime;
    private int availableTickets;

    public Show(Movie movie, LocalDateTime showTime, int availableTickets) {
        this.movie = movie;
        this.showTime = showTime;
        this.availableTickets = availableTickets;
    }

    public Movie getMovie() {
        return movie;
    }

    public LocalDateTime getShowTime() {
        return showTime;
    }

    public int getAvailableTickets() {
        return availableTickets;
    }

    public void bookTickets(int numberOfTickets) {
        if (numberOfTickets <= availableTickets) {
            availableTickets -= numberOfTickets;
        } else {
            System.out.println("Not enough tickets available.");
        }
    }

    @Override
    public String toString() {
        return "Movie: " + movie.getTitle() + ", Show Time: " + showTime + ", Available Tickets: " + availableTickets;
    }
}

public class Booking {
    private Show show;
    private int numberOfTickets;

    public Booking(Show show, int numberOfTickets) {
        this.show = show;
        this.numberOfTickets = numberOfTickets;
    }

    public Show getShow() {
        return show;
    }

    public int getNumberOfTickets() {
        return numberOfTickets;
    }

    @Override
    public String toString() {
        return "Movie: " + show.getMovie().getTitle() + ", Show Time: " + show.getShowTime() + ", Tickets: " + numberOfTickets;
    }
}￼Enter

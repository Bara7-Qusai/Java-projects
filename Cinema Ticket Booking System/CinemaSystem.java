import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class CinemaSystem {
    private static ArrayList<Movie> movies = new ArrayList<>();
    private static ArrayList<Show> shows = new ArrayList<>();
    private static ArrayList<Booking> bookings = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        // القائمة الرئيسية
        do {
            System.out.println("\nCinema Ticket Booking System");
            System.out.println("1. Add Movie");
            System.out.println("2. Add Show");
            System.out.println("3. Book Tickets");
            System.out.println("4. View Movies");
            System.out.println("5. View Shows");
            System.out.println("6. View Bookings");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    addShow();
                    break;
                case 3:
                    bookTickets();
                    break;
                case 4:
                    viewMovies();
                    break;
                case 5:
                    viewShows();
                    break;
                case 6:
                    viewBookings();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        } while (choice != 7);
    }

    private static void addMovie() {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter movie genre: ");
        String genre = scanner.nextLine();
        System.out.print("Enter movie duration (in minutes): ");
        int duration = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        Movie movie = new Movie(title, genre, duration);
        movies.add(movie);
        System.out.println("Movie added successfully.");
    }

    private static void addShow() {
        viewMovies();
        System.out.print("Enter movie title for the show: ");
        String title = scanner.nextLine();
        Movie movie = null;
        for (Movie m : movies) {
            if (m.getTitle().equalsIgnoreCase(title)) {
                movie = m;
                break;
            }
        }
        if (movie == null) {
            System.out.println("Movie not found.");
            return;
        }
        System.out.print("Enter show time (yyyy-MM-ddTHH:mm): ");
        String showTimeStr = scanner.nextLine();
        LocalDateTime showTime = LocalDateTime.parse(showTimeStr);
        System.out.print("Enter number of available tickets: ");
        int availableTickets = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        Show show = new Show(movie, showTime, availableTickets);
        shows.add(show);
        System.out.println("Show added successfully.");
    }

    private static void bookTickets() {
        viewShows();
        System.out.print("Enter show time for booking (yyyy-MM-ddTHH:mm): ");
        String showTimeStr = scanner.nextLine();
        LocalDateTime showTime = LocalDateTime.parse(showTimeStr);
        Show show = null;
        for (Show s : shows) {
            if (s.getShowTime().equals(showTime)) {
                show = s;
                break;
            }
        }
        if (show == null) {
            System.out.println("Show not found.");
            return;
        }
        System.out.print("Enter number of tickets to book: ");
        int numberOfTickets = scanner.nextInt();
        scanner.nextLine();  // Consume the newline
        if (numberOfTickets > show.getAvailableTickets()) {
            System.out.println("Not enough tickets available.");
            return;
        }
        show.bookTickets(numberOfTickets);
        Booking booking = new Booking(show, numberOfTickets);
        bookings.add(booking);
        System.out.println("Tickets booked successfully.");
    }

    private static void viewMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies available.");
        } else {
            System.out.println("Available Movies:");
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }

    private static void viewShows() {
        if (shows.isEmpty()) {
            System.out.println("No shows available.");
        } else {
            System.out.println("Available Shows:");
            for (Show show : shows) {
                System.out.println(show);
            }
        }
    }

    private static void viewBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings available.");
        } else {
            System.out.println("Bookings:");
            for (Booking booking : bookings) {
                System.out.println(booking);
            }
        }
    }
}

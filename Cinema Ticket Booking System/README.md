# Cinema Ticket Booking System

## Description
The Cinema Ticket Booking System is a Java-based application that allows users to manage movie screenings, book tickets, and view bookings. It demonstrates key concepts of object-oriented programming and data management in Java.

## Features
- **Add Movie**: Add new movies with title, genre, and duration.
- **Add Show**: Schedule shows for movies with a specified time and available tickets.
- **Book Tickets**: Book tickets for available shows.
- **View Movies**: Display a list of all available movies.
- **View Shows**: Display a list of all scheduled shows.
- **View Bookings**: Display a list of all bookings made.

## Components
### Movie Class
Represents a movie with the following attributes:
- `title`: The title of the movie.
- `genre`: The genre of the movie.
- `duration`: The duration of the movie in minutes.

### Show Class
Represents a show with the following attributes:
- `movie`: The movie being shown.
- `showTime`: The date and time of the show.
- `availableTickets`: The number of tickets available for the show.

### Booking Class
Represents a booking with the following attributes:
- `show`: The show being booked.
- `numberOfTickets`: The number of tickets booked.

### CinemaSystem Class
Provides the main interface for interacting with the system:
- **addMovie()**: Prompts the user to enter movie details and adds the movie to the system.
- **addShow()**: Prompts the user to enter show details and schedules the show.
- **bookTickets()**: Prompts the user to enter booking details and books tickets for a show.
- **viewMovies()**: Displays all movies in the system.
- **viewShows()**: Displays all shows in the system.
- **viewBookings()**: Displays all bookings in the system.


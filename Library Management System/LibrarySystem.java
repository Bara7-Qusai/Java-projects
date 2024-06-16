import java.util.HashMap;
import java.util.Scanner;

public class LibrarySystem {
    private static HashMap<String, Book> books = new HashMap<>();
    private static HashMap<String, Member> members = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        // Main menu
        do {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. List Borrowed Books");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume the newline

            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    addMember();
                    break;
                case 3:
                    borrowBook();
                    break;
                case 4:
                    returnBook();
                    break;
                case 5:
                    listBorrowedBooks();
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 6.");
            }
        } while (choice != 6);
    }

    private static void addBook() {
        System.out.print("Enter book ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book category: ");
        String category = scanner.nextLine();
        Book book = new Book(id, title, author, category);
        books.put(id, book);
        System.out.println("Book added successfully.");
    }

    private static void addMember() {
        System.out.print("Enter member ID: ");
        String memberId = scanner.nextLine();
        System.out.print("Enter member name: ");
        String name = scanner.nextLine();
        Member member = new Member(memberId, name);
        members.put(memberId, member);
        System.out.println("Member added successfully.");
    }

    private static void borrowBook() {
        System.out.print("Enter member ID: ");
        String memberId = scanner.nextLine();
        Member member = members.get(memberId);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }
        System.out.print("Enter book ID: ");
        String bookId = scanner.nextLine();
        Book book = books.get(bookId);
        if (book == null) {
            System.out.println("Book not found.");
        } else if (book.isBorrowed()) {
            System.out.println("Book is already borrowed.");
        } else {
            member.borrowBook(book);
            System.out.println("Book borrowed successfully.");
        }
    }

    private static void returnBook() {
        System.out.print("Enter member ID: ");
        String memberId = scanner.nextLine();
        Member member = members.get(memberId);
        if (member == null) {
            System.out.println("Member not found.");
            return;
        }
        System.out.print("Enter book ID: ");
        String bookId = scanner.nextLine();
        Book book = books.get(bookId);
        if (book == null) {
            System.out.println("Book not found.");
        } else {
            member.returnBook(book);
            System.out.println("Book returned successfully.");
        }
    }

    private static void listBorrowedBooks() {
        System.out.print("Enter member ID: ");
        String memberId = scanner.nextLine();
        Member member = members.get(memberId);
        if (member == null) {
            System.out.println("Member not found.");
        } else {
            member.listBorrowedBooks();
        }
    }
}

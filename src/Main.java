import java.util.Arrays;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book1 = new Book("Title-1", "Author-1", getId(), true);
        Book book2 = new Book("Title-2", "Author-2", getId(), true);
        Book book3 = new Book("Title-3", "Author-3", getId(), true);
        Book book4 = new Book("Title-4", "Author-4", getId(), true);

        Library library = new Library(Arrays.asList(book1, book2, book3, book4));

        displayHelp();
        System.out.println("Enter command please...");

        String command = scanner.nextLine();

        while (!command.equals("exit")) {
            if (command.equals("list")) {
                library.showAvailableBooks();
            } else if (command.equals("add")) {
                System.out.println("Enter book title:\n");
                String title = scanner.nextLine();
                System.out.println("Enter book author:\n");
                String author = scanner.nextLine();
                library.addBook(new Book(title, author, getId(), true));
            } else if (command.matches("^find\\b.*")) {
                Book myBoock = library.findBookByTitle(command.toLowerCase().substring(5));
                if (myBoock != null) {
                    System.out.println(library.logBook(myBoock));
                }
            } else if (command.matches("^borrow\\b.*")) {
                library.borrowBook(command.toLowerCase().substring(7));
            } else if (command.matches("^return\\b.*")) {
                library.returnBook(command.toLowerCase().substring(7));
            } else if (command.equals("all-list")) {
                library.showAllBooks();
            } else if (command.equals("help")) {
                displayHelp();
            } else {
                System.out.println("Invalid command. Try again.");
                command = scanner.nextLine();
                continue;
            }

            System.out.println("Enter command please...");
            command = scanner.nextLine();
        }
        System.out.println("Thank you for using our library!");
        scanner.close();
    }

    static String getId() {
        return UUID.randomUUID().toString();
    }
    static void displayHelp() {
        System.out.println(
                """
                        Commands list:
                        help - list of commands
                        list - show available books
                        all-list - show all books
                        add - add new book
                        borrow [book tile] - borrow a book
                        return [book tile] - return a book
                        find [book tile] - find a book
                        """
        );
    }
}
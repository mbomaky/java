import java.util.ArrayList;
import java.util.List;

class Library {
    private final ArrayList<Book> books;

    public Library(List<Book> books) {
        this.books = new ArrayList<>(books);
    }

    public void addBook(Book book) {
        this.books.add(book);
        System.out.println(logBook(book));
        System.out.println("Book added successfully!\n");
    }

    public String logBook(Book book) {
        return "Book{" +
                "title='" + book.getTitle() + '\'' +
                ", author='" + book.getAuthor() + '\'' +
                ", isbn='" + book.getIsbn() + '\'' +
                ", isAvailable=" + book.isAvailable() +
                '}';
    }

    public Book findBookByTitle(String title) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                return book;
            }
        }
        System.out.println("Book not found\n");
        return null;
    }

    public void borrowBook(String title) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                if (book.isAvailable()) {
                    book.setAvailable(false);
                    System.out.println("Book borrowed\n");
                    return;
                }
                System.out.println("This book is borrowed, try another book\n");
                return;
            }
        }
        System.out.println("Wrong book name\n");
    }

    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                if (!book.isAvailable()) {
                    book.setAvailable(true);
                    System.out.println("Book returned\n");
                    return;
                }
                System.out.println("This book is returned, try another book\n");
                return;
            }
        }
        System.out.println("Wrong book name\n");
    }

    public void showAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println(book);
                return;
            }
        }
        System.out.println("No available books right now.\n");
    }

    public void showAllBooks() {
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
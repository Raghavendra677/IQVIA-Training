package Day6;


class BookNotFoundException extends Exception {
    public BookNotFoundException(String message) {
        super(message);
    }
}

class Library {
    public static void findBook(String bookId) throws BookNotFoundException {
        if (!"101".equals(bookId)) {
            throw new BookNotFoundException("Book with ID " + bookId + " not found.");
        }
        System.out.println("Book Found: Java Programming");
    }
}

public class CustomChecked{
    public static void main(String[] args) {
        try {
            Library.findBook("102");
        } catch (BookNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

}

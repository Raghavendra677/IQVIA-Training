package Day5;


import java.util.*;

class Book {
    String id;
    String title;
    String author;

    Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "[" + id + "] " + title + " by " + author;
    }
}

public class SimpleLibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("\n---Library Menu---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search by Title");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            String input = sc.nextLine().trim();

            switch (input) {
                case "1": {
                    System.out.print("Enter Book ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();
                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();
                    books.add(new Book(id, title, author));
                    System.out.println("Book added!");
                    break;
                }
                case "2": {
                    if (books.isEmpty()) {
                        System.out.println("No books available.");
                    } else {
                        System.out.println("\nBooks in Library:");
                        for (Book b : books) {
                            System.out.println(b);
                        }
                    }
                    break;
                }
                case "3": {
                    System.out.print("Enter title to search: ");
                    String query = sc.nextLine().toLowerCase();
                    List<Book> results = new ArrayList<>();
                    for (Book b : books) {
                        if (b.title.toLowerCase().contains(query)) {
                            results.add(b);
                        }
                    }
                    if (results.isEmpty()) {
                        System.out.println("No matching books found.");
                    } else {
                        System.out.println("\nSearch Results:");
                        for (Book b : results) {
                            System.out.println(b);
                        }
                    }
                    break;
                }
                case "4": {
                    System.out.println("Exiting...");
                    sc.close();
                    return;
                }
                default: {
                    System.out.println("Invalid choice.");
                    break;
                }
            }
        }
    }

}

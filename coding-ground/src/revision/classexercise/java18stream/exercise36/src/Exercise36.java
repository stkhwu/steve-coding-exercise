package revision.classexercise.java18stream.exercise36.src;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


/**
 * Exercise: Deal with common data structures, using stream flatmap() to restructure the data
 */
/**
 * Expected Output:
 * Writer: Susan
 * Writer: Tracy
 * Book Name: Book A, Book Price: 34.9
 * Book Name: Book B, Book Price: 78.9
 * Book Name: Book C, Book Price: 104.9
 * Book Name: Book D, Book Price: 449.9
 * The Most Expensive Book: Name=Book D, Price=449.9
 */
// Implement Book class
// Code here ...
class Book {
    private double price;
    private String name;

    Book(double price, String name) {
        this.price = price;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}

// Implement Wrtier Class
// Code here ...
class Writer {
    private String name;
    private List<Book> books;

    Writer(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public String getName() {
        return this.name;
    }

}

// Implement a Comparator to compare the book price
// Code here ...

public class Exercise36 {
    public static void main(String[] args) {
        // Create Books1 and Writer1
        List<Book> books = Arrays.asList(new Book(34.9, "Book A"), new Book(78.9, "Book B"));
        Writer w1 = new Writer("Susan", books);

        // Create Books2 and Writer2
        books = Arrays.asList(new Book(104.9, "Book C"), new Book(449.9, "Book D"));
        // List<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 3));
        // integers.add(2);
        // System.out.println(integers);

        Writer w2 = new Writer("Tracy", books);

        List<Writer> writers = Arrays.asList(w1, w2);
        // Print all Writers names
        // Code here ...
        writers.forEach(e -> System.out.println("Writer: " + e.getName()));

        // Use flatMap method to return all books written by our writers, storing in a
        // List<Book>
        // Just return the Books!
        // Code here ...
        List<Book> onlyBooks = writers.stream()
                .flatMap(e -> e.getBooks().stream()).toList();

        // Print out all books' Name and Price.
        // Code here
        onlyBooks.forEach(e -> System.out.println("Book Name: "+ e.getName() + ", Book Price: "+ e.getPrice()));

        // Create Comparator for stream max() method use, aims to find the most
        Comparator<Book> maxPrice = (x, y) -> {
        return x.getPrice() > y.getPrice() ? 1 : x.getPrice() == y.getPrice() ? 0 : -1;
    };
        // expensive book
        // Book maxPriceBook = ...
        Book maxPriceBook = onlyBooks.stream().max(maxPrice).orElseThrow();
        // Print out the most expensive book
        System.out.println("The Most Expensive Book: Name=" + maxPriceBook.getName() + ", Price=" + maxPriceBook.getPrice());
    }
}

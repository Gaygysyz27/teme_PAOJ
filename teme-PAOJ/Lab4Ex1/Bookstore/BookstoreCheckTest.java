package Lab4Ex1.Bookstore;

import java.util.ArrayList;
import java.util.List;

public class BookstoreCheckTest {
    public static void main(String[] args) {
        // Creare lista de carti pentru test
        List<Book> books = new ArrayList<>();
        
        Book book1 = new Book("Java Programming", "John Doe", "Tech Books", 500);
        Book book2 = new Book("Java Programming", "John Doe", "Tech Books", 600);
        Book book3 = new Book("Python Basics", "Jane Smith", "Code Press", 300);
        
        books.add(book1);
        books.add(book2);
        books.add(book3);
        
        BookstoreCheck checker = new BookstoreCheck(books);
        
        // Test pentru verificarea dublurilor
        System.out.println("Test pentru verificarea dublurilor:");
        System.out.println("Cartea 1 este in dublu exemplar? " + checker.isDuplicate(book1));
        System.out.println("Cartea 3 este in dublu exemplar? " + checker.isDuplicate(book3));
        
        // Test pentru verificarea cartii mai groase
        System.out.println("\nTest pentru verificarea cartii mai groase:");
        Book thickerBook = checker.getThickerBook(book1, book2);
        System.out.println("Cartea mai groasa este: " + thickerBook.getTitle() + 
                          " cu " + thickerBook.getPageCount() + " pagini");
    }
} 
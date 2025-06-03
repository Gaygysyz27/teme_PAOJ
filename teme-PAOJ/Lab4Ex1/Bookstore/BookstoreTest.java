package Lab4Ex1.Bookstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookstoreTest {
    private List<Book> books;
    private Scanner scanner;
    
    public BookstoreTest() {
        books = new ArrayList<>();
        scanner = new Scanner(System.in);
    }
    
    // Create
    public void addBook() {
        System.out.println("Introduceti detaliile cartii:");
        System.out.print("Titlu: ");
        String title = scanner.nextLine();
        System.out.print("Autor: ");
        String author = scanner.nextLine();
        System.out.print("Editura: ");
        String publisher = scanner.nextLine();
        System.out.print("Numar pagini: ");
        int pageCount = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        try {
            Book book = new Book(title, author, publisher, pageCount);
            books.add(book);
            System.out.println("Carte adaugata cu succes!");
        } catch (IllegalArgumentException e) {
            System.out.println("Eroare: " + e.getMessage());
        }
    }
    
    // Read
    public void displayAllBooks() {
        if (books.isEmpty()) {
            System.out.println("Nu exista carti in biblioteca.");
            return;
        }
        
        for (int i = 0; i < books.size(); i++) {
            System.out.println("\nCarte #" + (i + 1));
            System.out.println(books.get(i));
        }
    }
    
    // Update
    public void updateBook() {
        if (books.isEmpty()) {
            System.out.println("Nu exista carti in biblioteca.");
            return;
        }
        
        displayAllBooks();
        System.out.print("Introduceti numarul cartii de actualizat: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline
        
        if (index < 0 || index >= books.size()) {
            System.out.println("Index invalid!");
            return;
        }
        
        Book book = books.get(index);
        System.out.println("Introduceti noile detalii (apasati Enter pentru a pastra valoarea curenta):");
        
        System.out.print("Titlu [" + book.getTitle() + "]: ");
        String title = scanner.nextLine();
        if (!title.isEmpty()) book.setTitle(title);
        
        System.out.print("Autor [" + book.getAuthor() + "]: ");
        String author = scanner.nextLine();
        if (!author.isEmpty()) book.setAuthor(author);
        
        System.out.print("Editura [" + book.getPublisher() + "]: ");
        String publisher = scanner.nextLine();
        if (!publisher.isEmpty()) book.setPublisher(publisher);
        
        System.out.print("Numar pagini [" + book.getPageCount() + "]: ");
        String pageCountStr = scanner.nextLine();
        if (!pageCountStr.isEmpty()) {
            try {
                book.setPageCount(Integer.parseInt(pageCountStr));
            } catch (NumberFormatException e) {
                System.out.println("Numar invalid de pagini!");
            }
        }
        
        System.out.println("Carte actualizata cu succes!");
    }
    
    // Delete
    public void deleteBook() {
        if (books.isEmpty()) {
            System.out.println("Nu exista carti in biblioteca.");
            return;
        }
        
        displayAllBooks();
        System.out.print("Introduceti numarul cartii de sters: ");
        int index = scanner.nextInt() - 1;
        scanner.nextLine(); // Consume newline
        
        if (index < 0 || index >= books.size()) {
            System.out.println("Index invalid!");
            return;
        }
        
        books.remove(index);
        System.out.println("Carte stearsa cu succes!");
    }
    
    public void close() {
        scanner.close();
    }
} 
package Lab4Ex1.Bookstore;

import java.util.List;

public class BookstoreCheck {
    private List<Book> books;
    
    public BookstoreCheck(List<Book> books) {
        this.books = books;
    }
    
    // Verifica daca o carte este in dublu exemplar
    public boolean isDuplicate(Book book) {
        int count = 0;
        for (Book b : books) {
            if (b.getTitle().equals(book.getTitle()) && 
                b.getAuthor().equals(book.getAuthor()) && 
                b.getPublisher().equals(book.getPublisher())) {
                count++;
                if (count > 1) return true;
            }
        }
        return false;
    }
    
    // Returneaza cartea mai groasa dintre doua carti
    public Book getThickerBook(Book book1, Book book2) {
        return book1.getPageCount() > book2.getPageCount() ? book1 : book2;
    }
} 
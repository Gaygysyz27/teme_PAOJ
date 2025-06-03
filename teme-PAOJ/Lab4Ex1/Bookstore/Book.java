package Lab4Ex1.Bookstore;

public class Book {
    private String title;
    private String author;
    private String publisher;
    private int pageCount;
    
    public Book(String title, String author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }
    
    // Getters and setters
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getPublisher() {
        return publisher;
    }
    
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    
    public int getPageCount() {
        return pageCount;
    }
    
    public void setPageCount(int pageCount) {
        if (pageCount > 0) {
            this.pageCount = pageCount;
        } else {
            throw new IllegalArgumentException("Numarul de pagini trebuie sa fie mai mare decat 0");
        }
    }
    
    @Override
    public String toString() {
        return "BOOK_TITLE: " + title.toUpperCase() + "\n" +
               "BOOK_AUTHOR: " + author + "\n" +
               "BOOK_PUBLISHER: " + publisher.toLowerCase();
    }
} 
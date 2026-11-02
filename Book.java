
public class Book {
   
    private String title;
    private String author;
    private String isbn;
    private double price;

    
    public Book(String title, String author, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        setPrice(price); 
    }


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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPrice() {
        return price;
    }

  
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Error: Price cannot be negative. Retaining current price.");
        }
    }

   
    public void applyDiscount(double percent) {
        if (percent > 0 && percent <= 100) {
            this.price -= this.price * (percent / 100.0);
        } else {
            System.out.println("Invalid discount percentage.");
        }
    }

  
    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
      
        System.out.printf("Price: PHP %.2f%n", price);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Book book1 = new Book("Noli Me Tangere", "Jose Rizal", "ISBN-001", 350.00);
        Book book2 = new Book("El Filibusterismo", "Jose Rizal", "ISBN-002", 320.00);
        EBook book3 = new EBook("Florante at Laura", "Francisco Balagtas", "ISBN-003", 150.00, "PDF");

      
        Book[] library = { book1, book2, book3 };

        System.out.println("===== BOOK INFORMATION =====");
        for (Book b : library) {
            if (!(b instanceof EBook)) {
                b.displayInfo();
                System.out.println();
            }
        }

        System.out.println("===== E-BOOK =====");
        for (Book b : library) {
            if (b instanceof EBook) {
                b.displayInfo();
                System.out.println();
            }
        }

        
        book2.setPrice(299.50);

        System.out.println("===== UPDATED INFORMATION =====");
        System.out.println("Title: " + book2.getTitle());
        System.out.printf("Price: PHP %.2f%n", book2.getPrice());
    }
}


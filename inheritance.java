class Book {
    String title;
    String author;
    double price;

    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }
}

class FictionBook extends Book {
    String genre;

    FictionBook(String title, String author, double price, String genre) {
        super(title, author, price);
        this.genre = genre;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Genre: " + genre);
    }
}

class ReferenceBook extends Book {
    String subject;

    ReferenceBook(String title, String author, double price, String subject) {
        super(title, author, price);
        this.subject = subject;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}

public class inheritance {
    public static void main(String[] args) {
        FictionBook fiction = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", 10.99, "Novel");

        ReferenceBook reference = new ReferenceBook("Introduction to Algorithms", "Thomas H. Cormen", 79.99, "Computer Science");

        System.out.println("Fiction Book Details:");
        fiction.displayDetails();

        System.out.println("\nReference Book Details:");
        reference.displayDetails();
    }
}

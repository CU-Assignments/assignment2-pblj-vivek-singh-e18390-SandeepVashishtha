class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Fiction Book Details:");
        super.displayDetails();
    }
}

class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Non-Fiction Book Details:");
        super.displayDetails();
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("Harry Potter", "J.K. Rowling", 500);
        NonFiction nonFictionBook = new NonFiction("Sapiens", "Yuval Noah Harari", 700);

        fictionBook.displayDetails();
        System.out.println();
        nonFictionBook.displayDetails();
    }
}
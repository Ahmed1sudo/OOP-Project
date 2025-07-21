public class Task3 {

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics", "John Smith", 150);
        Book b2 = new Book("Python Guide", "Sarah Lee");

        b1.displayInfo();
        b2.displayInfo();
    }
}

class Book {
    String title;
    String author;
    int price;

    // الكتاب الأول
    Book(String t, String a, int p) {
        title = t;
        author = a;
        price = p;
    }

    // الكتاب الثاني
    Book(String t, String a) {
        title = t;
        author = a;
        price = 100;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

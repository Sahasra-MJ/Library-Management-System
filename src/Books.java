public class Books {
    int ISBN;
    String title;
    String author;
    int year;

    Books(int ISBN, String title, String author, int year) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.year = year;
    }

    void display() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Year: " + year);
        System.out.println("--------------------");
    }
}

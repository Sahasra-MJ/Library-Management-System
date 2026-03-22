import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Service service = new Service();

        while(true){
            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Delete Book");
            System.out.println("4. Update Book");
            System.out.println("5. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    System.out.print("Enter ISBN: ");
                    int isbn = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Title: ");
                    String title = sc.nextLine();

                    System.out.print("Enter Author: ");
                    String author = sc.nextLine();

                    System.out.print("Enter Year: ");
                    int year = sc.nextInt();

                    service.AddBook(new Books(isbn, title, author,year));
                    break;

                case 2:
                    service.DisplayBooks();
                    break;

                case 3:
                    System.out.print("Enter ISBN to delete: ");
                    int delIsbn = sc.nextInt();
                    service.DeleteBook(delIsbn);
                    break;

                case 4:
                    System.out.print("Enter ISBN to update: ");
                    int upIsbn = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter New Title: ");
                    String newTitle = sc.nextLine();

                    System.out.print("Enter New Author: ");
                    String newAuthor = sc.nextLine();

                    System.out.print("Enter New Year: ");
                    int newYear = sc.nextInt();

                    service.UpdateBook(new Books(upIsbn, newTitle, newAuthor,newYear));
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
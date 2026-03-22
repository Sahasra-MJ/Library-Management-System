import java.util.ArrayList;

public class Service {
    ArrayList<Books> list = new ArrayList<>();

    void AddBook(Books b){
        list.add(b);
    }

    void DeleteBook(int ISBN) {
        list.removeIf(b -> b.ISBN == ISBN);
    }

    void UpdateBook(Books b){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).ISBN == b.ISBN){
                list.set(i, b);
                System.out.println("Book Updated!");
                return;
            }
        }
        System.out.println("Book not found!");
    }

    void DisplayBooks() {
        for(Books b : list){
            b.display();
        }
    }
}
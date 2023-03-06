import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookCloset {
    private List<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
    }

    public void removeBook() {
        System.out.println("Введите название книги для удаления");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.size(); i++) {
            if (bookList.get(i).getName().equals(name)) {
                bookList.remove(i);
            }
        }
    }


    public void findBook(){
        System.out.println("Введите название, автора, или жанр");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        for (int i = 0; i < bookList.size(); i++){
            if (bookList.get(i).getName().equals(name)||bookList.get(i).getAuthor().equals(name)||bookList.get(i).getGenre().equals(name)) {
                System.out.println(bookList.get(i));
            }
        }
    }
    public int getCountBook(){
        return bookList.size();
    }


    @Override
    public String toString() {
        return "Книжный шкаф" +
                bookList;
    }

}

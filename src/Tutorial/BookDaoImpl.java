package Tutorial;

import java.util.ArrayList;
import java.util.List;

public class BookDaoImpl implements BookDao{

    //list is working as a database
    private List<Books> books;

    public BookDaoImpl(){
        books = new ArrayList<>();
        books.add(new Books(1, "Java"));
        books.add(new Books(2,"Python"));
        books.add(new Books(3, "Android"));
    }

    @Override
    public List<Books> getAllBooks() {
        return null;
    }

    @Override
    public Books getBookByIsbn(int isbn) {
        return null;
    }

    @Override
    public void saveBook(Books book) {

    }

    @Override
    public void deleteBook(Books book) {

    }
}

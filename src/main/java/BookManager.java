import java.util.ArrayList;
import java.util.Optional;

public class BookManager{
  
  private ArrayList<Book> books = new ArrayList<Book>();
  
  public void addBook(Book book){
    books.add(book);
  }  
  public void removeBook(String bookTitle){
      Optional<Book> bookToRemove = books.stream()
      .filter(x -> x.title.equals(bookTitle))
      .findFirst();
    bookToRemove.ifPresent(books::remove);

  }
  
  public ArrayList<Book> getBook(){
    return books;
  }
}
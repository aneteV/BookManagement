/*
Develop a simple book management application with ArrayList.
User should be able to add a book to ArrayList.
User should be able to remove a book from ArrayList.

Easy: Work with String in ArrayList. All the actions should be available for user.

Medium: Work with String User should be able to repeat all the actions infinitely.

Hard: Create a Book class and work with Book object to the ArrayList.
*/
import java.util.Scanner;

public class Main {
  public static BookManager bookManager = new BookManager();
  public static void main(String[] args) {

    /*
    Book book1 = new Book("Harry Potter", "J.K. Rowling", 1997, 500);
    Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937, 310);
    bookManager.addBook(book1);
    bookManager.addBook(book2);
    */

    while(true){
      Scanner scanner = new Scanner(System.in);
      System.out.println("\nPress 1 to show book list");
      System.out.println("Press 2 to add book to the list");
      System.out.println("Press 3 to remove book from the list");
      System.out.println("Press x to exit");
      String userInput = scanner.nextLine();
      
      if(userInput.equals("1")){
        showBookList();
        
      } else if (userInput.equals("2")){
        createBook();
        
      } else if (userInput.equals("3")){
        System.out.println("What book do you want to remove?");
        String bookTitle= scanner.nextLine();
        bookManager.removeBook(bookTitle);
        
      } else if (userInput.equals("x")){
        break;
      }
    }
    
  }
  public static void showBookList(){
    var books = bookManager.getBook();
    for(Book book:books){
      System.out.println();
      System.out.println("Title: " + book.title);
      System.out.println("Author: " + book.author);
      System.out.println("Year: " + book.year);
      System.out.println("Pages: " + book.pages);
      
    }
  }

  public static void createBook(){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter book title: ");
    String title = scanner.nextLine();
    System.out.println("Enter book author: ");
    String author = scanner.nextLine();
    System.out.println("Enter year of publishing: ");
    int year = scanner.nextInt();
    System.out.println("Enter no of pages: ");
    int pages = scanner.nextInt();
    Book book = new Book(title, author, year, pages);
    bookManager.addBook(book);
  }

  

}
public class BookList implements Serializable
{
  private ArrayList<Book> books;

  public BookList()
  {
    books = new ArrayList<>();
  }

  public void addBook(Book book)
  {
    this.books.add(book);
  }

  public void removeBook(Book book)
  {
    this.books.remove(book);
  }

  public ArrayList<Book> getAllBooks()
  {
    return books;
  }
  }
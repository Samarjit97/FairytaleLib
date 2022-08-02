import java.util.Objects;

public class Book extends Items
{
  private int isbn;

  public Book( int isbn, String title, String author){
    super(title, author);
    this.isbn=isbn;

  }

  public int getIsbn()
  {
    return isbn;
  }

  public void setIsbn(int isbn)
  {
    this.isbn = isbn;
  }

  @Override
  public String toString() {
    return super.toString() + ", ISBN: " + isbn ;

  }

  @Override public boolean equals(Object o)
  {
    if (!(o instanceof Objects))
      return false;
    if (!super.equals(o))
      return false;

    Book book = (Book) o;
    return isbn == book.isbn;
  }


}

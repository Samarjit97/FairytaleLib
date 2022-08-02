import java.util.Objects;

public class Date
{
  private int day;
  private int month;
  private int year;

  public Date( int day, int month, int year){
    this.day=day;
    this.month=month;
    this.year=year;
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
  }

  public void set(int day, int month, int year)
  {
    this.day = day;
    this.month=month;
    this.year=year;
  }

  @Override public String toString()
  {
    return  "Day: = " + day + ", Month: = " + month + ", Year: = " + year ;
  }

  @Override public boolean equals(Object o)
  {
    if (!(o instanceof Objects))

      return false;
    Date date = (Date) o;
    return day == date.day && month == date.month && year == date.year;
  }


}

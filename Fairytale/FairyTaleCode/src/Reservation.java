import java.util.ArrayList;
import java.util.Objects;

public class Reservation
{
  private Date startDate;
  private Date endDate;
  private ArrayList<Items> items;

  public Reservation( Date startDate, Date endDate){
    this.startDate=startDate;
    this.endDate=endDate;
    items=new ArrayList<Items>();


  }

  public void addItem(Items item) {
    items.add(item);
  }
  public void getItem(int index){
    items.get(index);
  }

  public Date getStartDate()
  {
    return startDate;
  }

  public Date getEndDate()
  {
    return endDate;
  }




  public void setStartDate(Date startDate)
  {
    this.startDate = startDate;
  }

  public void setEndDate(Date endDate)
  {
    this.endDate = endDate;
  }

  @Override public boolean equals(Object o)
  {
    if ( !( o instanceof Objects))

      return false;
    Reservation that = (Reservation) o;
    return Objects.equals(startDate, that.startDate) && Objects.equals(endDate,
        that.endDate);
  }

  @Override
  public String toString() {
    return "Start from: "+ startDate + "" +
            ", Deadline: "+ endDate +
            ", ItemsName: "+ items;
  }
}

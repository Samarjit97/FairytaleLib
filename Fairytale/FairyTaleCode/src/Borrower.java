import java.util.ArrayList;
import java.util.Objects;

public class Borrower
{
  private String name;
  private String emailId;
  private int phoneNumber;
  private String role;
  private ArrayList<Reservation> reservations;

  public Borrower( String name, String emailId, int phoneNumber, String role){
    this.name=name;
    this.emailId=emailId;
    this.phoneNumber=phoneNumber;
    this.role=role;
    reservations=new ArrayList<Reservation>();
  }





  public String getName()
  {
    return name;
  }

  public String getEmailId()
  {
    return emailId;
  }

  public String getRole()
  {
    return role;
  }





  public void set(String name, String emailId, String role, int phoneNumber)
  {
    this.name = name;
    this.emailId=emailId;
    this.phoneNumber=phoneNumber;
    this.role=role;
  }

  public void addItem(Reservation reservation){
    reservations.add(reservation);
  }

  public void removeItem(Reservation reservation){
    reservations.remove(reservation);
  }
  public void removeItem(int index){
    reservations.remove(index);

  }
  public Reservation getItem(int index){
    return reservations.get(index);

  }

  public Reservation[] getAllBookedItems(){
    Reservation[] allBookedItems=new Reservation[reservations.size()];
    return reservations.toArray(allBookedItems);

  }

  @Override public String toString()
  {
    return "Borrower{" + "name='" + name + '\'' + ", emailId='" + emailId + '\''
        + ", phoneNumber=" + phoneNumber + ", role='" + role + '\'' +  '}';
  }

  @Override public boolean equals(Object o)
  {
    if (!(o instanceof Objects))
      return false;
    Borrower borrower = (Borrower) o;
    return phoneNumber == borrower.phoneNumber && Objects.equals(name,
        borrower.name) && Objects.equals(emailId, borrower.emailId)
        && Objects.equals(role, borrower.role);
  }


}

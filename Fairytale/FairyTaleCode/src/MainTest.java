import java.util.Arrays;

public class MainTest {
    public static void main(String[] args) {
      /*  Items items=new Items("samanjit", "singh");
        items=new Book(1387873,"YO BABY","SINGH");
        items=new Article("Plural","Yo Baby", "Singh");

        System.out.println(items.toString());
        */



  /*
        Date startDate=new Date(12,10,2022);
        Date EndDate=new Date(23,12,2022);
        Date one=new Date(1,1,2022);
        Date two=new Date(2,2,2022);
        Items items1=new Items("samanjit","singh");
        Items items2=new Items("singh","samanjit");




        Reservation reservation=new Reservation(startDate,EndDate);
        reservation.addItem(items1);
        reservation.addItem(items2);

        Reservation reservation2=new Reservation(one,two);
        reservation2.addItem(items1);
        reservation2.addItem(items2);

        System.out.println(reservation.toString());
        System.out.println(reservation2.toString());

       */

        Date startDate=new Date(12,10,2022);
        Date EndDate=new Date(23,12,2022);
        Date one=new Date(1,1,2022);
        Date two=new Date(2,2,2022);
        Items items1=new Items("samanjit","singh");
        Items items2=new Items("singh","samanjit");




        Reservation reservation1=new Reservation(startDate,EndDate);
        reservation1.addItem(items1);
        Reservation reservation2=new Reservation(startDate,EndDate);
        reservation1.addItem(items1);
        reservation2.addItem(items2);

        Borrower borrower=new Borrower("DAVID","dAVID@YAHHO",637744,"Teacher");
        borrower.addItem(reservation1);
        borrower.addItem(reservation2);
        System.out.println(borrower.toString());
        System.out.println(Arrays.toString(borrower.getAllBookedItems()));



    }
}

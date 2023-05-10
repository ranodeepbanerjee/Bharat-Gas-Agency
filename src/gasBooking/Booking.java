package gasBooking;
import Customers.*;
import java.util.Date;
import java.security.PublicKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class Booking extends GasConnection{
    public  double otp=5678, amount=825.0, refund=0;

    public String dt, delDate,status,Status,DelMobileNo="7805213455";
    public Date dt_1,dt_2;
    public Booking(String name, String street, String area, String pincode, String mobile, int numberOfCylinder) {
        super(name, street, area, pincode, mobile,numberOfCylinder);
    }
    public void getDates() {
        System.out.println("Enter booking date: ");
        dt = new Scanner(System.in).nextLine(); //next is when one thing
        dt_1 = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/mm/yyyy");
        try {
            dt_1 = dateFormat.parse(dt);
        } catch (Exception e) {
            System.out.println("The error in getDate function: " + e);
        }

        //delivery details
        System.out.println("Enter Delivery Date: ");
        delDate = new Scanner(System.in).nextLine();
        try {
            dt_2 = dateFormat.parse(delDate);

        } catch (Exception e) {
            System.out.println("Error parsing date dt_2" + e);
        }

        //find the difference between two dates
        try {
            long difference = dt_2.getTime() - dt_1.getTime();

            //difference in days
            long newDifference = TimeUnit.DAYS.convert(difference, TimeUnit.MILLISECONDS);
            if (newDifference > 7) { //check difference
                status = "P";      //pending status
            }
        } catch (Exception e) {
            System.out.println("Error while finding difference: " + e);
        }

    }

    public void validate() {
        //get the difference between two dates
        long elapses=dt_1.getTime() - lastDate.getTime();
        long diff=TimeUnit.DAYS.convert(elapses,TimeUnit.MILLISECONDS);

        //print difference
        System.out.println("difference between two dates is: "+diff);
        if (numberOfCylinder==1) { //check for single cylinder
            //for single cylinder
            if(diff < 30) {
                System.out.println("Booking can not be done.");
                //numberOfCylinder=0;
                status="C";
            }else{
                //diff>30

                status="B"; //status booked.
                lastDate=dt_1; //current booking date will became the last booking date.
            }
        } else if (numberOfCylinder==2) {

            if(diff < 50) {
                System.out.println("booking cannot be done.");
                //numberOfCylinders=0;
                status="C";

            }
            else
            {

                status="B"; //booked
                lastDate=dt_1;
            }
        }
    }
}

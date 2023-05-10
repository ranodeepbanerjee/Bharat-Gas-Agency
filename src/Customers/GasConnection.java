package Customers;

import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.*;
public class GasConnection extends Customer{
    public int numberOfCylinder;
    String date;
    static int connectionNumber=100;  // static used for without creating instance of class
    {
        connectionNumber+=1;
    }
    public Date lastDate=null;

    SimpleDateFormat dateFormat=new SimpleDateFormat(  "dd/mm/yyyy");

    public GasConnection(String name, String street, String area, String pincode, String mobile, int numberOfCylinder) {
        super(name, street, area, pincode, mobile);
        this.numberOfCylinder = numberOfCylinder;
    }
    public void getLastDate(){
        System.out.println("Enter the last Date");
        date=new Scanner(System.in).nextLine();
        try{
            lastDate=dateFormat.parse(date);
        }
        catch(Exception e) {
            System.out.println("error in getLastDate: "+ e);

        }
    }
}

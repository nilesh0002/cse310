import java.util.Date;
import java.util.Calendar;
public class main1 {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        Calendar obj = Calendar.getInstance();
        System.out.println(obj);
        
    }
}   

// can we directly print object .. toString method called ..
// if we override toString method then it will print the value which we want to print otherwise 
// it will print the reference of the object .. 


// date is class but caendar is interface .. we cannot create object of interface .. 
// we can create reference of interface -- we use get instance method to create object of calendar class ..
//but from calendar class we can get date, time and other details ..
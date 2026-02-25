package unit2.feb11;
import java.util.Scanner;

public class en {
    enum day{  //enum is used to store fixed set of constant value
        mon,tue,wed,thu,fri,sat,sun
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        day d=day.mon;
        d =day.tue;
        d=day.valueOf(sc.next().toUpperCase());
        System.out.println(d);
    }

    

}

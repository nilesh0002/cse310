package feb4;
import java.util.*;
public class conditional {
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        // if(x<0){System.out.println("wrong Input");}
        // else if(x>=18){
        //     System.out.println("Eligible");
        //     if(x<=45){System.out.println("Young");}
        //     else{System.out.println("Old");}
        // }
        // else{System.out.println("not Eligible");}



        // Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        // switch (x-5+1) {
        //     case 1:
        //         System.out.println("Case 1");
        //         break;
        //     case 2:
        //         System.out.println("Case 2");
        //         break;
        
        //     default:
        //         System.out.println("not having option");
        //         break;
        // }

        
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        switch (x%2) { // switch have expretion also and case will check for result..
            // case 0:
            //     System.out.println("even");
            //     break;
            // case 1:
            //     System.out.println("odd");
            //     break;

            //NEW VERSIONN OF JAVA----

            // case 0->System.out.println("even");
            // case 1->System.out.println("odd");

            case 0,2,4,6->System.out.println("even");  //we can use like this
            // case 0:   we can use this as well 
            // case 2:
            // case 4:    
            //     System.out.println("even")
            case 1->System.out.println("odd");


        }
    }
    

}

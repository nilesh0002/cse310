package starting;
/*
all literal in java treat as double
all l       in java treat as int
literal - constant value
*/

//access modifier
//static keyword
//wrapper class
// public class jan28 {
//     int a=4397;//instance- inside the class but outside the fun
//     public static void main(String [] args){
//         float a=3487.3242f;//
//         double b=a; //local  
//         //int c=a; // lose of precition
//         int c=(int)a;
//         System.out.println(b);
//         System.out.println(c);
//     }
// }


//key word--
/*
package- different module
default access specifier- inside same class 
private access specifier-
protected access specifier

extends used to  show inhertance
*/
import ca.jan28b;
public class jan28{
    public static void main(String[]args){
        System.out.println("hello world");
        jan28b obj_a=new jan28b();
        obj_a.greet();
    }
}


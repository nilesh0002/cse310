// class a{
//     class b{

//     }

//     class c{
//         b.display();
//         void display(){
//             System.out.println("This is class c");
//         }

//     }
// }

//create a constructor for outer class and using that cons we need to initialize inner class obj
class ot{
    ot(int a){ 
        a= 10;
        System.out.println("This is outer class constructor");
    }
    class in{
        void display(){
            System.out.println("This is inner class");
        }
    }

}

public class main3 {
    public static void main(String[] args) {

        ot outerObj = new ot(5);
        ot outerobj2 = new ot(15);  

        ot.in innerObj = outerObj.new in();

        innerObj.display();
    }
}   



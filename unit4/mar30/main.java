class animal{
    
        String name="dog"; 
        void sound(){
            System.out.println("bark");
        }   
}
class A extends animal{

}
public class main {
    public static void main(String[] args) {
        animal obj=new animal(){
            int age=10;
            void sound(){System.out.println("meow");}   
        };
        obj.sound();//System.out.println(obj.age);//becoz age it not a property of animal class it is a property of anonymous class.
        System.out.println(obj.name);

        A obj1 = new A(){};// here i can create mutiple object of a.
        System.out.println(obj1.name);

    }
}

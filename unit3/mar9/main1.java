
class animal{
    String name;
    void eat(){
        System.out.println("eating...");
    }
    void bark(){
        System.out.println("not barking...");
    }
}   

class dog extends animal{
    int age;
    String name;
    dog(int age, String name){
         super(); // it will call the parent class constructor
         this.age = age;
         this.name = name;
     }
     void eat(){
            System.out.println("eating bread...");
     }  
     void bark(){
        System.out.println("barking...");
        super.bark(); // it will call the parent class method
    }
}


public class main1 {
    public static void main(String[] args) {
        dog d1 = new dog(5, "tommy");
        System.out.println(d1.name);
        System.out.println(d1.age);
        d1.eat();
        d1.bark();

    }
}
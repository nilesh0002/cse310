interface animal {
    int a = 10; // this is a constant variable
    void eat();
}


class Dog implements animal {
    public void eat() {
        System.out.println("Dog is eating");
    }
}
public class main2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        System.out.println("Value of a: " + dog.a);
       // dog.a = 20; // This will cause a compile-time error because 'a' is a constant variable in the interface 
    }
}
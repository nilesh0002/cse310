
abstract class Animal {
   abstract void makeSound();

}
class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof");
    }
}

abstract class Bird extends Animal {
    abstract void fly();
}

public class   main {
    public static void main(String[] args) {
        // Main method can be empty or contain code to test the abstract class
    }
}
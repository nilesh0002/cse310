
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
    void bark(){
        System.out.println("barking...");
    }
    public String toString(){ //it is public bydefault we cant reduce the visibility of the method
        return "dog name is "+name+" and age is "+age;
    }   
}   

public class main1 {
    public static void main(String[] args) {
        animal d = new dog(); // it will check for tostring then again check for 
        d.eat();
        d.bark();
        System.out.println(d.getClass());
        System.out.println(d.toString());//it will print the class name and the hash code of the object
        //overridding toString() method
        System.out.println(d.equals(d));
    }
}
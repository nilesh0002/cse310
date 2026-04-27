interface animal{
    void sound();
    void eat();
}
public class main2 {
    public static void main(String[] args) {
       animal obj=new animal(){// here we can not create object of interface but we can create object of anonymous class which is implementing the interface.
            public void sound(){System.out.println("meow");}
            public void eat(){
                System.out.println("eating");
            }
        };
    }
}     z
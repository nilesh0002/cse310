class test{
    final int x=5;
    void sound(){
       
    }
}
class temp extends test{
    void sound(){
        System.out.println("hello");
    }
}
public class finalkey {
    public static void main(String[] args) {
        temp t = new temp();
        t.sound();
        System.out.print(t.x);
        // t.x = 10; // 'x' is a final variable
    }
}
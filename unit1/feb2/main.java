package feb2;
class test{
    static int a=32;
    public static void greet(){
        System.out.println("hello,lpu");
    }
    public static void nonstatic(){
        System.out.println("hello,lpu");
    }
}

public class main {
    public static void main(String[]args){
        System.out.println(test.a);
        test.greet();
        test.nonstatic();
    }
}

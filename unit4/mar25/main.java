class outerClass{
    static int a = 10;
    int b = 20;
    static class innerClass{

        void display(){
            System.out.println("Value of a: " + a);
            System.out.println("Value of b: " + new outerClass().b);
            System.out.println("This is inner class");
        }
    
    }
}
public class main {
    public static void main(String[] args) {
        outerClass.innerClass obj = new outerClass.innerClass();
        obj.display();
    }

}   

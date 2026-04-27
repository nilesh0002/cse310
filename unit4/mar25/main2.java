class outerclass{
    outerclass outerobj2= new outerclass();
    class innerclass{
        void display(){
            System.out.println("This is inner class");
        }
    }
}

public class main2 {
    public static void main(String[] args) {
        outerclass outerObj = new outerclass();
        outerclass.innerclass obj = outerObj.new innerclass();
        outerclass.innerclass obj2 = outerobj2.new innerclass();
        obj.display();
        obj2.display();
    }
}

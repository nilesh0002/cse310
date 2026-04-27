

class outer{
    static int a = 10;
    int b = 20;
    static void test(){
        int a = 100;
        final int b = 200;
        //a = 300;
        class local {
            void print(){
                System.out.println("local class");
                System.out.println(a);
                //System.out.println(b);
            }

            final int c = 30;
             void print2(){
                System.out.println(c);
            }   
        }
        local l = new local();
        l.print();
        l.print2();
    }
}


public class main{
    public static void main(String[] args) {
            outer o = new outer();
                outer.test(); 


    }
}
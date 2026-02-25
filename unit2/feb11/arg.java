package unit2.feb11;

public class arg {

    public static void main(String[] args){
        printInt(1,2,3,4,5);
    }
    static  void printInt(int a,int...args){  //var arg is used when we dont know how many argument we have to pass in fun
        for(int x:args){
            System.out.print(x+" ");
        }System.out.println();
    }
}


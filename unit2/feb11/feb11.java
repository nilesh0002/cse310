package unit2.feb11;
import java.util.Scanner;

public class feb11 {
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // int x=sc.nextInt();
        int []arr=createArray(sc.nextInt());
        int []arr2=createArray(sc.nextInt());
        int []arr3=createArray(sc.nextInt());

        print(arr3);
        print(arr2);
        print(arr);
    }

    static int[] createArray(int n){
        Scanner sc=new Scanner(System.in);
        int []arr=new int[sc.nextInt()];   
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        return arr;
    }


    static void print(int []arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }System.out.println();
    }
}

/* 
in java fun are passed by value  and that value is reference ......
1d array-array of integer
2d array-array of 1d array
nd array-array of n-1 d array   
*/
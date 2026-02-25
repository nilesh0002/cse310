package unit2.feb11;
import java.util.Scanner;

public class jaged {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [][]arr=new int[3][];  //jaged array
        for (int i=0;i<arr.length;i++){
            arr[i]=new int[sc.nextInt()];  //we can create array of different size in each row
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int[]a:arr){
            for(int x:a){
                System.out.print(x+" ");
            }System.out.println();
        }
    }
}

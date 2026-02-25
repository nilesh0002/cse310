package unit2.feb13;
import java.util.*;

public class ques {
    public static void main(String[]args){
        // int[] arr1={1,2,3,4,5};
        // System.out.println(Arrays.toString(arr1));
        Scanner sc=new Scanner(System.in);
        int arr[][]=new int[5][5];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
                if(isPrime(arr[i][j])){arr[i][j]=0;}
                else if(arr[i][j]%2 ==0){
                    arr[i][j]=0;
                }
            }
        }







        for(int a[]:arr){
            for(int n:a){
                System.out.print(n+" ");
            }System.out.println();
        }
    } 

   

    public static boolean isPrime(int x){
        if(x<2){
            return false;
        }
        for(int i=2;i*i<=x;i++){
            if(x%i==0)return false;
        }
        return true;
    }
}



/*
int sum=0
for(int j=0;j<arr[j];j++){
    for(int i=0;i<arr[i];i++){
            sum++;
    }
}



*/
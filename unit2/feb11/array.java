package unit2.feb11;

public class array {
    public static void main(String[] args){
        int[][]arr=new int[3][3];  //2d array
        //int[][][]arr2=new int[3][2][5];  //3 rows 2 col and 5 element in each col
        int[][]arr1=new int[][]{
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        System.out.println(arr1[1][2]); 
        arr[2][1]=32;
        // for(int i=0;i<arr1.length;i++){
        //     for(int j=0;j<arr1[i].length;j++){
        //         System.out.print(arr1[i][j]+" ");
        //     }System.out.println();
        // }
        for(int[]a:arr1){  //for each loop
            for(int x:a){
                System.out.print(x+" ");
            }System.out.println();
        }   
    }
}



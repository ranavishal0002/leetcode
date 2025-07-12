package RevisedDSAQuestions.Array;

public class RotateMatrix {
    public static int[][] tranpose(int [][]mat, int n){
        for(int i=0; i<n; i++){
            for(int j =0; j<n; j++){
                if(i<j){
                    int temp= mat[j][i];
                    mat[j][i] = mat[i][j];
                    mat[i][j]= temp;
                }
            }
        }
        return mat;
    }

    public static  int[][] matrixRotation(int mat[][], int n){

        // first need to find
        int arr[][] = tranpose(mat,n);
        // here reverse the 2-d arr row wise

        // this is to iterate over row as need to reverse row wise
        for(int i =0; i<n; i++){
            int start = 0;
            int end = n-1;
            while(start<end){
                int temp = arr[i][start];
                arr[i][start]=arr[i][end];
                arr[i][end]= temp;
                start++;
                end--;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int mat[][]= {
                {1,2},
                {3,4}
        };
        int n= mat.length;
         matrixRotation(mat,n);

         // print array
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
}

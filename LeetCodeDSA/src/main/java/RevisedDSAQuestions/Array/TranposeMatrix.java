package RevisedDSAQuestions.Array;


class solution{
    public static int[][]  matrixTranspose(int arr[][], int n){
        for(int i =0; i<n; i++) {
            for (int j = 0; j < n; j++) {
                if (i < j) {
                    int temp = arr[j][i];
                    arr[j][i] = arr[i][j];
                    arr[i][j] = temp;
                }
            }
        }
            return arr;
    }
}
public class TranposeMatrix {
    public static void main(String[] args) {
        int arr[][]= {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = arr.length;
        solution.matrixTranspose(arr,n);
        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

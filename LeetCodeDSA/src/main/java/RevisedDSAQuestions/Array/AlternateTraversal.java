package RevisedDSAQuestions.Array;

public class AlternateTraversal {
    public static void tarverseAlternate(int mat[][], int n){
        for(int i =0; i<n; i++){
            if(i%2==0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(mat[i][j] + " ");
                }
            }
            else
                for(int j = n-1; j>=0; j--){
                    System.out.print(mat[i][j]+" ");
                }
        }
    }
    public static void main(String[] args) {
        int mat[][] ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = mat.length;
        tarverseAlternate(mat, n);
    }
}

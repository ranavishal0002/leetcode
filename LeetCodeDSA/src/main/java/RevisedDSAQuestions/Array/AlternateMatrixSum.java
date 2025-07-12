package RevisedDSAQuestions.Array;

public class AlternateMatrixSum {
    public static int requiredSum(int mat[][], int n){
        int sum =0;
        for(int i =0; i<n; i++){
            for(int j =0; j<n; j++){
                if((i+j)%2==0){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int mat[][] ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n = mat.length;
        System.out.println(requiredSum(mat, n));
    }
}

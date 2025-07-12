package RevisedDSAQuestions.Array;

public class SpecialMatrix {
    public static boolean checkMatrix(int mat[][], int n){

        for(int i =0; i<n; i++){
            for(int j=0; j<n; j++){
                // this is to check diag. and anti-diag elements
                if(i==j || (i+j==n-1)){
                    if(mat[i][j]==0){
                        return false;
                    }
                }
                // here we check non-diag elements
                else if(mat[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int mat [][] ={
                {1,0,3},
                {0,5,0},
                {2,0,4}
        };
        int n= mat.length;
        System.out.print(checkMatrix(mat, n));
    }
}

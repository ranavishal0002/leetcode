package RevisedDSAQuestions.Array;

public class MaximaMinima {
    public static int returnNumber(int mat[][],int n ){
        for(int i =0; i<n; i++){
            int minRow = mat[i][0];
            int colIndex = 0;
            for(int j=1; j<n; j++){
                if(mat[i][j] < minRow){
                    minRow = mat[i][j];
                    colIndex =j;
                }
            }
            boolean isMaxCol = true;
            for(int k =0; k<n; k++){
                if(mat[k][colIndex]>minRow){
                    isMaxCol= false;
                    break;
                }
            }
            if(isMaxCol){
                return minRow;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int mat [][] ={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int n= mat.length;
        System.out.println(returnNumber(mat, n));
    }
}


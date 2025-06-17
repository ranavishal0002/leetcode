package PracticeQuestions;

public class SetMatrix02 {
    public static void convertRowCol(int [][]mat, int n, int m) {

        // need to find which row or col have Zero;

        boolean rowFlag[] = new boolean[n];
        boolean colflag[] = new boolean[m];

        for(int i =0; i<n; i++){
            for(int j =0; j<m; j++) {
                if (mat[i][j] == 0) {
                    rowFlag[i] = true;
                    colflag[j] = true;
                }
            }
        }
         // now set col and row to zero
         for (int i =0; i<n; i++){
             for(int j=0; j<m; j++){
                 if(rowFlag[i] || colflag[j]){
                     mat[i][j]=0;
                 }
             }
         }
    }

    public static void main(String[] args) {
        int mat[][] = {
                {0, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 1},
                {1, 1, 1, 0}
        };
        int row = mat.length;
        int col = mat[0].length;
        convertRowCol(mat, row, col);
        for(int i =0; i<row; i++){
            for(int j =0; j<col; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();

        }
    }
}

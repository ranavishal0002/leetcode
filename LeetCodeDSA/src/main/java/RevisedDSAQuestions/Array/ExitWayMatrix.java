package RevisedDSAQuestions.Array;

public class ExitWayMatrix {
    public static  int [] exitPoint(int mat[][], int n){
        int dir = 0;
        int m = mat[0].length;
        // here i and j are 0 as they start from the first cell
        int i =0;  //iterate row
        int j =0; //iterate col
        while(true){
            dir = (dir+mat[i][j])%4;  // as when it is more than 4 then it will again in the same direction

            // this is to understand how we gonna change our direction
            if(dir==0)
                j++;
            else if(dir==1)
                i++;
            else if(dir==2)
                j--;
            else if(dir==3)
                i--;

            if(i<0){
                i++;
                break;
            }
            else if(i==n){
                i--;
                break;
            }
            else if(j<0){
                j++;
                break;
            }
            else if(j==m){
                j--;
                break;
            }

        }
        int result[]= {i,j};
        return result;
    }
    public static void main(String[] args) {
        int mat[][]=
                {
                    {0,1, 0},{0, 1, 0},{1, 0, 1}
                };
        int n = mat.length;
      int result []=  exitPoint(mat, n);

      for(int i =0; i<result.length; i++){
          System.out.print(result[i]+" ");
      }
        System.out.println();
    }
}

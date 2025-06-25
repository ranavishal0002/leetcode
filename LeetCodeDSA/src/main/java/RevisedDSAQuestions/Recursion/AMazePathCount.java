package RevisedDSAQuestions.Recursion;

public class AMazePathCount {
    public static int printAMazePathCount(int n, int m, String psf, int i, int j){
        if(i>n || j>m){
            return 0;
        }
        if(i==n && j== m){
            return 1;
        }
      int horiznotaMove=  printAMazePathCount(n,m,psf+"h", i, j+1);
      int verticalMove =  printAMazePathCount(n,m,psf+"v", i+1, j);
      return horiznotaMove+verticalMove;
    }
    public static void main(String[] args) {
        int n =3;
        int m =3;
        String psf = "";
        System.out.print(printAMazePathCount(n,m, psf, 1,1));

    }
}

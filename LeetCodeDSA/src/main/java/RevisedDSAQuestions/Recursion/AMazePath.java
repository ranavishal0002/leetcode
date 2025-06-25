package RevisedDSAQuestions.Recursion;
// we are on the first cell of the 2-D matrix need to go the last cell and print all the routes
public class AMazePath {
    static void findPaths(int n, int m, String psf, int i, int j){
        if(i>n || j>m){
            return ;
        }
        if(i==n && j==m){
            System.out.println(psf);
            return;
        }
        findPaths(n, m , psf+"h", i, j+1); // going horizontally
         findPaths(n,m,psf+"v", i+1, j);// goind vertically
//        return incl+exl;
    }
    public static void main(String[] args) {
        int n=3;
        int m =3;
        String psf = "";
       findPaths(n,m,psf,1,1);
    }
}
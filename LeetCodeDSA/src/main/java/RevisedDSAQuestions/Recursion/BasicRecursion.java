package RevisedDSAQuestions.Recursion;

public class BasicRecursion {

    public static int printOutput(int n){

        if(n == 1){
            return 0;
        } else {
            return 1+ printOutput(n/2);
        }
    }
    public static void main(String[] args) {
        int n = 16;
        System.out.println(printOutput(n));
    }
}


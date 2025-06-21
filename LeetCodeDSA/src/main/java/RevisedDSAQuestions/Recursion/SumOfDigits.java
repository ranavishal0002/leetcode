package RevisedDSAQuestions.Recursion;

public class SumOfDigits {
    public static int totalSum(int n){
        if(n==0){
            return 0;
        }
        int rec = totalSum(n/10);
        int ld = n%10;
        return rec +ld;
    }
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(totalSum(n));
    }
}

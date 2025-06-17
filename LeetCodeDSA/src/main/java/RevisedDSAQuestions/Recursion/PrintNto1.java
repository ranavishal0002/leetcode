package RevisedDSAQuestions.Recursion;

public class PrintNto1 {
    public static void fun(int n ){
        if (n ==0){  // Base condition
            return;
        }
        System.out.println(n+" ");
        fun(n-1);  // here it is an example of Tail Recurssion a last thing happening here is recursive call

    }
    public static void main(String[] args) {
        int n = 4;
        fun(n);
    }
}

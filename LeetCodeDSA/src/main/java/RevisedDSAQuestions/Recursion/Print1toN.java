package RevisedDSAQuestions.Recursion;

public class Print1toN {
    public static void fun2(int n){
       if(n==0){
           return;
       }
       fun2(n-1);
        System.out.print(n+" ");

    }
    public static void main(String[] args) {
        int n =4;
        fun2(n);
    }
}

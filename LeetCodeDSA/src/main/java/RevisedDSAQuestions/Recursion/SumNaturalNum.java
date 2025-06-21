package RevisedDSAQuestions.Recursion;

import javax.swing.*;

public class SumNaturalNum {
    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sum(n - 1); // this is to find sum of n natural numbers
//        return n*sum(n-1);    // this is to find the factorial of a number
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(sum(n));
    }
}

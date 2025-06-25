package RevisedDSAQuestions.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PermutationOfString {
//    public static List<String> printPermutation(String str, int n){
//        List<String> result = new ArrayList<>();
//        if(str==null || str.length()== 0)
//            return result;
//            char[] chars = str.toCharArray();
//            permuteHelper(chars, 0, result);
//            return result;
//
//    }
//    public static void permuteHelper(char[]chars, int start, List<String>result){
//        if(start == chars.length-1){
//            result.add(new String(chars));
//            return;
//        }
//        // Recursive calls are here
//        for(int i = start; i<chars.length; i++){
//            swap(chars, start, i);
//            permuteHelper(chars, start+1, result);
//            swap(chars, start, i);
//        }
//    }
//    private static void swap(char [] chars, int i, int j ){
//        char temp=  chars[i];
//        chars[i]= chars[j];
//        chars[j]= temp;
//    }

    // Print all permutations of the string
    public static void printPermutation(String str, int n) {
        helperFunction(str, "");
    }

    static void helperFunction(String str, String curr) {
        if (str.length() == 0) {
            System.out.println(curr);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i + 1);
            helperFunction(ros, curr + ch);
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        printPermutation(str, n);
    }
}



package RevisedDSAQuestions.Recursion;

public class PrintAllSubsequences {
    static void allSubsequences(String str, int n){
        helper(str, n, 0, "");
    }
    static void helper(String str,int n,  int index, String current){
        if(index==n){
            System.out.print(current+" ");
            return;
        }
        helper(str, n, index+1, current+str.charAt(index)); // when include the char
        helper(str,n ,index+1, current);
    }
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        allSubsequences(str,n);
    }
}

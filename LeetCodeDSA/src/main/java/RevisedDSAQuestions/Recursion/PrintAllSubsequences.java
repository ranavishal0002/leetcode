package RevisedDSAQuestions.Recursion;

public class PrintAllSubsequences {
  public static  void allSubsequences(String str, int n){
      helper(str,n,0, "");
  }
  static void helper(String str, int n, int index, String curr){
      if(index== str.length()){
          System.out.println(curr);
          return;
      }

      helper(str, n, index+1, curr+ str.charAt(index));
      helper(str, n,  index+1, curr);
  }
    public static void main(String[] args) {
        String str = "abc";
        int n = str.length();
        allSubsequences(str,n);
    }
}



package RevisedDSAQuestions.Recursion;

public class PalindromeCheck {
    public static boolean isPalindrome(String s, int start, int end){
        if(start>=end){  // this will check all the chars   <= will make recursion call for indefinetly time
            return true;
        }
        return (s.charAt(start)==s.charAt(end)) && isPalindrome(s, start+1,end-1);
    }
    public static void main(String[] args) {
        String str = "aabaa";
        int start =0;
        int end = str.length() -1;
        System.out.print(isPalindrome(str, start, end));
    }
}

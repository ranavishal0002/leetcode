package RevisedDSAQuestions.String;

public class PalindromeString {
    static boolean isPalindrome(String s){
//        String str = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int n = s.length();
        int left =0;
        int right = n-1;
        while(left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String s= "abba";
        int n = s.length();
        System.out.println(isPalindrome(s));
    }
}

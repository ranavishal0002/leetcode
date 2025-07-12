package RevisedDSAQuestions.String;

public class PalindromeString {
    static boolean isPalindrome(String s){
        String str = s.replaceAll("[^a-zA-Z]", "").toLowerCase();
        int start =0;
        int end = str.length()-1;

        while(start < end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s= "abBa";
        int n = s.length();
        System.out.println(isPalindrome(s));
    }
}



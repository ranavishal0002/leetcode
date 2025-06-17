package RevisedDSAQuestions.String;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class PalindromeSubString {

    public static boolean isPalindrome(String s){

        // This line will remove all the white spaces and also make all the char of lowerCase
        String res = s.replaceAll("[^a-zA-Z]", "").toLowerCase();

        int left =0;
        int right = res.length()-1;

        while(left<right){

            if(res.charAt(left) != res.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void subStringPalindrome(String s){

        ArrayList<String> list= new ArrayList<>();
        int n = s.length();

        for(int i =0; i<n; i++){
            String subStr= "";
            for(int j=i; j<n; j++){
                subStr+=s.charAt(j);

                if(isPalindrome(subStr) && !list.contains(subStr)){
                    list.add(subStr);
                }
            }

            Collections.sort(list);
            for(String strr: list){
                System.out.println(strr);
            }
        }


    }
    public static void main(String[] args) {
        String str =  "abababaaabbbaaa";

        subStringPalindrome(str);
    }
}

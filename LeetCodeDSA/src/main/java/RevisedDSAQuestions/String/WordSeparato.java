package RevisedDSAQuestions.String;
public class WordSeparato {
    public static void solution(String s) {
        StringBuilder word = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
            if (word.length() > 0) {
                System.out.println(word);
            }
                word = new StringBuilder();
                word.append(ch);
            } else {
                word.append(ch);
            }
        }
        if(word.length()>0){
            System.out.println(word);
        }
    }
        public static void main (String[]args){
            String s = "IAmVishalSinghRana";
            solution(s);
        }

}

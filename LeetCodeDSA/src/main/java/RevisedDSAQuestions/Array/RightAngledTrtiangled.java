package RevisedDSAQuestions.Array;


//input = "my name is vishal"
//output = "vishal is name my"

public class RightAngledTrtiangled {
    public static void main(String[] args) {

    String input = "my name is vishal";

    String str = "";
    for(int i = input.length()-1; i>=0; i--){
        System.out.print(str+input.charAt(i));
    }
    }
}

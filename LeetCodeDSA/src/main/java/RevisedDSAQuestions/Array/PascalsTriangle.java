package RevisedDSAQuestions.Array;

class TriangleFinder {
    public static void makeTriangle(int N) {
        for (int line = 0; line < N; line++) {
            int val = 1; // first value is always 1 in every line or row

            // Print leading spaces
            for (int space = 0; space < N - line - 1; space++) {
                System.out.print("  ");
            }
            // Print values in the row
            for (int i = 0; i <= line; i++) {
                System.out.print(val + "   "); // print value of each cell
                val = val * (line - i) / (i + 1);  // Use proper formula to print the value of the cell
            }
            System.out.println();  // Move to next line
        }
    }
}

public class PascalsTriangle {
    public static void main(String[] args) {
        int n = 5;
        TriangleFinder.makeTriangle(n);
    }
}

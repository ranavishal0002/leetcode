package RevisedDSAQuestions.Hashing;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class FruitsInBasket {

    public static int unplacedBasket(int[] fruits, int[] baskets) {
        LinkedHashSet<Integer> basketSet = new LinkedHashSet<>();
        for (int basket : baskets) {
            basketSet.add(basket);
        }
        int unplaced = 0;
        for (int fruit : fruits) {
            boolean placed = false;
            for (Iterator<Integer> itr = basketSet.iterator(); itr.hasNext(); ) {
                int b = itr.next();
                if (fruit <= b) {
                    itr.remove(); // Assign basket to fruit
                    placed = true;
                    break;
                }
            }
            if (!placed) {
                unplaced++; // No suitable basket found
            }
        }
        return unplaced;
    }

    public static void main(String[] args) {
        int fruits[]={1,2,1};
        int baskets[]= {3,2,2};
        System.out.print(unplacedBasket(fruits, baskets));
    }
}

package RevisedDSAQuestions.Recursion;

public class TowerOfHanoi {
    public static void hanoiTowerSolution(int n, int source, int helper, int destination){
        if(n==1){
            System.out.print("move disk "+n+" from "+source+ " to "+destination);
            return;
        }
        hanoiTowerSolution(n-1, source, destination, helper);
        System.out.println("move disk "+n+" from "+ source+ " to "+ destination);
        hanoiTowerSolution(n-1, helper, source, destination);
    }
    public static void main(String[] args) {
        int n = 3;
        int source= 1;
        int helper =2;
        int destination =3;
        hanoiTowerSolution(n, source, helper, destination);
    }
}

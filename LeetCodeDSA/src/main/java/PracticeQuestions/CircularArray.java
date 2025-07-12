package PracticeQuestions;

class Findelement{
    public void allciirculerElement(int []a, int n){

        int k =2;
        for(int i =0; i<n; i++){
            for(int j =1; j<=k; j++){

                int nextIndex = (i+j)%n;
                System.out.print(a[nextIndex]+" ");

//                int preIndex = (i-j+n)%n;
//                System.out.print(a[preIndex]+" ");
            }
        }
    }
}
public class CircularArray {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4};
        int n = arr.length;
        Findelement obj = new Findelement();
         obj.allciirculerElement(arr,n);

    }
}

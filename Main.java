public class Main {

    public static int Slargest(int arr[], int n) {

        int largest = arr[0];
        int slargest = -1;

        for (int i =0;  i <n;  i++){
            if (arr[i]>largest){
                slargest = largest;
                largest = arr[i];
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest = arr[i];
            }
        }
        return slargest;

    }           

    public static void main(String[] args) {
        int arr[] = {10, 2, 15, 30, 40, 21 };
        int n = 6;
        int secondLargest = Slargest(arr, n);

        System.out.println("The second largest element is: " + secondLargest);

        // Slargest(arr, n);
    }
}
class SecondLarge {
    public int largesecond(int[] arr, int n) {
        int largevalue = arr[0];
        int slargevalue= -1;

        /* This is the brute force approach */
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] > largevalue)
        //         largevalue = arr[i];
        // }
        // int slargevalue = -1;
        // for (int i = 0; i < n; i++) {
        //     if (arr[i] > slargevalue && arr[i] != largevalue)
        //         slargevalue = arr[i];
        // }
        // return slargevalue;

        /* this is the optimal approach for this question */

        for (int i = 0; i < n; i++) {
            if(arr[i]>largevalue){
                slargevalue = largevalue;
                largevalue = arr[i];
            } else if(arr[i] <largevalue && arr[i]> slargevalue){
                slargevalue = arr[i];
            }
        }
        return slargevalue;

    }

public int secondsmallest (int[]arr, int n ){
    int smallest = arr[0];
    int ssmallest = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
        if (arr[i] < smallest) {
            ssmallest = smallest;
            smallest = arr[i];
        } else if (arr[i] > smallest && arr[i] < ssmallest ){
            ssmallest = arr[i];
        }
    }
    return ssmallest;
}

}

public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = { 8, 2, 5, 7, 6 };
        int n = arr.length;
        SecondLarge s = new SecondLarge();

        System.out.println("The Second Largest Value is " + s.largesecond(arr, n));
        System.out.println("The Second Largest Value is " + s.secondsmallest(arr, n));

    }
}

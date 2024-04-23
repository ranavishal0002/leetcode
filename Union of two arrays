import java.util.ArrayList;

import java.util.ArrayList;

public class Union {

    public static void unionArray(int a[], int b[], int n, int m) {

        ArrayList<Integer> list = new ArrayList<Integer>();

        int i = 0;
        int j = 0;
        while (i < n && j < m) {

            if (i > 0 && a[i] == a[i - 1]) {
                i++;
                continue;
            }
            if (j > 0 && b[j] == b[j - 1]) {
                j++;
                continue;
            }

            if (a[i] < b[j]) {
                list.add(a[i]);
                i++;
            } else if (a[i] > b[j]) {
                list.add(b[j]);
                j++;
            } else {
                list.add(a[i]);
                i++;
                j++;
            }
        }   

        while (i < n) {
            if (i == 0 || a[i] != a[i - 1]) {
                list.add(a[i]);
            }
            i++;
        }

        while (j < m) {
            if (j == 0 || b[j] != b[j - 1]) {
                list.add(b[j]);
            }
            j++;
        }

        System.out.println(list);
    }

    public static void main(String[] args) {

        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int b[] = { 1, 2, 3, 4, 5, 6 };
        int n = a.length;
        int m = b.length;
        unionArray(a, b, n, m);
    }
}

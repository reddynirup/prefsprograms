// Mr PushpaRaj has N bottles of Spirit as bottles[], where i-th bottle 
// contains bottle[i] liters of Spirit. He wants to make that all the bottles 
// contains same amount of Spirit. Generally, Spirit evaporates quickly, 
// due to this, P percentage of Spirit will be evaporated while pouring it 
// from one bottle to another, i.e., if He poured M liters of Spirit from 
// one bottle to another, the amount of Spirit evaporated is P% of M.

// Your task is to help Mr PushpaRaj find the maximum amount of Spirit in each 
// bottle after making sure that all the bottles have the same amount of Spirit.

// NOTE: Print the result within 10^(-5) of the actual result will be accepted.

// HINT: 
// -----
// Perform the binary search till the condition breaks,
// high-low > 0.00001

// Input Format:
// -------------
// Line-1: Two space separated integers, N and P.
// Line-2: N space separated integers, bottles[].

// Output Format:
// --------------
// Print a double value rounded to 5 decimals. 


// Sample Input-1:
// ---------------
// 4 75
// 2 8 3 12

// Sample Output-1:
// ----------------
// 4.00000

// Explanation:
// ------------
// ::-The bottles contains {2,8,3,12},Pour 4 ltrs from bottles[1] to bottles[0].
// 4 * 75% = 3 ltrs are evaporated and bottles[0] only got 4 - 3 = 1 ltr of Spirit.
// ::-The bottles contains {3,4,3,12}, Pour 4 ltrs from bottles[3] to bottles[0].
// 4 * 75% = 3 ltrs are evaporated and bottles[0] only got 4 - 3 = 1 ltr of Spirit.
// ::-The bottles contains {4,4,3,8}, Pour 4 ltrs from bottles[3] to bottles[2].
// 4 * 75% = 3 ltrs are evaporated and bottles[0] only got 4 - 3 = 1 ltr of Spirit.
// ::-All the bottles have 4 ltrs of Spirit in them, so return 4.


// Sample Input-2:
// ---------------
// 4 50
// 3 5 8 10

// Sample Output-2:
// ----------------
// 5.66666


import java.util.*;

class Main {

    public static double calculate(int arr[], double m, int p) {
        double in = 0;
        double out = 0;
        double percent = (double) (100 - p) / 100;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < m) {
                in = in + (m - arr[i]);
            }
            if (arr[i] > m) {
                out += (arr[i] - m) * percent;
            }
        }
        return out - in;
    }

    public static double find(int arr[], int n, int p, double low, double high) {
        while (high - low > 0.00001) {
            double mid = (low + high) / 2;
            double cal = calculate(arr, mid, p);
            if (cal < 0) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return low;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int arr[] = new int[n];
        double sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }
        sum = sum / n;
        double ans = find(arr, n, p, 0, sum);
        System.out.printf("%.5f", ans);
    }
}

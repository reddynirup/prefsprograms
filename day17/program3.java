/*MotorSport Ltd hosting a Racing Championship. Mr. Ajith is participating 
in car races. Each race start and end in perticular time intervals.

You are given an array of racing time intervals consisting of
start and end times [[s1,e1],[s2,e2],...] (s < e ) of N races, in which 
Ajith has to participate. Your task is to determine whether Ajith can 
in all the races or not.

NOTE: If a race starts at time 'a' ends at time 'b', 
another race can start at 'b'.

Input Format:
-------------
Line-1: An integer N, number of races Ajith has to participate.
Next N lines: Two space separated integers, start and end time of each race.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
3
0 30
5 10
15 20

Sample Output-1:
----------------
false

Sample Input-2:
---------------
3
0 10
15 25
30 35

Sample Output-2:
----------------
true
*/


import java.util.*;

class Main {
    public static boolean find(int arr[][], int n) {
        
        //method 1 to sort using lamda function
        // Arrays.sort(arr,(a,b)->a[0]-b[0]);
        

        //method 2 to sort using comaprator class
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        });

        for(int i=1;i<n;i++){
            if(arr[i][0]<arr[i-1][1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        boolean ans = find(arr, n);
        System.out.print(ans);
    }
}

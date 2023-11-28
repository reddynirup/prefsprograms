// Given an undirected graph with V vertices and a number M, the task is to color 
// the given graph with at most M colors such that no two adjacent vertices of 
// the graph are colored with the same color. Color codes are start from 1 to M. 
// You need to assign the color code to any vertex V, whihch is the least possible 
// color code value.

// Your task is to check whether it is possible or not.
// Print 'true' if it is possible, Otherwise print 'false'.

// Note: 
// - In the given graph, there are no self edges.
// - Coloring of a graph means the assignment of colors to all vertices.

// Input Format:
// -------------
// Line-1: An integer V and M,
// Next V lines: V space separated integers, only 1's and 0's.

// Output Format:
// --------------
// if possible, print the coloring arrangement of V vertices.
// Otherwise, print "No Solution" 


// Sample Input-1:
// ---------------
// 4 3
// 0 1 1 1
// 1 0 1 0
// 1 1 0 1
// 1 0 1 0

// Sample Output-1:
// ----------------
// 1 2 3 2 


// Sample Input-2:
// ---------------
// 4 2
// 0 1 1 1
// 1 0 1 1
// 1 1 0 1
// 1 1 1 0

// Sample Output-2:
// ----------------
// No Solution
import java.util.Scanner;

class Main {

    static boolean isSafe(int graph[][], int ans[], int i, int c) {
        for (int k = 0; k < graph[0].length; k++) {
            if (k != i && graph[i][k] == 1 && c == ans[k]) {
                return false;
            }
        }
        return true;
    }

    public static boolean colorGraph(int graph[][], int ans[], int i, int c) {
        if (i == ans.length) {
            for (int j = 0; j < ans.length; j++) {
                System.out.print(ans[j] + " ");
            }
            return true;
        }

        for (int k = 1; k <= c; k++) {
            if (isSafe(graph, ans, i, k)) {
                ans[i] = k;
                if (colorGraph(graph, ans, i + 1, c)) {
                    return true;
                }
                ans[i] = 0;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][r];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < r; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int ans[] = new int[r];
        boolean result = colorGraph(arr, ans, 0, c);
        if (!result) {
            System.out.print("No Solution");
        }
    }
}



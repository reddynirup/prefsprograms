// Mahalakshmi participated in a treasure-hunt conatins N boxes in it.
// Each box is numbered from 0,1,2,3,...,N-1. 
// All the boxes are intially locked with the passcodes, except Box-0.
// The passcode is written in a envolope and marked with its concern box number.

// Each box in the treasure hunt contains a list of envelopes, which has 
// passcodes to open the other boxes. You can open the boxes in any order, 
// but you have to start from box-0 intially.

// The rule to win the treasure-hunt is to open all the boxes.
// Your task is to find out, whether Mahalakshmi win the treasure hunt or not.
// If she win, print "Win".
// Otherwise, print "Lost"

// Input Format:
// -------------
// Line-1: An integer, number of boxes.
// Next N lines: space separated integers, box numbers.

// Output Format:
// --------------
// Print a string value, Win or Lost


// Sample Input-1:
// ---------------
// 5
// 1
// 2
// 3
// 4
// 3

// Sample Output-1:
// ----------------
// Win

// Sample Input-2:
// ---------------
// 4
// 1 3
// 3 0 1
// 2
// 0

// Sample Output-2:
// ----------------
// Lost

import java.util.*;

class Main{
    public static boolean treasure(String box[][]){
        boolean visited[]=new boolean[box.length];
        solve(box,visited,0);
        for (int i=0;i<visited.length;i++){
            if (!visited[i])
                return false;
        }
        return true;
    }
    public static void solve(String box[][],boolean visited[],int ind){
        visited[ind]=true;
        for (int i=0;i<box[ind].length;i++){
            if (!visited[Integer.parseInt(box[ind][i])])
                solve(box,visited,Integer.parseInt(box[ind][i]));
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String box[][]=new String[n][];
        sc.nextLine();
        for (int i=0;i<n;i++){
            box[i]=sc.nextLine().split(" ");
        }
        if (treasure(box))
            System.out.print("Win");
        else
            System.out.print("Lost");
    }
}


// import java.util.*;

// class Main {
//     static boolean find(int arr[][], int vis[]) {
//         Queue<Integer> q = new ArrayDeque<Integer>();
//         q.offer(0);

//         while (!q.isEmpty()) {
//             int t=q.poll();

//             for (int i=0; i<arr[t].length;i++) {
//                 int next=arr[t][i];

//                 if (vis[next]==0) {
//                     vis[next]=1;
//                     q.offer(next);
//                 }
//             }
//         }

//         for (int i=0;i<vis.length;i++) {
//             if (vis[i]==0) {
//                 return false;
//             }
//         }

//         return true;
//     }

//     public static void main(String args[]) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         sc.nextLine();
//         int arr[][]=new int[n][];
        
//         for (int i=0;i < n;i++) {
//             String[] a=sc.nextLine().split(" ");
//             arr[i]=new int[a.length];
//             for (int j = 0;j < a.length;j++) {
//                 arr[i][j]=Integer.valueOf(a[j]);
//             }
//         }

//         int vis[]=new int[n];
//         vis[0]=1;

//         if(find(arr,vis)){
//             System.out.print("Win");
//         } 
//         else{
//             System.out.print("Lost");
//         }
//     }
// }

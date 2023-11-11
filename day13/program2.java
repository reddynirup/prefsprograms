// There is a board with M*N size. 
// The board contains M*N blocks of 1*1 size.
// Each block is printed a number on it.

// You will be given a number, your task is to find whether the number is printed on 
// any of the blocks or not. If found print true, otherwise print false.

// NOTE: 
// - The numbers printed on the board in each row are in increasing order. 
// - Next row starting number is greater than the last number of the previous row.

// Constarint:
// -----------
// Can you solve it in log(M)+ log(N) time. 


// Input Format:
// -------------
// Line-1 -> Two integers M and N, board size.
// Next M lines -> N space separated integers.
// Last Line -> An integer T, number to search.

// Output Format:
// --------------
// Print a boolean value, 'true' if number found.
// otherwise, 'false'.


// Sample Input-1:
// ---------------
// 4 4
// 1 3 6 10
// 12 15 19 23
// 24 28 32 36
// 37 41 44 47
// 15

// Sample Output-1:
// ----------------
// true


// Sample Input-2:
// ---------------
// 4 4
// 1 3 6 10
// 12 15 19 23
// 24 28 32 36
// 37 41 44 47
// 26

// Sample Output-2:
// ----------------
// false


import java.util.*;
class Test{
    static boolean find(int arr[][],int target){
        int r=arr.length;
        int c=arr[0].length;
        int left=0;
        int right=r*c-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            int m1=arr[mid/c][mid%c];
            if(m1==target){
                return true;
            }
            else if(m1<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        return false;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int target=sc.nextInt();
        boolean ans=find(arr,target);
        System.out.print(ans);
    }
}
























// import java.util.*;
// class Test{
//     static boolean binarySearch(int arr[],int target){
//         int low=0;
//         int high=arr.length-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(arr[mid]==target){
//                 return true;
//             }
//             else if(arr[mid]>target){
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//             }
//         }
//         return false;
//     }
//     static boolean find(int arr[][],int target){
//         int low=0;
//         int high=arr.length-1;
//         while(low<=high){
//             int mid=(low+high)/2;
//             if(target>=arr[mid][0] && target<=arr[mid][arr[0].length-1]){
//                 return binarySearch(arr[mid],target);
//             }
//             else if(target<arr[mid][0]){
//                 high=mid-1;
//             }
//             else{
//                 low=mid+1;
//             }
//         }
//         return false;
//     }
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int m=sc.nextInt();
//         int arr[][]=new int[n][m];
//         for(int i=0;i<n;i++){
//             for(int j=0;j<m;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         int target=sc.nextInt();
//         boolean ans=find(arr,target);
//         System.out.print(ans);
//     }
// }
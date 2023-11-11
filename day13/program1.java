// There is a board with M*N size. 
// The board contains M*N blocks of 1*1 size.
// Each block is printed a number on it.

// You will be given a number, your task is to find whether the number is printed on 
// any of the blocks or not. If found print true, otherwise print false.

// NOTE: 
// - The numbers printed on the board in each row and each column are
//   in increasing order. And all the numbers are unique.

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
// 2 5 9 13
// 4 8 12 16
// 7 11 14 17
// 5

// Sample Output-1:
// ----------------
// true


// Sample Input-2:
// ---------------
// 4 4
// 1 3 6 10
// 2 5 9 13
// 4 8 12 16
// 7 11 14 17
// 15

// Sample Output-2:
// ----------------
// false


import java.util.*;
class Test{
    public static boolean find(int arr[][],int target){
        int i=0;
        int j=arr[0].length-1;
        while(i<arr.length && j>=0){
            if(arr[i][j]==target){
                return true;
            }
            else if(arr[i][j]>target){
                j--;
            }
            else{
                i++;
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
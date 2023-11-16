// There are N sticks of various lengths, stklen[], where stklen[i] is the length
// of the i-th stick. And you need to break them into pieces of any length. And
// you will be given another integer P, number of pieces you need to make.

// You need to break the sticks to make P pieces of equal lengths.
// You can consider the unwanted piece as scrap.

// You can break a stick of length 6 as follows:
// 	- 6 pieces of length-1.
// 	- 1 piece of length-1 and 1 piece of length-2 and one piece of length-3.
// 	- 3 pieces of length-2, etc.
	
// Your task is to check, can you break the sticks into P pieces of equal length,
// if possible, retrun the maximum length of the pieces possible.
// otherwise return 0.

// Input Format:
// -------------
// Line-1: Two space separated integers, N and P.
// Line-2: N space separated integers, length of the sticks.

// Output Format:
// --------------
// Print an integer result.


// Sample Input-1:
// ---------------
// 3 3
// 6 8 10

// Sample Output-1:
// ----------------
// 6

// Explanation:
// ------------
// - Keep the stick-1 as it is.
// - Break the stick-2 into two pieces, one of length 6 and one of length 2.
// - Break the stick-3 into two pieces, one of length 6 and one of length 4.
// Finally, you have 3 pieces of length 6.


// Sample Input-2:
// ---------------
// 3 4
// 6 8 10

// Sample Output-2:
// ----------------
// 5

// Explanation:
// ------------
// - Break the stick-1 into two pieces, one of length 5 and one of length 1.
// - Break the stick-2 into two pieces, one of length 5 and one of length 3.
// - Break the stick-3 into two pieces, one of length 5 and one of length 5.
// Finally, you have 3 pieces of length 4.


// Sample Input-3:
// ---------------
// 3 25
// 6 8 10

// Sample Output-3:
// ----------------
// 0



import java.util.*;
class Main{
    public static int calculate(int arr[],int m){
        int no=0;
        for(int i=0;i<arr.length;i++){
            no+=arr[i]/m;
        }
        return no;
    }
    
    public static int find(int arr[],int n,int s,int low,int high){
        while(low<=high){
            int mid=(low+high)/2;
            int c=calculate(arr,mid);
            if(c>=s){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return high;
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        
        int high=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            high=Math.max(high,arr[i]);
        }
        
        int ans=0;
        ans=find(arr,n,p,1,high);
        System.out.print(ans);
    }
}
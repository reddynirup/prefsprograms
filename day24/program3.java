// Given a sorted set of positive integers numset[], and a target T.

// Your task is to print all subsets of numset with sum equal to given target.
// If no subset found, print -1.

// Note: Subsets should be distinct and lexicographiclly ascending order..

// Input Format:
// -------------
// Line-1 -> An integer N, number of elements.
// Line-2 -> N space separated integers, numset[].
// Line 3 -> An integer T, target.

// Output Format:
// --------------
// Print all the subsets.


// Sample Input-1:
// ---------------
// 7
// 1 2 3 5 6 8 10
// 10

// Sample Output-1:
// ----------------
// 1 3 6
// 2 3 5
// 2 8
// 10

import java.util.*;
class Main{
    
    static void print(int arr[],int tar,int i,ArrayList<Integer> temp,int flag[]){
        if(arr.length==i){
            if(tar==0){
                flag[0]=1;
                for(int j=0;j<temp.size();j++){
                    System.out.print(temp.get(j)+" ");
                }
                System.out.println();
            }
            return;
        }
        
        if(tar-arr[i]>=0){
            temp.add(arr[i]);
            print(arr,tar-arr[i],i+1,temp,flag);
            temp.remove(temp.size()-1);
        }
        print(arr,tar,i+1,temp,flag);
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int flag[]={0};
        ArrayList<Integer> temp=new ArrayList<Integer>();
        print(arr,target,0,temp,flag);
        if(flag[0]==0){
            System.out.print(-1);
        }
        
    }
}

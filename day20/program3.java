// There is a series of bulbs in which some bulbs are turned on(indicated by 1) 
// and others are off(indicated by 0). 

// A contiguous sub-series of bulbs CSB with following rules.
//     1. Number of bulbs with status as 'on' and 'off' are same.
//     2. Bulbs which are 'on' and 'off' are grouped together.

// You will be given the series as a string of 1's and 0's.
// Your task is to find the count of all the CSBs  exist in the given series.

// Input Format:
// -------------
// A string, indicates bulbs series.

// Output Format:
// --------------
// Print an integer result.

// Sample Input-1:
// ---------------
// 010011000110

// Sample Output-1:
// ----------------
// 9

// Explanation:
// ------------
// 01-3, 10-3, 0011-2, 1100-1 


// Sample Input-2:
// ---------------
// 0101010

// Sample Output-2:
// ----------------
// 6

// Explanation:
// ------------
// 01-3, 10-3



import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        ArrayList<Integer> temp=new ArrayList<Integer>();
        int i=0;
        while(i<s.length()){
            count=1;
            char c=s.charAt(i);
            i++;
            while(i<s.length() && s.charAt(i)==c){
                count++;
                i++;
            }
            temp.add(count);
        }
        int ans=0;
        for(i=0;i<temp.size()-1;i++){
            ans+=Math.min(temp.get(i),temp.get(i+1));
        }
        System.out.print(ans);
    }
}
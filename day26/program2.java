// In a theatre, there are N people stand in a line for tickets, 
// male represented with 1 and female represented with 0.
 
// Theater management decides to issue the tickets in such a way that
// if one ticket issued to a male, next ticket should be issued to a female only, 
// and vice versa.
 
// In order to follow it, they planned to make few alterations in the line itself, 
// so that no two adjacent persons have same gender.
  
// You are given a binary string S, represents intial order of the people in the line.
// In one alteration, you can replace one female '0' with a  male '1' or vice versa.
 
// Your task to find and print the minimum number of alterations needed 
// to make the line to follow alternate gender sequence.
 
// Input Format:
// -------------
// A binary String, S.
 
// Output Format:
// --------------
// Print an integer, minimum number of alterations.
 

// Sample Input-1:
// ---------------
// 1001

// Sample Output-1:
// ----------------
// 2

 
// Sample Input-2:
// ---------------
// 101101
 
// Sample Output-2:
// ----------------
// 3


import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int c1=0, c2=0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if((i%2==0 && c=='1') || (i%2==1 && c=='0')){
                c1++;
            }
            if((i%2==0 && c=='0') || (i%2==1 && c=='1')){
                c2++;
            }
        }
        System.out.println(Math.min(c1,c2));
    }
}
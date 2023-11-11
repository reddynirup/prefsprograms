/* 
Vishal has given a task to find the successor of a given alphabet 'alp' 
in a given string str[]. The alphabets in the given string str[] are 
all lowercase letters and always in non-decreasing order.

A successor of 'alp' is the next smallest alphabet exist in the string str[],
which is greater than 'alp'. Assume that alphabets can be considered in 
cyclic fashion. For example: Successor for alp='z' in str[]="bcd" is 'b'.

Help Vishal to return the answer.

Can you solve it in O(log(n)) complexity?

Input Format:
-------------
Line-1:A string str[]
Line-2: a character represents an alphabet.
 
Output Format:
--------------
Print a character which is the successor.
 
Constraints:
 2 <= str.length<= 10^4
'alp' is a lowercase letter.

 
Sample Input-1:
---------------
adghijl
f 
Sample Output-1:
----------------
g

Sample Input-2:
---------------
abcdefghi
j

Sample Output-2:
----------------
a
*/


import java.util.*;
class Test{
    public static char Successor(String str,char ch){
        if(ch<str.charAt(0)){
            return str.charAt(0);
        }
        else if(ch>str.charAt(str.length()-1)){
            return str.charAt(0);
        }
        int low=0;
        int high=str.length()-1;
        while(low<=high){
            int mid=(low+high)/2;
            if((str.charAt(mid)>ch) && (str.charAt(mid-1)<=ch)){
                return str.charAt(mid);
            }
            else if(str.charAt(mid)<ch){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return str.charAt(0);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c=sc.next().charAt(0);
        char ans=Successor(s,c);
        System.out.print(ans);
    }
}
/*Factorial of N means, Product first N natural numbers.
e.g., N= 1 * 2 * 3 * ... * N.

You are given an integer N, Your task is to find out the number of 0's 
at the end of the factorial value of N.

for example : N =5 => Factorial of 5 is 120.
0' s at the end of 120 are 1.

Constraint : 1<= N <= 10000

Input Format:
-------------
An integer N

Output Format:
--------------
Print an integer, number of 0's at the end.


Sample Input-1:
---------------
5

Sample Output-1:
----------------
1


Sample Input-2:
---------------
4

Sample Output-2:
----------------
0
*/


import java.util.*;
class Test{
    static int find(int n){
        if(n==0)return 0;
        return n/5+find(n/5);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=find(n);
        System.out.print(s);
    }
}
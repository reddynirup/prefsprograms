/*There is a switch-board made by an electrician,
If you turn on any two adjacent switches, it will cause short-circuit
and damage the switch-board.

You are given N integers(only 0's and 1's), Indiactes current status of 
the switch board with N switches, where 1 indiactes switch is ON and 
0 indiactes switch is OFF. And an integer K, more number of switches 
to be turned ON.

Return true if and only if you can turn ON all the K switches, without 
causing any damage to switch-board. Otherwise return fasle.

Input Format:
-------------
Line-1: Two integers N and K, number of switches, and more number of switches to be ON
Line-2: N space separated integers, only 0's and 1's.

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
5 1
1 0 0 0 1

Sample Output-1:
----------------
true

Sample Input-2:
---------------
5 2	
1 0 0 0 1

Sample Output-2:
----------------
flase
*/



import java.util.*;
class Test{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int n=sc.nextInt();
        int arr[]=new int[s];
        for(int i=0;i<s;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<s;i++){
            if(arr[i]==0 && (i==0 || arr[i-1]==0) && (i==s-1 || arr[i+1]==0)){
                count++;
                arr[i]=1;
            }
        }
        System.out.print(count>=n);
    }
}
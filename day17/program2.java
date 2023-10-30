/*Every kid enjoys getting out of the classroom and exploring, and 
school excursions are one of the finest ways to do so. 

ABC School organised a field trip for its students. Students are requested 
to form a line, and their heights are supplied to you. You need to make 
the students to stand in ascending order of their heights. 

Your task is to find out, the minimum number of students who must change 
their positions in order to make every student to stand in ascending order.

Note: When a student is selected, the student can change position in a 
possible way among all of them, and 
the other students remain in their positions.

Input Format:
-------------
Line-1: An integer N, number of the students.
Line-2: N space separated integers, heights of the students.

Output Format:
--------------
Print an integer, minimum number of moves.


Sample Input-1:
---------------
6
1 1 4 2 1 3

Sample Output-1:
----------------
3

Explanation:
------------
Initially Heights are as follows : [1,1,4,2,1,3] 
Targeted Heights are as follows : [1,1,1,2,3,4] 
On index 2: you have 4 vs 1 so you have to change the position of student. 
On index 4: you have 1 vs 3 so you have to change the position of student. 
On index 5: you have 3 vs 4 so you have to change the position of student. 


Sample Input-2:
---------------
5
5 1 4 2 3

Sample Output-2:
----------------
5

*/

/*there may be a better solution than this try it  */
/*one of the approach is to create another array and sort and compare it with actual array and coutnnumber of mismatches */

import java.util.*;
class Main{
    static int find(int arr[],int min,int max,int s){
        
        //storing count of each values
        HashMap<Integer,Integer> count_of_values=new HashMap<>();
        for(int i=0;i<s;i++){
            count_of_values.put(arr[i],count_of_values.getOrDefault(arr[i],0)+1);
        }
        
        int number_of_mismatch=0;
        int pos=0;
        for(int i=min;i<=max;i++){
            if(count_of_values.get(i)!=null){
                int count=count_of_values.get(i);
                for(int j=0;j<count;j++){
                    if(arr[pos]!=i){
                        number_of_mismatch++;
                    }
                    pos++;
                }
            }
        }
        return number_of_mismatch;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            min=Math.min(min,arr[i]);
            max=Math.max(max,arr[i]);
        }
        int ans=find(arr,min,max,n);
        System.out.print(ans);
    }
}
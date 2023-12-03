/*
Viraj Aanand is a wedding planner, He order his assistant to decorate a wall.
The decorator plans to decorate the wall with two different colored balloons.
The wall size is M*N, The decorator can decorate the wall using M*N balloons
the balloons are blue or white in color.

Blue colored ballons represented with digit-1 and 
White colored ballons represented with digit-0.

The blue colored balloons forms different shapes, that are connected 4 directonally.
The directons are upwards, downwards, left, and right. Viraj Aanand got an idea to 
count the unique shapes formed by blue colored ballons.

You will be given the decorated wall as a matrix wall[][].
Your task is to help, Viraj Aanand to count the unique shapes.

Input Format:
-------------
Line-1: Two space separated integers M and N, size of the wall.
Next M lines: N space separated integers, either 0 or 1.

Output Format:
--------------
Print an integer, Number of distinct shapes formed by blue balloons.


Sample Input-1:
---------------
4 5
1 1 0 0 0
1 1 0 0 0
0 0 0 1 1
0 0 0 1 1

Sample Output-1:
----------------
1


Sample Input-2:
---------------
5 5
1 1 0 1 1
1 0 0 0 1
0 0 0 0 0
1 0 0 0 1
1 1 0 1 1

Sample Output-2:
----------------
4

Note: 
-------
The shapes, 
1 1  		  1 1
1     and    1 
are different.
*/

import java.util.*;
class Island{
    int numberOfDistI(int arr[][]){
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==1){
                    StringBuilder s=new StringBuilder();
                    find(arr,i,j,s);
                    hs.add(s.toString());
                }
            }
        }
        return hs.size();
    }
    boolean isSafe(int arr[][],int x,int y){
        if(x>=0 && x<arr.length && y>=0 && y<arr[0].length && arr[x][y]==1)return true;
        return false;
    }
    void find(int arr[][],int x,int y,StringBuilder s){
        int adj[][]={{0,-1},{0,1},{-1,0},{1,0}};
        char dir[]={'l','r','u','d'};
        int count=0;
        
        for(int a[]:adj){
            int i=x+a[0];
            int j=y+a[1];
            if(isSafe(arr,i,j)){
                arr[i][j]=0;
                s.append(dir[count]);
                find(arr,i,j,s);
            }
            else{
                s.append("b");
            }
            count++;
        }
    }
    
}


class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Island il=new Island();
        int numOfDistinctIsland=il.numberOfDistI(arr);
        System.out.print(numOfDistinctIsland);
    }
}
'''
Arjun wants to build a swimming pool, in the backyard of his farm-house.
The backyard has an empty land of size m*n. 
Some part of the backyard is used to build the swimming pool
You will be given the m*n grid values (0's and 1's). 
where 1 indicates swimming pool, and 0 indiactes empty land.

Your task to find the perimeter of the swimming pool.

Note: There is only one swimming pool.

Input Format:
-------------
Line-1: Two integers M and N, size of the backyard.
Next M lines: N space separated integers, either 0 or 1
0- represents empty land and 1- represents the swimming pool 

Output Format:
--------------
Print an integer, the perimeter of the swimming pool


Sample Input-1:
---------------	
4 4
0 1 0 0
1 1 1 0
0 1 0 0
1 1 0 0
 
Sample Output-1:
----------------
16


Sample Input-2:
---------------
1 2
1 0
 
Sample Output-2:
----------------
4

For explanation of sample test cases given refer Hint-1.



Write your python code below
'''
def findPerimeter(l,m,n):
    p=0
    for i in range(0,m):
        for j in range(0,n):
            if l[i][j]==1:
                p=p+4
                if i>0  and l[i-1][j]==1:
                    p=p-1
                if j>0 and l[i][j-1]==1:
                    p=p-1
                if i<m-1 and l[i+1][j]==1:
                    p=p-1
                if j<n-1 and l[i][j+1]==1:
                    p=p-1
    return p

m,n=list(map(int,input().split()))
l=[]
for i in range(m):
    l.append(list(map(int,input().split())))
ans=findPerimeter(l,m,n)
print(ans)
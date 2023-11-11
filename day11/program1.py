'''
In a mango farm, you have two rows of mango trees. Each row represents 
an integer array, namely "fruitcount1" and "fruitcount2," 
sorted in ascending order to indicate the number of mangoes on each tree.

Your task is to find the trees having same count of trees in fruitcount1[],
 fruitcount2[] and the fruits count is least.
If there are no such common trees, return -1.

Input Format:
-------------------
Line-1: Two space separated integers, M and N
Line-2: M space separated integers, fruitcount1[]
Line-3: N space separated integers, fruitcount2[]

Output Format:
-------------------
Print an integer result.


Sample Input:
--------------
5 4
2 4 5 8 12
3 4 6 8

Sample Output:
---------------
4


Sample Input:
--------------
5 6
2 4 5 8 12
1 3 6 8 10 12

Sample Output:
--------------
8


Write your python code below.
'''

n,m=list(map(int,input().split()))
l1=list(map(int,input().split()))
l2=list(map(int,input().split()))
i=0
j=0
flag=True
while i<len(l1) and j<len(l2):
    if(l1[i]==l2[j]):
        print(l1[i],end="")
        flag=False
        break
    elif l1[i]>l2[j]:
        j=j+1
    else:
        i=i+1
if flag:
    print(-1)
        




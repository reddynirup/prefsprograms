'''
Given a sorted list of integers, 

Your task is to find the continuous range of numbers, make them as groups
and print all the groups as show in the sample testcases.

For example:
Given list is [ 1, 2, 3 ]: 1, 2, 3 is continuous range, grouped as 1->3
Given list is [ 1, 2, 4, 5, 7 ]: 1, 2 is continuous range, grouped as 1->2, 
4,5 grouped as 4->5, 7 is left alone.

Note: List contain no duplicates.

Input Format:
-------------
Line-1 -> Space separated integers in sorted order

Output Format:
--------------
Print the list of continuous range groups.


Sample Input-1:
---------------
5
1 2 4 5 7

Sample Output-1:
----------------
[1->2, 4->5, 7]

Explanation: 
------------
1,2 form a continuous range; 4,5 form a continuous range.


Sample Input-2:
---------------
9
1 2 3 5 6 7 9 10 12

Sample Output-2:
----------------
[1->3, 5->7, 9->10, 12]

Explanation: 
------------
1,2,3 form a continuous range 
5,6,7 form a continuous range
9,10 form a continuous range




Write your python code below
'''
def find(l):
    size=len(l)
    i=0
    ans=[]
    while i<size:
        start=l[i]
        end=l[i]
        i=i+1
        while i<size and end+1==l[i]:
            end=end+1
            i=i+1
        if start==end:
            ans.append(start)
        else:
            ans.append(str(start)+"->"+str(end))
    return ans;
        

n=int(input())
l=list(map(int,input().split()))
ans=find(l)
print(ans)




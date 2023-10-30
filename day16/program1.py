'''
Pranav is playing with numbers 2 and 5 only.
He is given an integer N consist of 2 and 5 only.
Pranav is trying to find the maximum number by 
altering atmost one digit in the given N  

Help pranav to find the maximum number.

Input Format:
-------------
An integer N, consist of 2 and 5

Output Format:
--------------
Print the maximum number.


Sample Input-1:
---------------
5225

Sample Output-1:
----------------
5525

Explanation:
---------------
alter the 1st digit-> 2225
alter the 2nd digit-> 5525.
alter the 3rd digit-> 5255.
alter the 4th digit->5222.
So, The maximum number is 5525.

Sample Input-2:
---------------
52525

Sample Output-2:
----------------
55525

Sample Input-3:
---------------
2555

Sample Output-3:
----------------
5555


Write your python code below
'''
num=int(input())
str_num=str(num)
ans=str_num
for i in range(len(str_num)):
    if str_num[i]=='2':
        ans=str_num[:i]+'5'+str_num[i+1:]
        break
print(ans)
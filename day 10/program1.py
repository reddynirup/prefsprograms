'''
In the context of linguistic harmony, we define a "harmonious string" as a string where every alphabet it contains appears both in uppercase and lowercase forms. For instance, a string like "pqQpP" is harmonious because it has both 'P' and 'p' as well as 'Q' and 'q'. Conversely, a string like "pqP" is not harmonious as it fails to meet this condition, with 'q' present while 'Q' is absent.

Your are given a string S, your task is  to return the longest harmonious substring in S. 
If there are multiple answers meeting this criterion, you should return the one that appears 
earliest in the string. If there is no harmonious substring, you should return an empty string.

Input Format:
-------------------
A string S

Output Format:
-------------------
Prin the longest harmonious string.


Sample Input:
--------------
QcvcCcq

Sample Output:
---------------
cCc


Sample Input:
--------------
pqrs

Sample Output:
--------------
""

Write your python code below.
'''


s=input()
l=len(s)
max_length=0
result=""

for i in range(0,l):
    for j in range(i,l+1):
        substring=s[i:j]
        temp=True
        for letter in substring:
            if letter.islower():
                if not substring.count(letter.upper()):
                    temp=False
                    break
            else:
                if not substring.count(letter.lower()):
                    temp=False
                    break
        if temp:
            count=len(substring)
            if count>max_length:
                max_length=count
                result=substring
print(result,end="")

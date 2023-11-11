'''
The Valid shortcuts of a string "abcd", are as follows:
abcd, abcd, a1cd, ab1d, abc1, 2cd, a2d, ab2, 1b1d, 1bc1,a1c1, 1b2, 2c1, 3d, a3, 4

You are given a string S and shortcut string  SC, 
Your task is to find out whether the string matches with the given shortcut or not.
if matched print true, else false.

Note:
String S contains only lowercase letters and String SC contains only 
lowercase letters and digits.

Input Format:
-------------
Two space separated Strings S and SC

Output Format:
--------------
Print a boolean value


Sample Input-1:
---------------
internationalization i12iz4n

Sample Output-1:
----------------
true


Sample Input-2:
---------------
apple a2e

Sample Output-2:
----------------
false



Write your python code below
'''



def isSame(s,s1):
    i,j=0,0
    while i<len(s) and j<len(s1):
        if s[i]==s1[j]:
            i+=1
            j+=1
        elif s1[j].isdigit():
            num=0
            while j<len(s1) and s1[j].isdigit():
                num=num*10 + int(s1[j])
                j+=1
            i+=num
        else:
            return False
    return i==len(s) and j==len(s1)
s,s1=input().split()
print(isSame(s,s1))





# s, sc = input().split(" ")
# i = 0
# j = 0
# flag = True

# while i < len(sc) and j < len(s):
#     if sc[i] >= '0' and sc[i] <= '9':
#         num = 0
#         while i < len(sc) and sc[i] >= '0' and sc[i] <= '9':
#             num = num * 10 + int(sc[i])
#             i = i + 1
#         j = j + num
#     else:
#         if s[j] != sc[i]:
#             flag = False
#             break
#         j = j + 1
#         i = i + 1

# if i == len(sc) and j == len(s):
#     flag = True
# else:
#     flag = False

# print(flag)


        
        
        
        
        
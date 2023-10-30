'''
Clavius, the person who suggested grouping of data using brackets.
He has suggested that the grouping should be well formed.
Well formed groupings are as follows, (), [], {}, {()}, {[]()}, {[]}(), etc.

You will be given a string S, return true if the string S is a well formed 
grouping, otherwise false.

Note: S contains only characters ( ) [ ] { }

Input Format:
-------------
A string S, contains only characters (){}[]

Output Format:
--------------
Print a boolean value.


Sample Input-1:
---------------
{[([])[]]}

Sample Output-1:
----------------
true


Sample Input-2:
---------------
{[([])[]}]

Sample Output-2:
----------------
false



Write your python code below
'''
#optimized or short
def well(s):
    a=[]
    mapping={')':'(',']':'[','}':'{'}
    for char in s:
        if char in '({[':
            a.append(char)
        else:
            if not a or a.pop()!=mapping[char]:
                return False
    return len(a)==0
s=input().strip()
r=well(s)
print(r)





#my solution
# s = input()
# stack = []
# ans = True

# for x in s:
#     if x == '[' or x == '{' or x == '(':
#         stack.append(x)
#     else:
#         if not stack:
#             ans = False
#             break
#         if (x == ']' and stack[-1] == '[') or (x == '}' and stack[-1] == '{') or (x == ')' and stack[-1] == '('):
#             stack.pop()
#         else:
#             ans = False

# print(ans)

        
        
        
        

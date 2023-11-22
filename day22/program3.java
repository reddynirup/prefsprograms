// Given a classic mobile phone, and the key pad of the phone looks like below.
// 	1		2		3
//            abc	   def
		 
// 	4		5		6
//     ghi    jkl     mno
  
// 	7		8		9
//     pqrs    tuv     wxyz
	
// 	*		0		#


// You are given a string S contains digits between [2-9] only, 
// For example: S = "2", then the possible words are "a", "b", "c".

// Now your task is to find all possible words that the string S could represent.
// and print them in a lexicographical order. 

// Input Format:
// -------------
// A string S, consist of digits [2-9]

// Output Format:
// --------------
// Print the list of words in lexicographical order.


// Sample Input-1:
// ---------------
// 2

// Sample Output-1:
// ----------------
// [a, b, c]


// Sample Input-2:
// ---------------
// 24

// Sample Output-2:
// ----------------
// [ag, ah, ai, bg, bh, bi, cg, ch, ci]



import java.util.*;
class Main{
    public static void backtracking(ArrayList<String> ans,int i,String[] re,StringBuilder curr){
        if(i==re.length){
            ans.add(curr.toString());
            return;
        }
        for(char c:re[i].toCharArray()){
            curr.append(c);
            backtracking(ans,i+1,re,curr);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
    
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String arr[]={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        String re[]=new String[s.length()];
        
        for(int i=0;i<s.length();i++){
            int c=s.charAt(i)-'0';
            re[i]=arr[c-2];
        }
        ArrayList<String> ans=new ArrayList<>();
        StringBuilder curr=new StringBuilder();
        backtracking(ans,0,re,curr);
        System.out.print(ans);
    }
}
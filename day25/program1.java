// There are some cubes, and each cube has an alphabet (from A to Z) 
// printed on it. You can construct different, non-empty words using these 
// cubes and each of the word length should be 0 < length <= number of cubes.

// You are given a string of alphabets S, 
// Your task is to findout number of possible non-empty distinct words

// Input Format:
// -------------
// A string S, consist of A-Z letters only.

// Output Format:
// --------------
// Print an integer, number of possible non-empty distinct words.


// Sample Input-1:
// ---------------
// EGG

// Sample Output-1:
// ----------------
// 8

// Explanation:
// --------------
// The possible distinct words are "E", "G", "EG", "GG", "GE", "EGG", "GEG", "GGE".


// Sample Input-2:
// ---------------
// MADAM

// Sample Output-2:
// ----------------
// 89


import java.util.*;

public class Main {

    static Set<String> distinctWords = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        int n = s.length();
        String temp = "";
        int[] vis = new int[n];
        helper(0, s, temp, n, vis);
        System.out.println(distinctWords.size());
    }

    static void helper(int ind, String s, String temp, int n, int[] vis) {
        if (ind == n) {
            return;
        }
        for (int i = 0; i < n; i++) {
            if (vis[i] == 0) {
                vis[i] = 1;
                temp += s.charAt(i);
                distinctWords.add(temp);
                helper(ind + 1, s, temp, n, vis);
                temp = temp.substring(0, temp.length() - 1);
                vis[i] = 0;
            }
        }
    }
}

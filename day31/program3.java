// Few people are living in a township of size N*N, where each 1*1 part 
// of the township is either a villa or a swimming pool. 
// You are given the structure of township as a 2d matrix of size N*N, 
// filled with 0's and 1's, where '0'-indicates a swimming pool and 
// '1'- indiactes a villa. 

// Your task is to find a swimming pool, such that its distance to 
// the nearest villa(s) is maximized, and return the distance.

// If the township contains only the villas or only swimming pools, print '-1'. 

// The distance used in this problem is the Manhattan distance: 
// the distance between two cells (a0, b0) and (a1, b1) is |a0 - a1| + |b0 - b1|


// Input Format:
// -------------
// Line-1: An integer N, size of the 2d matrix.
// Next N lines: N space separated integers, matrix[][] either 0 or 1.

// Output Format:
// --------------
// An integer, maximum distance.


// Sample Input-1:
// ---------------
// 4
// 1 0 1 1
// 0 0 0 0
// 1 0 1 0
// 1 0 0 1

// Sample Output-1:
// ----------------
// 2

// Explanation: 
// ------------
// The swimming pool at (1, 1) is with distance 2 from the nearest villas.


// Sample Input-2:
// ---------------
// 4
// 1 0 0 0
// 0 0 0 0
// 1 0 0 0
// 0 1 0 1

// Sample Output-2:
// ----------------
// 3

// Explanation: 
// ------------
// The swimming pool at (0,3) or (1, 2) are with distance 3 from the nearest villas.

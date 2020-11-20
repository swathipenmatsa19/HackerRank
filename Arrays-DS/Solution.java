/*


Function Description
Complete the function reverseArray in the editor below.
reverseArray has the following parameter(s):
int A[n]: the array to reverse
Returns
int[n]: the reversed array
Input Format
The first line contains an integer, , the number of integers in . 
The second line contains  space-separated integers that make up .

Constraints
1 <= N <= 10 ^ 3
1 <= A[i]  <= 10 ^ 4

Sample Input 1 
4
1 4 3 2
Sample Output 1
2 3 4 1



*/


import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); 
            int n = sc.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i ++) {
                a[i] = sc.nextInt();
            }
            for(int i = n-1; i >= 0; i --) {
                System.out.print(a[i]+ " ");
            }
    }

}














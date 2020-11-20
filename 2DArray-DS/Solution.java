/*

Function Description
Complete the function hourglassSum in the editor below.
hourglassSum has the following parameter(s):
int arr[6][6]: an array of integers
Returns
int: the maximum hourglass sum
Input Format
Each of the  lines of inputs  contains  space-separated integers .

Constraints

-9 <= arr[i][j] <= 9
0 <=i,j <= 5

Output Format
Print the largest (maximum) hourglass sum found in .

Sample Input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0

Sample Output
19


*/



import java.io.*;
import java.math.*;
import java.util.*;

public class Solution {
    
    public static int hourGlassSum(int a[][],int i, int j) {
        int sum = 0;
    
        sum = a[i][j] + a[i][j+1] + a[i][j + 2] + a[i + 1][j + 1] + a[i +2][j] + a[i + 2][j+1]+ a[i+2][j+2];
        return sum;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[6][6];
        for(int i = 0; i < 6; i++) {
            for(int j = 0; j < 6; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int max = - 64;
        for(int i = 0; i < 4; i++) {
            
            for(int j = 0; j < 4; j++) {
                int sum = hourGlassSum(a,i,j);
                if(sum > max) {
                    max = sum;
                }
            }
        }
        
        System.out.println(max);
        
    }
}


























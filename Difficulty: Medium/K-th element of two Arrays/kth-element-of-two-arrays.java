//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int k = Integer.parseInt(br.readLine().trim());

            String[] line1 = br.readLine().trim().split(" ");
            int[] arr1 = new int[line1.length];
            for (int i = 0; i < line1.length; i++) {
                arr1[i] = Integer.parseInt(line1[i]);
            }

            String[] line2 = br.readLine().trim().split(" ");
            int[] arr2 = new int[line2.length];
            for (int i = 0; i < line2.length; i++) {
                arr2[i] = Integer.parseInt(line2[i]);
            }

            Solution ob = new Solution();
            System.out.println(ob.kthElement(k, arr1, arr2));
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public long kthElement(int k, int arr1[], int arr2[]) {
        // code here
        int l1 = arr1.length, l2 = arr2.length;
        int n1 = 0, n2 = 0;
        int temp1 = 0, temp2 = 0;
        
        
        while(k >= 1){
            temp1 = n1 < l1 ? arr1[n1] : Integer.MAX_VALUE;
            temp2 = n2 < l2 ? arr2[n2] : Integer.MAX_VALUE;
            
            if(temp1 <= temp2){
                n1 ++;
            }
            
            else{
                n2 ++;
            }
            
            k --;
        }
         
        return Math.min(temp1, temp2);
    }
}
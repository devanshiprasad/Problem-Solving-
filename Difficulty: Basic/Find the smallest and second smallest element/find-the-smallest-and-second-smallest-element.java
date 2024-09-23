//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while (t-- > 0) {
            String inputLine[] = br.readLine().trim().split(" ");
            int n = inputLine.length;
            int arr[] = new int[(int)(n)];
            for (int i = 0; i < n; i++) {
                arr[i] = (int)(Long.parseLong(inputLine[i]));
            }

            Solution obj = new Solution();
            int[] product = obj.minAnd2ndMin(arr);
            if (product[0] == -1)
                System.out.println(product[0]);
            else
                System.out.println(product[0] + " " + product[1]);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int[] minAnd2ndMin(int arr[]) {
        // code here
        int n= arr.length;
        int[]res= new int[2];
        int min1= arr[0];
        int min2= Integer.MAX_VALUE;
        
        for(int i=1;i<n;i++){
            if(arr[i]<min1){
                min2= min1;
                min1=arr[i];
            }
            else if(arr[i]<min2 && arr[i]!=min1){
                min2= arr[i];
            }
        }
        if(n==1 || min2==Integer.MAX_VALUE){
            res[0]=-1;
        }
        else{
            res[0]=min1;
            res[1]=min2;
        }
        return res;
    }
}

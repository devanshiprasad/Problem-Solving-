//{ Driver Code Starts
// Initial Template for Java

// Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


// } Driver Code Ends
// User function Template for Java
class Solution {
   
    String roundToNearest(String str) {
        int n = str.length();
        
        // Extract the last digit of the string
        int lastDigit = Integer.valueOf(str.charAt(n-1) - '0');
        
        
        if (lastDigit == 0) {
            return str;
        } 
        
        else if (lastDigit <= 5) {
            return str.substring(0, n-1) + "0";
        } 
        
        else {
            StringBuilder res = new StringBuilder("0");
            for (int i = n-2; i >= 0 && str.charAt(i) != '-'; i--) {
               
                if (str.charAt(i) == '9') {
                    res.append("0");
                } 
            
                else {
                    return str.substring(0, i) + Integer.toString((str.charAt(i) - '0') + 1) + res.toString();
                }
            }
           
            if (str.charAt(0) == '-') {
                return "-" + res.toString();
            } 
           
            else {
                return "1" + res.toString();
            }
        }
    }
}

//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());

        // looping through all testcases
        while (testcases-- > 0) {

            String str = br.readLine().trim();

            Solution obj = new Solution();

            String res = obj.roundToNearest(str);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends
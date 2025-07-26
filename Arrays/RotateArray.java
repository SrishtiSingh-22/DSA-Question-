/*
 🔹 Question: Rotate Array
 🔹 Link:https://geeksforgeeks.com/problems/two-sum
 🔹 Description:
    Given an array arr[]. Rotate the array to the left (counter-clockwise direction) by d steps, 
     where d is a positive integer. Do the mentioned change in the array in place.

      Note: Consider the array as circular.
  🔹 Approach:
    Using reversal algorithm:
    1. Reverse first d elements
    2. Reverse remaining n-d elements
    3. Reverse the entire array

 🔹 Time Complexity: O(n)
 🔹 Space Complexity: O(1)
*/


// User function Template for Java

class Solution {
    static void reverse(int arr[],int s,int l){
        while(s<l){
            int temp = arr[s];
            arr[s]=arr[l];
            arr[l]=temp;
            s++;
            l--;
        }
    }
    // Function to rotate an array by d elements in counter-clockwise direction.
    static void rotateArr(int arr[], int d) {
        int n=arr.length;
        d=d%n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
        // add your code here
        
    }
}


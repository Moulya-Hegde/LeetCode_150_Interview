package Arrays;


/*
 189. Rotate Array

Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */

// Intuition: reverse each parts of array and then reverse the whole
class Solution {
    public void rotate(int[] nums, int k) {
        if (nums.length==1) return;
        int len=nums.length;
        int n=k%nums.length;
        int i=0,j=len-n-1;
        while (i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        i=len-n;
        j=len-1;
        while (i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
        i=0;
        j=len-1;
        while (i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
}
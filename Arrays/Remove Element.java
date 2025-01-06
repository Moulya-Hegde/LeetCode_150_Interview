package Arrays;

/*
    27. Remove Element

Given an integer array nums and an integer val, remove all occurrences of val in nums in-place. The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k, to get accepted, you need to do the following things:

Change the array nums such that the first k elements of nums contain the elements which are not equal to val. The remaining elements of nums are not important as well as the size of nums.
Return k.
Custom Judge:

 */
class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Pointer to track the next position to place non-val elements

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Move valid element to the front
                k++; // Increment k to track the number of valid elements
            }
        }

        return k;
    }
}

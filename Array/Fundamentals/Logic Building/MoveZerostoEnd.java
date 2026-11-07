class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]!=0){
                nums[j] = nums[i];
                j++;     
            } 
        }
        while(j<nums.length){
            nums[j] = 0;
            j++;
        }
    }
}

//In Python
class Solution:
    def moveZeroes(self, nums):
        j = 0;
        for i in range(len(nums)):
            if(nums[i]!=0):
                nums[j]=nums[i];
                j = j + 1;
        while(j<len(nums)):
            nums[j]=0;
            j = j+1;


/*  Approach
1. Use two pointers i and j.
2. Move non-zero elements to the front.
3. Fill remaining positions with zeroes.

## Complexity
- Time: O(n)
- Space: O(1) */
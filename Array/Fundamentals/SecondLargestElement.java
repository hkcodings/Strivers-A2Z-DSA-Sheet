class Solution {
    public int secondLargestElement(int[] nums) {
        int max = nums[0];
        int secondLargestElement = -1;

        for(int i=1; i<nums.length; i++) {
            if(max < nums[i]){
                secondLargestElement = max;
                max = nums[i];
            } else if (max > nums[i] && nums[i] > secondLargestElement) {
                secondLargestElement = nums[i];
            }
        }
        return secondLargestElement;
    }
}
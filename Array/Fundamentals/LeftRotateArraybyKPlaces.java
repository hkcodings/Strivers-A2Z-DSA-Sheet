class Solution {
    public void rotateArray(int[] nums, int k) {
        int i = 0;
        while(i<k) {
            int temp = nums[i];

            for(int j=1; j<nums.length;j++){
                nums[j-1] = nums[j];
            }
            nums[nums.length-1] = temp;
            i++;
        }
    }
}
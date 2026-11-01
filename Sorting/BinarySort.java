class Solution {
    public int[] bubbleSort(int[] nums) {
        int temp;
        int j=0;
        while(j<nums.length-1){
            for(int i=0; i < nums.length-1-j; i++){
            if(nums[i]>nums[i+1]){
                temp= nums[i];
                nums[i] = nums[i+1];
                nums[i+1]=temp;
            }
        }
        j++;
        }
         return nums;
    }
}
class Solution {
    public void rotateArray(int[] nums, int k) {
        int i = 0;
        while(i<k) {
            int temp = nums[0];

            for(int j=1; j<nums.length;j++){
                nums[j-1] = nums[j];
            }
            nums[nums.length-1] = temp;
            i++;
        }
    }
}

//Optimised one with O(n)

class Solution {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;

        if (n == 0) return;

        k = k % n;

        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}
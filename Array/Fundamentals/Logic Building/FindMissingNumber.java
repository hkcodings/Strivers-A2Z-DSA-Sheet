//This approach has time complexity O(nlogn) due to sorting method

import java.util.Arrays;
class Solution {
    public int missingNumber(int[] nums) {
        int x = nums.length;
        int i = 0;
        Arrays.sort(nums);
        for(i=0; i<x; i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return i;
    }
}

//Best approach is to use Sum = n(n+1)/2 or XOR method

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long numsTotal = ((long) n * (n + 1)) / 2;
        long actualTotal = 0;
        for (int i = 0; i < n; i++) {
            actualTotal += nums[i];
        }
        return (int)(numsTotal - actualTotal);
    }
}
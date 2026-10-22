class Solution {
    public int countDigit(int n) {
        int count = 1;
        while(n/10 != 0){
            count++;
            n = n/10;
        }
        return count;
    }
}
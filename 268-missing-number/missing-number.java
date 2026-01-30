class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int arrSum = 0;

        for (int num : nums) {
            arrSum += num;
        }

        int expectedSum = n * (n + 1) / 2;
        return expectedSum - arrSum;
    }
}

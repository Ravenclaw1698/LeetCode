import java.util.Scanner;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] array = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    array[0] = i;
                    array[1] = j;
                    return array;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int[] result = sol.twoSum(arr, target);
        if (result != null) {
            System.out.print(result[0] + " , " + result[1]);
        } else {
            System.out.print("No two elements sum to target.");
        }
    }
}
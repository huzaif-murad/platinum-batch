public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = { 3, 4, -1, 1, 2, 7 };
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] <= 0 || nums[i] >= n + 1) {
                nums[i] = n + 1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            int element = Math.abs(nums[i]);
            if (element == n + 1) {
                continue;
            }
            int seat = element - 1;
            if (nums[seat] > 0) {
                nums[seat] = -nums[seat];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                System.out.println("Missing number is : " + (i + 1));
                break;
            }
        }
    }
}

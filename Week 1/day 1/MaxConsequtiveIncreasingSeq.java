public class MaxConsequtiveIncreasingSeq {
    public static void main(String[] args) {
        int[] nums = { 10, 20, 30, 15, 25, 35, 45, 5 };

        int left = 0;
        int right = 1;
        int maxLen = 0;

        while (right < nums.length) {
            if (nums[right - 1] < nums[right]) {
                maxLen = Math.max(maxLen, right - left + 1);
                System.out.println("Left:" + left + " Right: " + right);
            } else {
                left = right;
                right++;
            }
            right++;
        }
        System.out.println(maxLen);
    }
}

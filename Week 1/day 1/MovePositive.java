import java.util.Arrays;

public class MovePositive {
    public static void main(String[] args) {
        int[] nums = { -1, 4, 6, -4, -6, 4 };

        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] > 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
            right++;
        }
        System.out.println(Arrays.toString(nums));
    }
}

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        int[] nums = { 2, 4, 5, 0, 2, 0, 4, 0, 0, 0, 3 };

        int left = 0;
        int right = 0;

        while (right < nums.length) {
            if (nums[right] != 0) {
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

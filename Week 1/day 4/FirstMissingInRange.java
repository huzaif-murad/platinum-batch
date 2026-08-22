import java.util.Arrays;

public class FirstMissingInRange {
    public static void main(String[] args) {

        int[] nums = { 2, 0 };
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[0] = -nums[0];
                break;
            }
        }
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            int seat = Math.abs(nums[i]);
            if (seat == nums.length) {
                continue;
            }
            if (nums[seat] == 0) {
                nums[seat] = -seat;
            }
            if (nums[seat] > 0) {
                nums[seat] = -nums[seat];
            }
        }
        System.out.println(Arrays.toString(nums));

    }
}

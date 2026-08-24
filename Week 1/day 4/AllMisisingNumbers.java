import java.util.ArrayList;
import java.util.Arrays;

public class AllMisisingNumbers {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(Arrays.toString(nums));
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int element = Math.abs(nums[i]);

            // if (element == nums.length) {
            // continue;
            // }

            int seat = element - 1;

            if (nums[seat] > 0) {
                nums[seat] = -nums[seat];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}

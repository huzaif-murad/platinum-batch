import java.util.Arrays;

public class CountSort {
    public static void main(String[] args) {
        int[] nums = { 1, 4, 1, 2, 7, 5, 2 };

        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int[] count = new int[largest + 1];

        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }

        System.out.println(Arrays.toString(nums));
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class RadixSorting {
    public static void main(String[] args) {

        int[] nums = { 123, 432, 312, 2, 431, 23, 45, 355 };

        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }
        int place = 1;
        while (place <= largest) {
            ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();
            for (int i = 0; i <= 10; i++) {
                buckets.add(new ArrayList<>());
            }

            for (int i = 0; i < nums.length; i++) {
                int key = (nums[i] / place) % 10;
                buckets.get(key).add(nums[i]);
            }
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                for (int num : buckets.get(i)) {
                    nums[index++] = num;
                }
            }
            place *= 10;

        }
        System.out.println(Arrays.toString(nums));
    }
}

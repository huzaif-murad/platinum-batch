import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] nums = { 23, 43, 123, 234, 154, 67, 132, 167, 345, 225, 115 };

        radixSort(nums);
    }

    public static void radixSort(int[] nums) {
        int largest = nums[0];

        for (int i = 1; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int place = 1;

        while (place <= largest) {
            ArrayList<ArrayList<Integer>> bucket = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                bucket.add(new ArrayList<Integer>());
            }
            for (int i = 0; i < nums.length; i++) {
                int key = (nums[i] / place) % 10;
                bucket.get(key).add(nums[i]);
            }

            int index = 0;
            for (int i = 0; i < 10; i++) {
                for (int num : bucket.get(i)) {
                    nums[index++] = num;
                }
            }

            place *= 10;
        }
        System.out.println(Arrays.toString(nums));
    }
}

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {

        int[] nums = { 23, 41, 25, 54, 18, 14 };
        System.out.println(Arrays.toString(nums));
        // bubbleSort(nums);
        // selectionSort(nums);
        insertionSort(nums);
    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    public static void selectionSort(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[minIndex];
            nums[minIndex] = nums[i];
            nums[i] = temp;
        }
        System.out.println(Arrays.toString(nums));

    }

    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int currElement = nums[i];
            int prev = i - 1;

            while (prev >= 0 && currElement < nums[prev]) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            nums[prev + 1] = currElement;
        }
        System.out.println(Arrays.toString(nums));
    }
}

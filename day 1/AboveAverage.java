public class AboveAverage {
    public static void main(String[] args) {
        int[] nums = { 23, 34, 45, -12, 23, 0, 54, -56 };
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        int average = sum / nums.length;
        int count = 0;
        for (int num : nums) {
            if (num > average) {
                count++;
            }
        }
        System.out.println(average);
        System.out.println(count);
    }
}

public class IntegersGreaterThanZero {
    public static void main(String[] args) {
        int[] nums = { 23, 34, 45, -12, 23, 0, 54, -56 };
        int count = 0;
        for (int num : nums) {
            if (num > 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

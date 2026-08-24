public class ThirdLargestElement {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        boolean flag = false;
        int[] nums = { 1, 2, 2, 5, 3, 5 };

        for (int num : nums) {
            if (num > max) {
                sec = max;
                max = num;
            } else if (num > sec && num != max) {
                third = sec;
                flag = true;
                sec = num;
            } else if (num > third && num != sec && num != max) {
                third = num;
                flag = true;
            }
        }

        if (flag) {
            System.out.println(third);
        } else {
            System.out.println(max);
        }

    }
}

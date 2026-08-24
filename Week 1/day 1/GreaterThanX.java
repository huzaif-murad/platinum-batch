import java.util.Scanner;

public class GreaterThanX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] nums = { 23, 34, 45, -12, 23, 0, 54, -56 };
        int count = 0;
        for (int num : nums) {
            if (num > x) {
                count++;
            }
        }
        System.out.println(count);
    }
}

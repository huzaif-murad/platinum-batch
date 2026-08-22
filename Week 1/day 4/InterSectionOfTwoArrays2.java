import java.util.ArrayList;
import java.util.Arrays;

public class InterSectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = i; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    list.add(nums1[i]);
                }
            }
        }

        int[] res = new int[list.size()];

        System.out.println(Arrays.toString(res));
    }
}

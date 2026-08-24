import java.util.ArrayList;
import java.util.Arrays;

public class InterSectionOfTwoArrays2 {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 2, 1 };
        int[] nums2 = { 2, 2 };
        int[] numsCounter = new int[10];
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            numsCounter[nums1[i]]++;
        }
        System.out.println(Arrays.toString(numsCounter));
        for (int i = 0; i < nums2.length; i++) {
            if (numsCounter[nums2[i]] > 0) {
                res.add(nums2[i]);
                numsCounter[nums2[i]]--;
            }
        }
        System.out.println(res);
        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int index = 0;

        for (int i = 0; i < res.size(); i++) {
            ans[index++] = res.get(i);
        }

        System.out.println(Arrays.toString(ans));
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MoreThanTwo {
    public static void main(String[] args) {
        int[] nums = { 20, 20, 10, 30, 40, 30, 50, 40 };
        ArrayList<Integer> result = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);

                if (count >= 2) {
                    result.add(nums[i]);
                }
            }
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] resultArray = new int[result.size()];

        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = result.get(i);
        }

        System.out.println(Arrays.toString(resultArray));
    }
}

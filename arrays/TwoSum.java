import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Two Sum
 * Approach: One-pass Hash Map
 * Time Complexity: O(n)
 * Space Complexity: O(n)
 */
public class TwoSum {

    public static int[] findTwoSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (numMap.containsKey(complement)) {
                return new int[] { numMap.get(complement), i };
            }

            numMap.put(nums[i], i);
        }

        return new int[] {}; // No solution found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTwoSum(numbers, target);

        if (result.length == 2) {
            System.out.println("Indices found: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No matching pair found.");
        }
    }
}

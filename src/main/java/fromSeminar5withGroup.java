import java.util.HashMap;
import java.util.Map;

public class fromSeminar5withGroup {
    public static void main(String[] args) {
        String text = "hdbfjdsmi nrfurne ierjifnfierjf";
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            map.putIfAbsent(currentChar, 0);
            map.put(currentChar, map.get(currentChar) + 1);
        }
        for (var entry : map.entrySet()) {
            System.out.println("Symbol '"+ entry.getKey() + "' : " + entry.getValue() );
            
        }
    }
}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int added = target - nums[i];
            if (map.containsKey(added)) {
                return new int[] {map.get(added), i};
            }
            map.put(nums[i], i);
        }
        return null;
    }
}





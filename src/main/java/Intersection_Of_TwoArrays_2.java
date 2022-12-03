public class Intersection_Of_TwoArrays_2 {
    public static void main(String[] args) {

        class Solution {
            public int[] intersect(int[] nums1, int[] nums2) {

                HashMap<Integer, Integer> map = new HashMap<>();
                for (int i = 0; i < nums1.length; i++) {
                    map.put(nums1[i], map.getOrDefault(nums1[i], 0) + 1);
                }

                List<Integer> list = new ArrayList<>();
                for (int i = 0; i < nums2.length; i++) {
                    if (map.getOrDefault(nums2[i], 0) > 0) {
                        list.add(nums2[i]);
                        if (map.get(nums2[i]) >= 1) {
                            map.replace(nums2[i], map.get(nums2[i]) - 1);
                        }
                    }
                }

                int[] answ = new int[list.size()];
                for (int i = 0; i < answ.length; i++) {
                    answ[i] = list.get(i);
                }
                return answ;
            }
        }

    }
}

public class Count_Common_Words_With_One_Occurrence {
    public static void main(String[] args) {
        class Solution {
            public int countWords(String[] words1, String[] words2) {
                HashMap<String, Integer> map = new HashMap<>();
                int count = 0;
                for(String s : words1){
                    map.put(s, map.getOrDefault(s, 0)+1);
                }
                for(String s: words2){
                    if(map.containsKey(s))
                        map.put(s, map.get(s) +1);
                }
                for(String s:words2){
                    if(map.containsKey(s) && map.get(s) == 2)
                        count++;
                }
                return count;
            }
        }

    }
}



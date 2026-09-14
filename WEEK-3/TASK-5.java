//TASK-5(SORT CHARCTERS BY FREQUENCY)
import java.util.*;
class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> count=new HashMap<>();
        for(char c:s.toCharArray()){
           count.put(c, count.getOrDefault(c, 0) + 1);
        }
     List<Character> list = new ArrayList<>(count.keySet());
        list.sort((a, b) -> count.get(b) - count.get(a));

        StringBuilder result = new StringBuilder();

        for (char c : list) {
            for (int i = 0; i < count.get(c); i++) {
                result.append(c);
            }
        }

        return result.toString();     
    }
}

//LARGEST NUMBER
import java.util.Arrays;
import java.util.Comparator;
class Solution {
    public String largestNumber(int[] nums) {
        String[] asStrs = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            asStrs[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(asStrs, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                String order1 = b + a;
                String order2 = a + b;
                return order1.compareTo(order2); 
            }
        });
        if (asStrs[0].equals("0")) {
            return "0"; 
        }
        StringBuilder largestNumberstr = new StringBuilder();
        for (String numAsStr : asStrs) {
            largestNumberstr.append(numAsStr);
        }

        return largestNumberstr.toString();
}
}

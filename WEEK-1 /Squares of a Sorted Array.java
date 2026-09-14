//SAMPLE INPUT AND OUTPUT
Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].
//CODE
import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        for(int i=0;i<nums.length-1;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(nums[j]>nums[j+1]){
                int temp=nums[j];
                nums[j]=nums[j+1];
                nums[j+1]=temp;}
            }
        }
        return nums;
    }
    public static void main(String a[]){
        Solution obj = new Solution();
        int[] result= obj.sortedSquares(new int[]{-4,-1,0,3,10});
         System.out.println(result);
    }
}

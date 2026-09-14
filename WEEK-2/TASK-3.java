//TASK-3.1(MAXIMUM SUBARRAY)
class Solution {
    public int maxSubArray(int[] nums) {
        int target=nums[0];
        HashSet<Integer> s=new HashSet<>();
        for(int x:nums){
            if(set.contains(target-x)){
                break;
            }
            set.add(x);
        }
        return target;
    }
}

//TASK-3.2(FIND THE HIGHEST ALTITUDE)
class Solution {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        
        for (int g : gain) {
            currentAltitude += g;
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        
        return maxAltitude;
    }
}

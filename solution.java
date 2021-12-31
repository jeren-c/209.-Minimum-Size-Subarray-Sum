class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0, range = Integer.MAX_VALUE, count = 0;
        for(;right<nums.length; right++){
            count += nums[right];
            while(count >= target){
                range = Math.min(right - left + 1, range);
                count -= nums[left];
                left++;
            }
        }
        if(count < target && left == 0) return 0;
        return range;
    }
}

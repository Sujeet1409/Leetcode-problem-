class Solution {
    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                result = mid; 
                if (isFirst) right = mid - 1; 
                else left = mid + 1;
            }
            else if (nums[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return result;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = findBound(nums, target, true);  
        ans[1] = findBound(nums, target, false); 
        return ans;
    }
}
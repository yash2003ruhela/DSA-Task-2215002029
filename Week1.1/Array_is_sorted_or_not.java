class Solution {
    public boolean check(int[] nums) {
        int count = 0;  // Count of "drop" points where nums[i] > nums[i+1]
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            // Check if the current element is greater than the next element
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            
            // If there is more than one drop point, return false
            if (count > 1) {
                return false;
            }
        }
        
        // If there is at most one drop point, return true
        return true;
    }
}

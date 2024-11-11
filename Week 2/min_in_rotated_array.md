```java
class Solution {
    public int findMin(int[] nums) {
        int left=0,mid=0,right=nums.length -1;
        while(left<right){
            mid= left+((right-left)/2);
            if(nums[mid]>nums[right]){
                left = mid+1;
            }else{
                right= mid;
            }
        }
        return nums[left];
        
    }
}
```
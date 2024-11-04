class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length-1;i++)
        {
            int sum=0;
            for(int j=i+1;j<nums.length;j++)
            {
                sum=nums[i]+nums[j];
                if(sum==target)
                {
                    int []ar=new int[2];
                    ar[0]=i;
                    ar[1]=j;
                    return ar;
                }
            }
        }
    int ar[]=new int[2];
    return ar;
    }
}

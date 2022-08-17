class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int c=target-nums[i];
            
            if(c==nums[j])
            {
                return new int[]{i,j};
            }
            }
        }
       throw new IllegalArgumentException("No match found"); 
}
}
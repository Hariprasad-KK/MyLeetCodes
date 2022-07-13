class Solution {
    public int pivotIndex(int[] nums) {
       int Lsum=0;
       int Tsum=0;
        
        int i=0;
        while(i<nums.length)
        {
           Tsum+=nums[i];
            i++;
        }
        
         i=0;
        while(i<nums.length)
        {
            if(Tsum - nums[i]==Lsum)
            {
                return i;
            }
            else{
                Lsum+=nums[i];
                Tsum-=nums[i];
                
            }
            i++;
        }
        return -1;
        
    }
}
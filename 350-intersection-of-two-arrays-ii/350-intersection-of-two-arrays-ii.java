class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int ans[]=new int[l1*l2];
        int i=0 ,j=0,k=0;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<l1 && j<l2)
        {
         if(nums1[i]<nums2[j])
         {
             i++;
         }
         else if(nums1[i]>nums2[j])
         {
             j++;
         }
        else
        {
            ans[k++]=nums1[i++];
            j++;
        }
            
        }
        return Arrays.copyOfRange(ans,0,k);
        
    }
}
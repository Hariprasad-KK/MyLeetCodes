class Solution {
    public int maxProfit(int[] prices) {
        int l1=prices.length;
        if(prices==null || l1<1)
        {
            return 0;
        }
        
        int result=0;
        int min=prices[0];
        
        for(int i=1;i<l1;i++)
        {
            result = Math.max(result,prices[i]-min);
            min=Math.min(min,prices[i]);
        }
        
        return result;
    }
}
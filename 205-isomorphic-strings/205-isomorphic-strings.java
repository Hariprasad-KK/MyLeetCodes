class Solution {
    public boolean isIsomorphic(String s, String t) {
       int[] mappingDT=new int[256];
           Arrays.fill(mappingDT,-1);
        int[] mappingDS=new int[256];
            Arrays.fill(mappingDS,-1);
        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
        
        if(mappingDT[c1]==-1 && mappingDS[c2]==-1)
        {
            mappingDT[c1]=c2;
            mappingDS[c2]=c1;
            
        }
        else  if(!(mappingDT[c1]==c2 && mappingDS[c2]==c1))
        {
           return false; 
        }
        }
        return true;
           
        
    } 
}
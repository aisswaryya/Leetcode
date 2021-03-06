class Solution {
    public int pivotIndex(int[] nums) {
        
        int total = 0;
        int left=0;
        for(int i=0;i<nums.length; total += nums[i++]);
                
        for( int i=0;i<nums.length; ++i){
            if(i!=0) left += nums[i-1];
            if(total-nums[i]-left == left )  return i;
               }
        
       return -1;  
    }
}

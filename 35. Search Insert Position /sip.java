class Solution {
    public int searchInsert(int[] nums, int target) {
       int val=0;
        for(int i=0;i< nums.length;i++){
            if(nums[i] == target){
                val=i;
                break;
            }
            else if (nums[i]>target){
                val=i;
                break;
            }
            else {
                val= nums.length;

            }
            
        }

        
        return val;
      
    }
}

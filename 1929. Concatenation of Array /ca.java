class Solution {
    public int[] getConcatenation(int[] nums) {

        int j= nums.length;
        int[] con = new int[2*j];
        for(int i=0;i<nums.length;i++){
            con[i] = nums[i];
            con[i+j]=nums[i];
        
        }
        return con;
    }
}

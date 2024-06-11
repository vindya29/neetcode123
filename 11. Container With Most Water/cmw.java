class Solution {
    public int maxArea(int[] height) {

        int area, res = 0;

            int left=0;
            int right = height.length-1;
            while(left<right){
                area = (right - left) * Math.min(height[left], height[right]);
                if (area > res) {
                    res = area;
                }

                if(height[left]<height[right]){
                    left++;
                }
                else if(height[left]>height[right]){
                    right--;
                }
                else{
                    left++;
                    right--;
                }
            }

            
        return res;

    }
}

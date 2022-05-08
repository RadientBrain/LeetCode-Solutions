class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length-1;
        int area = 0;
        
        while(start<end){
            
            int temp = Math.min(height[start],height[end])*(end-start);
            area = Math.max(area,temp);

            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;                
            }
        }
        return area;
    }
}

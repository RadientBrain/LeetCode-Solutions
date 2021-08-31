/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int x,y,z;
		x = findPeak(mountainArr);
		y = bin(mountainArr,0,x,target);
        if(y==-1){ z = bin(mountainArr,x,mountainArr.length()-1,target); return z; }
        return y;
    }
    
    public static int findPeak(MountainArray nums) {
        int start = 0;
        int end = nums.length() - 1;
        
        while(start<end){
            int mid = start + ((end - start)/2);
            if(nums.get(mid+1) > nums.get(mid)) start = mid+1;
            else end = mid;
        }
        
        return start; // or return end
    }
    
    public static int bin(MountainArray nums,int start, int end, int target) {
        
        boolean checkAsc = nums.get(start) < nums.get(end);
      
        while(start<=end){
            int mid = start + ((end - start)/2);
            if(target == nums.get(mid)) return mid;
          
            if(checkAsc){
              if(target < nums.get(mid)) end = mid-1;
              else start = mid+1;
            }else{
              if(target > nums.get(mid)) end = mid-1;
              else start = mid+1;
            }

        }
        return -1;
    }
}

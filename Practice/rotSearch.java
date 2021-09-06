class Solution {
    public int rotSearch(int[] arr, int target) {
        int x;
        x = rotsa(arr,target);
        return x;
    }
    
    public int rotsa(int [] arr, int target){
        int x,y;
        x = findPivot(arr);
        if(x==-1) return binSearch(arr,target,0,arr.length-1);
        if(arr[x]==target) return x;
        else{
            y = binSearch(arr,target,0,x-1);
            if(y==-1){
                y = binSearch(arr,target,x+1,arr.length-1);
            }   
        }
        return y;
    }
    
    public int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        
        while(start<=end){
            int mid=start + (end-start)/2;
            //Case 1..4
            if(mid<end && nums[mid+1]<nums[mid]) return mid;
            if(mid>start && nums[mid]<nums[mid-1]) return mid-1;
            if(nums[mid]<=nums[start]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        
        return -1;
    }
    
    public static int binSearch(int[] nums, int target,int start , int end) {
        
        while(start<=end){
            int mid = start + ((end - start)/2);
            if(target < nums[mid]) end = mid-1;
            else if(target > nums[mid]) start = mid+1;
            else return mid; 
        }
        
        return -1;
    }
}

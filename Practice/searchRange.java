class Solution {
    public int[] searchRange(int[] arr, int target) {
        int res[] = {-1,-1};
        
        int start = retIndex(arr, target, true);
        int end = retIndex(arr, target, false);
        
        res[0]=start;
        res[1]=end;
        
        return res;
    }
    
    public int retIndex(int[] arr, int target, boolean startIndex){
        int index,start, end, mid;
        index = -1;
        start = 0;
        end = arr.length-1;
        
        while(start<=end){
            mid = start + (end-start)/2;
            if(arr[mid]>target) end=mid-1;
            else if(arr[mid]<target) start=mid+1;
            else{
                index = mid;
                if(startIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return index;
    }
}

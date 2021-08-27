class Solution {
    public int searchInsert(int[] arr, int target) {
        int start,end,mid;
	    start = 0;
	    end = arr.length -1;
	    if(target > arr[arr.length-1]) return arr.length;
        if(target < arr[0]) return 0;
	    while(start<=end){
	        mid=start + (end-start)/2;
	        if(arr[mid]>target) end=mid-1;
	        else if(arr[mid]<target) start=mid+1;
	        else{
	            return mid;
	        }
	    }
	    return start;
    }
}

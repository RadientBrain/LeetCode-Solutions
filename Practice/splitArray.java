class Solution {
    public int splitArray(int[] arr, int m) {
      int start=0;
	    int end = 0;
	    
	    //setting start to the max elem in arr and end to sum of arr
	    for(int i=0;i<arr.length;i++){
	        start = Math.max(start,arr[i]);
	        end += arr[i];
	    }
	    
	    //custom binary Search
	    while(start<end){
	        int mid=start+(end-start)/2;
	        int subSum=0;
	        int partitions=1;
	        
	        for(int subi : arr){
	            if(subSum+subi<=mid) subSum+=subi;
	            else{
	                subSum=subi;
	                partitions++;
	            }
	        }
	        
	        if(partitions<=m) end=mid;
	        else start=mid+1;
	    }
	    
	    return start;//or end
    }
}

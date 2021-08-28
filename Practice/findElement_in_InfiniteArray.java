/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int [] arr = {5,7,8,9,10,11,12,14,25,27,33,35,55,67,777,7543,66666,99999};
		int target = 55;
    ceil(arr,target);		
	}
	
	public static void ceil(int[] arr, int target){
	    int start,end,x;
	    start =0;end=1;
	    
      //OR while(target>arr[end])
	    while(true){
	        if(target>=arr[start] && target<=arr[end]){
	            x=bin(arr,start,end,target);
	            System.out.println(x);
	            break;
	        }
	        else{
	            int temp_end=end;
	            int temp_start = start;
	            start = temp_end+1;
	            end=end+(end-temp_start)*2;
	        }
	    }
	}
	
	public static int bin(int[] nums, int start, int end, int target){
        while(start<=end){
            int mid = start + ((end - start)/2);
            if(target < nums[mid]) end = mid-1;
            else if(target > nums[mid]) start = mid+1;
            else return mid;
        }
        
        return -1;
	}
}

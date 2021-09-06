/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int[] arr = {15, 18, 2, 3, 6, 12};
		int x = findPivot(arr);
		if(x==(arr.length-1))System.out.println("A rotated 0 times");
		else System.out.println("Array is rotated "+(x+1)+" times");
	}
	
	public static int findPivot(int[] arr){
	    int start,end,mid;
	    start=0;
	    end=arr.length-1;
	    mid=start +(end-start)/2;
	    
	    while(start<=end){
	        mid=start +(end-start)/2;
	        if(mid<end && arr[mid]>arr[mid+1]) return mid;
	        else if(mid>start && arr[mid]<arr[mid-1]) return mid-1;
	        else if(arr[start]>arr[mid]) end=mid;
	        else if(arr[start]<arr[mid]) start=mid+1;
	        else return end;
	    }
	    
	    
        return -1;
	}
}

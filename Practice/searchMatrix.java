// O( m * logn ) solution

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int start=0;
        int end = matrix.length-1;
        int submat = matrix[0].length-1;
        
        while(start<end){
            int mid = start + (end-start)/2;
            if(matrix[mid][0]>target) end = mid-1;
            else if(matrix[mid][0]<= target && matrix[mid][submat] >= target){end = mid; break;} 
            else {
                start = mid+1;
            }
        }
        if(end>-1)
        for(int i: matrix[end]){
            if(i == target) return true;
        }
        return false;
    }
}

import java.util.*;

// Put the absolute highest at the end of the new array using 2 pointers

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int ptr1 = 0;
        int ptr2 = nums.length - 1;
        
        for(int i = ptr2;i>=0;i--){
            if(Math.abs(nums[ptr1]) >  Math.abs(nums[ptr2])){
                res[i] = nums[ptr1]*nums[ptr1];
                ptr1++;
            }else{
                res[i] = nums[ptr2]*nums[ptr2];
                ptr2--;
            }
        }
        return res;
    }
}

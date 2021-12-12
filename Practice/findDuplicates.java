class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }
        //System.out.print(Arrays.toString(nums));
        List<Integer> list = new ArrayList<>();
        for(i=0;i<nums.length;i++){
            if(i != nums[i]-1){
                list.add(nums[i]);
            }
        }
        
        return list;
    }
    
    void swap(int[] nums, int first, int second){
        int temp=0;
        temp = nums[first];
        nums[first]=nums[second];
        nums[second]=temp;
    }
}

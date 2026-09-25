class Solution {
    public int firstMissingPositive(int[] nums) {
        Set<Integer> data=new HashSet<>();
        int count=1;
        for(int i=0;i<nums.length;i++){
            data.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(data.contains(count)){
                count++;
            }else{
                return count;
            }
        }
        return count;
    }
}
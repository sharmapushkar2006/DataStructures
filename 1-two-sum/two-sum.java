class Solution {
    public int[] twoSum(int[] nums, int target) {
       HashMap<Integer,Integer> data=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        int diff=target-nums[i];
        if(data.containsKey(diff)){
            return new int[]{data.get(diff),i};
        }
        data.put(nums[i],i);
       }
       return new int[]{};
    }
}

//[1,2,3,4,5,6,7]
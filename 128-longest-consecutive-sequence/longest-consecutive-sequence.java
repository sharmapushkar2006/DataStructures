class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> data=new HashSet<>();
       int ans=0;


       for(int i=0;i<nums.length;i++){
        data.add(nums[i]);
       }

       for(int num : data){
        if(!data.contains(num-1)){
            int currentpos=num;
            int sequence=1;
            while(data.contains(currentpos+1)){
                sequence++;
                currentpos++;
            }
            ans=Math.max(ans,sequence);
        }

       }

       return ans;
    }
}
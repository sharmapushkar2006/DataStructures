class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> data = new HashSet<>();
        for(int num : nums){
            if(!data.contains(num)){
                data.add(num);
            }
            else{
                return true;
            }
        }
        return false;
    }
}
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right=numbers.length-1;
        int left=0;

        while(left<right){
            int t=numbers[left]+numbers[right];

            if(t==target){
                return new int[]{left+1,right+1};
            }

            else if(t<target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{};
    }
}
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] left=new int[nums.length];
        int[] right=new int[nums.length];
        int[] answer=new int[nums.length];
        int lp=1;
        int rp=1;
        for(int i=0;i<nums.length;i++){
            left[i]=lp;
            lp*= nums[i];
            // [1,2,6,24];
        }
        for(int i=nums.length-1;i>=0;i--){
            right[i]=rp;
            rp*= nums[i];
            //[]
        }
        for(int i=0;i<nums.length;i++){
            int sol=left[i]*right[i];
            answer[i]=sol;
        }
        return answer;
    }
}
// [1,2,3,4]

//In this question :
//       1. Find out left product of a number at every index
//       2. Then we will find the right product of each number at every index
//       3. Then for each number we are on, we will mulitply the left and right product which we calculated and saved in left and right arrays.
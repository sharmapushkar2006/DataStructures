class Solution {
    public boolean isPalindrome(String s) {
        String input=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        if(input=="")return true;
        int left=0;
        int right = input.length()-1;
        while(left<right){
            if(input.charAt(left)!= input.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}
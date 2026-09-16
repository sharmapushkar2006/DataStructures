class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len=m+n;
        for(int i=0;i<len;i++){
            if(i<m){
                //do nothing
            }
            else{
                nums1[i]=nums2[i-m];
            }
            
        }
        Arrays.sort(nums1);
    }
}

// [1,2,3,0,0,0] 
// [2,5,6]

// m=3, n=3
//len=6
// i=0 nums1[0]=1
// i=1 nums1[1]=2
// i=2 nums1[2]=3
// i=3 nums1[3]=nums2[3-3]  
// i=4 nums1[4]=nums2[4-3]
// i=5 nums1[5]=nums2[5-3]

//final nums1=[1,2,3,2,5,6]
//sort it = [1,2,2,3,5,6]
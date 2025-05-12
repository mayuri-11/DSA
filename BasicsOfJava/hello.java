//package BasicsOfJava;
class hello{
    public static  void main(String[] args) {
        int k = 2;
        int [] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,k));
    }

    public static int findKthLargest(int[] nums, int k) {
        int n= nums.length;
        int temp = 0;
        for(int i=0;i<n;i++){
            for(int j=0; j<n;j++){
                if(nums[i] > nums[j]){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        int ans = nums[n-k];
        return ans;
    }

}
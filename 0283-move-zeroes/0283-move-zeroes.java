class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        //Bubble Sort :

        for(int x = 0; x<n-1; x++){
            boolean flag = true;
            for(int i = 0; i<n-1-x; i++){
                if(nums[i] == 0){
                    int temp = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = temp;
                    flag = false;
                }
            }
            if(flag == true) break;
        }
    }
}
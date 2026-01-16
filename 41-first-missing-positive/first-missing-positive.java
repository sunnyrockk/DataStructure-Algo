class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        
        for(int i = 0; i < n; i++) {
            // correct index for nums[i] should be nums[i] - 1
            while(nums[i] > 0 && nums[i] <= n && nums[i] != nums[nums[i]-1]) {
                swap(nums, i, nums[i] - 1);
            }
        }
        
        // after placement, first index where nums[i] != i+1 is answer
        for(int i = 0; i < n; i++) {
            if(nums[i] != i + 1) return i + 1;
        }
        
        // else answer is n+1
        return n + 1;
    }
    
    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

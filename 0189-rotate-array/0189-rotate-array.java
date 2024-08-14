class Solution {
    public void rotate(int[] nums, int k) {
    
    k = k % nums.length;
    int rotater[]=new int[nums.length];
    for(int i=0;i<nums.length;i++){
        rotater[(k + i) % nums.length] = nums[i];
    }
    for(int i=0;i<nums.length;i++){
        nums[i]=rotater[i];
    }
        
}
}
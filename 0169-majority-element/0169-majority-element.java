class Solution {
    public int majorityElement(int[] nums) {
      int vote=1;
      int majority = nums[0];
      for(int i=1;i<nums.length;i++){
        if(vote==0){
            vote++;
            majority=nums[i];
        }else if(majority==nums[i]){
            vote++;

        }else{
            vote--;
        }
      }
        return majority;
    }
  
}
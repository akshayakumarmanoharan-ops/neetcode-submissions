class Solution {
    public int[] twoSum(int[] nums, int target) {
        //int[] ans=new int[2];
       HashMap<Integer,Integer> value = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           int  ans = target - nums[i];
           if (value.containsKey(ans)){
            return new int[]{value.get(ans),i};
           }
           value.put(nums[i],i);
        }
        return new int[]{};
        }
   
        
    }


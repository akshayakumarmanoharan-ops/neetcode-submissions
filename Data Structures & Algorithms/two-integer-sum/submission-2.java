class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*#optimal solution
       HashMap<Integer,Integer> value = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           int  ans = target - nums[i];
           if (value.containsKey(ans)){
            return new int[]{value.get(ans),i};
           }
           value.put(nums[i],i);
        }
        return new int[]{};
        */
        // brute force
        for(int i = 0;i<nums.length;i++){
            for (int j = i+1;j<nums.length;j++){
                if ( nums[i] + nums[j] == target){
                    return new int[]{i,j};
                }
            }
        }
    return new int[]{};   
    }       
    }


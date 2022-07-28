class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valuesAndIndexes = new HashMap<>();
        for(int insert = 0; insert < nums.length; insert++){
            valuesAndIndexes.put(nums[insert],insert);
        }
        for(int firstIndex = 0; firstIndex < nums.length; firstIndex++){
                int complement = target - nums[firstIndex];
            
                if(valuesAndIndexes.containsKey(complement) && valuesAndIndexes.get(complement) != firstIndex){
                    return new int[] {firstIndex,valuesAndIndexes.get(complement)};
                }
        }
        return null;
    }
}

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valuesAndIndexes = new HashMap<>();
        for(int firstIndex = 0; firstIndex < nums.length; firstIndex++){
                int complement = target - nums[firstIndex];
                
                if(valuesAndIndexes.containsKey(complement) && valuesAndIndexes.get(complement) != firstIndex){
                    return new int[] {firstIndex,valuesAndIndexes.get(complement)};
                }
            valuesAndIndexes.put(nums[firstIndex],firstIndex);
        }
        return null;
    }
}

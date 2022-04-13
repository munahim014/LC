class Solution {
    
    
//     public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length; i++){
//             for (int j = i+1; j < nums.length; j++){
//                 if (nums[i] == nums[j])
//                     return true;
//             } 
//         }
        
//         return false;
//     }
    //1123
//      public boolean containsDuplicate(int[] nums) {
//         Arrays.sort(nums);
//         for (int i = 0; i < nums.length-1; i++){
//             if (nums[i] == nums[i+1]) return true;
//         }
        
//         return false;
//     }
    
     public boolean containsDuplicate(int[] nums) {
        Set<Integer> number = new HashSet<Integer>();
        for (int num : nums){
            if (number.contains(num)) return true;
            number.add(num);
        }
        
        return false;
    }
}
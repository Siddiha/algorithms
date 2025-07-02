import java.util.*;
class Contains_dupli{
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int i = 0; i < nums.length; i++){
            if (seen.contains(nums[i])){
                return true;

            }

            seen.add(nums[i]);


        }

        return false;
        
        
    }
}
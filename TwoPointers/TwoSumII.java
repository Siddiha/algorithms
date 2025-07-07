
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;

        while (start < end){
            int curSum = numbers[start] + numbers[end];

            if (curSum > target){
                end--;

            }else if(curSum < target){
                start++;

            }else{
                return new int[]{//if it is exactly equal to the target
                    start + 1,end + 1};

            }

        }

            return new int[0];
    }
}

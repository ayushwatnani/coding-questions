import java.util.*;

public class TwoSum {
    static int[] twoSumFindIndex(int[] nums, int target){
        int[] result = new int[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for(int j = i + 1 ; j < nums.length; j++) {
                if(target == (nums[i] + nums[j])) {
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        }
        return result;
    }
   
    public static void main(String[] args) {
        int[] arr = {2,15,11,7};
        int[] result = twoSumFindIndex(arr,9);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);    
        }
        
    }
}

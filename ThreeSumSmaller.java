import java.util.Arrays;

/**
 * Created by wenqingcao on 10/11/17.
 */
public class ThreeSumSmaller {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int count = 0;
        for (int i =0; i < nums.length-2; i ++){
            int j = i+1;
            int k = nums.length-1;
            while(j < k) {
                if (nums[i]+ nums[j]+nums[k] < target){
                    count += k-j;
                    j++;
                }else{
                    k--;
                }
            }
        }
        return count;
    }
}

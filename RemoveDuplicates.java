/**
 * Created by wenqingcao on 10/8/17.
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        if (nums.length < 2)
            return nums.length;
        int pre = 0;
        int cur = 1;
        int count = 1;
        int total = 1;
        temp[0] = nums[0];
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[pre]){
                count++;
                if (count < 3){
                    temp[cur] = nums[i];
                    cur++;
                    total++;
                }
            }else{
                temp[cur] = nums[i];
                total++;
                cur ++;
                pre = i;
                count = 1;
            }
        }

        for (int i = 0; i < nums.length; i++){
            nums[i] = temp[i];
        }
        return total;
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenqingcao on 10/9/17.
 */
public class SubsetWithDup {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        dfs(res,temp,nums,0);
        return res;
    }
    public void dfs(List<List<Integer>> res, List<Integer> temp, int[] nums, int count) {
        if (!res.contains(new ArrayList<>(temp)))
            res.add(new ArrayList<>(temp));
        for (int i = count; i < nums.length; i++) {
            if (i > count && nums[i] == nums[i-1])
                continue;
            temp.add(nums[i]);
            dfs(res,temp,nums,++count);
            temp.remove(temp.size()-1);
        }
    }
}

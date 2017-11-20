import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by wenqingcao on 10/7/17.
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs(res,temp,n,k,1);
        return res;
    }

    public void dfs(List<List<Integer>> res, List<Integer> temp, int n, int k, int cur)
    {
        if (temp.size() == k){
            List<Integer> te = new ArrayList<>(temp);
            res.add(te);
            return;
        }else{
            for (int i=cur; i<n+1; i++){
                temp.add(i);
                dfs(res,temp,n,k,++cur);
                temp.remove(new Integer(i));
            }
        }
    }

    public void dfs1(List<List<Integer>> res, List<Integer> temp, int start, int[] nums) {
        res.add(new ArrayList<Integer>(temp));
        for (int i = start; i < nums.length; i++) {
            temp.add(nums[i]);
            dfs1(res,temp,++start,nums);
            temp.remove(temp.size()-1);
        }
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        dfs1(res,temp,0,nums);
        return res;
    }
}

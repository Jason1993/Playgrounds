import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenqingcao on 11/8/17.
 */
public class combinationSum {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        help(res,temp,k,n,0,1);
        return res;
    }

    public void help(List<List<Integer>> res, List<Integer> temp, int k, int n, int sum, int index){
        if (temp.size() == k){
            if (sum == n){
                List<Integer> newlist = new ArrayList<>(temp);
                res.add(newlist);
            }
            return;
        }else{
            for (int i = index; i < 10; i++){
                temp.add(i);
                help(res,temp,k,n,sum+i,i+1);
                temp.remove(temp.size()-1);
            }
        }
    }
}

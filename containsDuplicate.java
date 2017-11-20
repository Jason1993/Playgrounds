import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by wenqingcao on 11/10/17.
 */
public class containsDuplicate {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        Queue<Long> queue = new LinkedList<Long>();
        for (int i = 0; i < nums.length; i++){
            Iterator it =queue.iterator();
            while(it.hasNext()){
                long temp = (long)it.next();
                if (Math.abs(temp-nums[i]) <= t)
                    return true;
            }
            if (queue.size() == k){
                queue.poll();
                queue.offer((long)nums[i]);
            }else{
                queue.offer((long)nums[i]);
            }
        }
        return false;
    }
}

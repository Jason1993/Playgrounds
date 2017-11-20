import java.util.TreeSet;

/**
 * Created by wenqingcao on 10/2/17.
 */
public class KEmptySlots {
    public int kEmptySlots(int[] flowers, int k) {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        for (int i = 0; i < flowers.length; i++){
            int cur = flowers[i];
            Integer next = tree.higher(cur);
            if (next != null && next == cur + k+1)
                return i+1;
            Integer pre = tree.lower(cur);
            if (pre != null && pre == cur -k -1)
                return i+1;
            tree.add(cur);
        }
        return -1;
    }
}

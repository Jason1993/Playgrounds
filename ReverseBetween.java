import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

/**
 * Created by wenqingcao on 10/17/17.
 */
public class ReverseBetween {
    public ListNode reverseBetween(ListNode head, int m, int n) {
    if (head == null || m < 0)
        return null;
        PriorityQueue<ListNode> re = new PriorityQueue<>(
        new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return 0;
            }
        });
    Stack<ListNode> stac = new Stack<>();

    ListNode newHead = new ListNode(0);
    newHead.next = head;
    int count = 0;
    ListNode cur = newHead;
    ListNode pre = newHead;
    while(cur != null){
        if (count == m-1)
            pre = cur;
        if (m <= count && count <= n){
            stac.push(cur);
            if (count == n){
                ListNode tail = cur.next;
                while(!stac.empty()){
                    pre.next = new ListNode(stac.pop().val);
                    pre = pre.next;
                }
                pre.next = tail;
            }
        }
        count++;
        cur = cur.next;
    }

    return newHead.next;
}
}

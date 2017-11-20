import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wenqingcao on 10/6/17.
 */
public class BinaryWatch {
    public List<String> readBinaryWatch(int num) {
        ArrayList<String> res = new ArrayList<>();
        ArrayList<String> ans = new ArrayList<>();
        dfs(res,num,10-num,"");
        Iterator it = res.iterator();
        while(it.hasNext()){
            String temp = it.next().toString();
            StringBuilder sb = new StringBuilder();
            int hours = Integer.parseInt(temp.substring(0,4));
            sb.append(hours);
            sb.append(":");
            int min = Integer.parseInt(temp.substring(4,10));
            if (min < 10){
                sb.append(0);
                sb.append(min);
            }else{
                sb.append(min);
            }
            ans.add(sb.toString());
        }
        return ans;
    }

    public void dfs(ArrayList<String> res, int num1, int num0, String temp){
        if (num1 == 0 && num0 == 0){
            if (!res.contains(temp))
                res.add(temp);
        }else{
            if (num1 > 0){
                dfs(res,num1-1,num0,temp+"1");
            }
            if (num0 > 0){
                dfs(res,num1,num0-1,temp+"0");
            }
        }
    }
}

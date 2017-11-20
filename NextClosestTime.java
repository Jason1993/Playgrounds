import java.util.*;

/**
 * Created by wenqingcao on 10/2/17.
 */
public class NextClosestTime {
    public String nextClosestTime(String time){
        Set<Integer> temp = new HashSet<>();
        temp.add(Integer.parseInt(time.substring(0,1)));
        temp.add(Integer.parseInt(time.substring(1,2)));
        temp.add(Integer.parseInt(time.substring(3,4)));
        temp.add(Integer.parseInt(time.substring(4,5)));
        ArrayList<Integer> digits = new ArrayList<>(temp);
        int cur = Integer.parseInt(time.substring(0,2))*60+ Integer.parseInt(time.substring(3,5));
        Stack<String> res = new Stack<>();
        Stack<Integer> diff = new Stack<>();
        res.push(time);
        diff.push(Integer.MAX_VALUE);
        dfs(digits,"",0,cur,res,diff);
        return res.pop();
    }

    public void dfs(ArrayList<Integer> dig, String tempStr, int pos, int tar,Stack<String> res,Stack<Integer> diff){
        if (pos == 4){
            int count = Integer.parseInt(tempStr.substring(0,2))*60 + Integer.parseInt(tempStr.substring(2,4));
            int d = count - tar > 0 ? count-tar: 1440+ count- tar;
            if (d < diff.get(0)){
                diff.pop();
                diff.push(d);
                res.pop();
                res.push(tempStr.substring(0,2)+":"+tempStr.substring(2,4));
                //System.out.println(res);
            }
            return;
        }
        for (int i = 0; i < dig.size(); i++){
            if (pos == 0 && dig.get(i) > 2) continue;
            if (pos == 1 && Integer.parseInt(tempStr)*10+dig.get(i) > 23) continue;
            if (pos == 2 && dig.get(i) > 5) continue;
            if (pos == 3 && Integer.parseInt(tempStr.substring(2,3))*10+ dig.get(i) > 59) continue;
            dfs(dig,tempStr+dig.get(i),pos+1,tar,res,diff);
        }

    }
}

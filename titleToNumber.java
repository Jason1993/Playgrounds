/**
 * Created by wenqingcao on 11/5/17.
 */
public class titleToNumber {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0)
            return 0;
        int res = 0;
        int factor = 1;
        res += s.charAt(s.length()-1)-'A'+1;
        for(int i = s.length()-2; i>-1; i--){
            int temp = s.charAt(i)-'A'+1;
            factor*=26;
            res += factor*temp;
        }
        return res;
    }
}

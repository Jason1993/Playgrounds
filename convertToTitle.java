import java.util.HashSet;

/**
 * Created by wenqingcao on 11/5/17.
 */
public class convertToTitle {
    public String convertToTitle(int n) {
        int temp = n/26;
        int remain = n%26;
        StringBuilder sb = new StringBuilder();
        if (remain != 0) {
            sb.append(String.valueOf((char) (remain + 'A' - 1)));
        }
        else {
            sb.append('Z');
            temp -= 1;
        }
        while(temp > 0){
            remain = temp%26;
            temp = temp/26;
            if (remain != 0)
                sb.append(String.valueOf((char)(remain + 'A'- 1)));
            else {
                sb.append('Z');
                temp -= 1;
            }
        }
        return sb.reverse().toString();
    }
}

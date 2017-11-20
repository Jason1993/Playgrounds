import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by wenqingcao on 11/4/17.
 */
public class longestWord {
    public String longestWord(String[] words) {
        HashSet<String> ws = new HashSet<>(Arrays.asList(words));
        int len = 0;
        String res = "";
        for (String cur : words){
            if (help(ws,cur)){
                if (cur.length()>len){
                    len = cur.length();
                    res = cur;
                }else if (cur.length() == len){
                    if (cur.compareTo(res)<0)
                        res = cur;
                }
            }
        }
        return res;
    }
    public boolean help(HashSet<String> words, String cur){
        if (cur.length() == 1)
            return true;
        else{
            if (words.contains(cur.substring(0,cur.length()-1)))
                return help(words,cur.substring(0,cur.length()-1));
            else
                return false;
        }
    }
}

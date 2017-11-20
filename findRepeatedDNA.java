import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by wenqingcao on 11/6/17.
 */
public class findRepeatedDNA {
    public List<String> findRepeatedDnaSequences(String s) {
        Hashtable<Character,Integer> test = new Hashtable<>();
        HashSet<String> temp = new HashSet<>();
        List<String> res = new ArrayList<>();
        if (s.length()<10)
            return res;
        for (int i = 0; i <= s.length()-10; i++){
            String sub = s.substring(i,i+10);
            if (!temp.contains(sub)){
                temp.add(sub);
            }else{
                if (!res.contains(sub))
                    res.add(sub);
            }
        }
        return res;
    }
}

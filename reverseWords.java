/**
 * Created by wenqingcao on 11/3/17.
 */
public class reverseWords {
    public String reverseWords(String s) {
        String[] temp = s.split(" ");
        StringBuilder sb = new StringBuilder();
        if (temp.length == 0)
            return sb.toString();
        for (int i = temp.length-1; i >-1; i--){
            if (!temp[i].equals(" ") && !temp[i].equals(""))
                sb.append(temp[i].trim()+" ");
        }
        String res = sb.toString();
        //System.out.println(res.length());
        return res.substring(0,res.length()-1);
    }
}

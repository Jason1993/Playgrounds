import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * Created by wenqingcao on 10/3/17.
 */
public class EvaluateDivision {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        String[][] equaD = new String[equations.length*2][2];
        double[] valD = new double[equations.length*2];
        for (int i =0;i < equations.length; i++)
        {
            equaD[2*i] = equations[i].clone();
            equaD[2*i+1][0] = equations[i][1];
            equaD[2*i+1][1] = equations[i][0];
            valD[2*i] = values[i];
            valD[2*i+1] = 1/values[i];
        }
        double[] ans = new double[queries.length];
        for (int i = 0; i < queries.length; i++){
            Stack<Double> res = new Stack<>();
            HashSet<Integer> used = new HashSet<>();
            dfs(equaD,valD,queries[i][0],queries[i][1],0,equations.length,res,1.0,used);
            if (res.size() == 0)
                ans[i] = -1.0;
            else
                ans[i] = res.pop();
        }
        return ans;
    }

    public void dfs(String[][] equas, double[] vals, String cur, String tar, int dep, int depL, Stack<Double> res,double temp, HashSet<Integer> used){
        if (dep == depL){
            return;
        }
        for (int i = 0; i<equas.length;i++){
            if (equas[i][0].equals(cur)){
                if (equas[i][1].equals(tar)){
                    res.push(temp);
                    return;
                }
                if (!used.contains(i)){
                    used.add(i);
                    dfs(equas,vals,equas[i][1],tar,dep+1,depL,res,temp*vals[i],used);
                    used.remove(i);
                }
            }
        }
    }
}

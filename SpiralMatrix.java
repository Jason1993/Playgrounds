import java.util.ArrayList;
import java.util.List;

/**
 * Created by wenqingcao on 10/19/17.
 */
public class SpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<> ();
        int startX = 0, endX = matrix.length,startY = 0,endY;
        if (endX > 0 )
            endY = matrix[0].length;
        else
            endY = 0;
        while(startX < endX && startY < endY) {
            for (int i = startY; i < endY; i++) {
                res.add(matrix[startX][i]);
            }
            startX++;
            for (int i = startX; i < endX; i++) {
                res.add(matrix[i][endY-1]);
            }
            endY--;
            if (startX < endX){
                for (int i = endY-1; i > startY-1; i--) {
                    res.add(matrix[endX-1][i]);
                }}
            endX--;
            if (startY < endY){
                for (int i =endX-1; i > startX-1; i--) {
                    res.add(matrix[i][startY]);
                }}
            startY++;
        }
        String rww= "23123";
        return res;
    }
}

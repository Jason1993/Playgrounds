/**
 * Created by wenqingcao on 10/3/17.
 */
public class BoomEnemy {
    public int maxKilledEnemies(char[][] grid) {
        int max = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if (grid[i][j] == '0'){
                    int temp = getNumber(grid,i,j);
                    max = (temp > max) ? temp:max;
                }

            }
        }
        return max;
    }
    public int getNumber(char[][]grid, int i, int j){
        int count = 0;
        int index = i-1;
        while(index > -1){
            if (grid[index][j] == 'W')
                break;
            if (grid[index][j] == 'E')
                count++;
            index--;
        }
        index = i+1;
        while(index < grid.length){
            if (grid[index][j] == 'W')
                break;
            if (grid[index][j] == 'E')
                count++;
            index++;
        }
        index = j-1;
        while(index > -1){
            if (grid[i][index] == 'W')
                break;
            if (grid[i][index] == 'E')
                count++;
            index--;
        }
        index = j+1;
        while(index < grid[0].length){
            if (grid[i][index] == 'W')
                break;
            if (grid[i][index] == 'E')
                count++;
            index++;
        }
        return count;
    }
}

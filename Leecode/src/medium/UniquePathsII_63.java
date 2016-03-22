package medium;

public class UniquePathsII_63 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        if(obstacleGrid[0][0]==1||obstacleGrid[m-1][n-1]==1)
        	return 0;
        Integer[][] map = new Integer[m][n];
        map[0][0]=1;
        for(int i = 1; i<m;i++){
        	if(obstacleGrid[i][0]==1)
        		map[i][0] = 0;
        	else
        		map[i][0] = map[i-1][0];
        }
        for(int j= 1;j<n;j++){
        	if(obstacleGrid[0][j]==1)
        		map[0][j] = 0;
        	else
        		map[0][j] = map[0][j-1];
        }
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n;j++){
            	if(obstacleGrid[i][j]==1)
            		map[i][j]=0;
            	else
            		map[i][j] = map[i-1][j]+map[i][j-1];
            }
        }
        return map[m-1][n-1];
    }
}

package medium;

public class Searcha2DMatrix_74 {
	public static boolean searchMatrix(int[][] matrix, int target) {
		int len=matrix[0].length;
		int row=matrix.length;
        int j=0;
        int i=len-1;
        for(;i>=0&&j<row;){
        	if(matrix[j][i]>target){
        		i--;
        	}
        	else if(matrix[j][i]==target){
        		return true;
        	}
        	else{
        		j++;
        	}
        }
        return false;
    }
	public static void main(String argv[]){
		int [][] matrix=new int[1][2];
		matrix[0]=new int[]{1,3};
		System.out.println(searchMatrix(matrix, 1));
	}
}

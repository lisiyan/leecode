package medium;

import easy.TreeNode;

public class HouseRobberIII_337 {
	public int rob(TreeNode root) {
        int[] num = dfs(root);
        return Math.max(num[0], num[1]);
    }
    private int[] dfs(TreeNode x) {
        if (x == null) return new int[2];
        int[] left = dfs(x.left);
        int[] right = dfs(x.right);
        int[] res = new int[2];
        res[0] = left[1] + right[1] + x.val;
        res[1] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        return res;
    }
	/*public int rob(TreeNode root) {
		if(root==null)
            return 0;
        int val1=root.val;
        int val2=0;
        if(root.left!=null){
        	val2+=rob(root.left);
        	if(root.left.left!=null)
        		val1+=rob(root.left.left);
        	if(root.left.right!=null)
        		val1+=rob(root.left.right);
        }
        if(root.right!=null){
        	val2+=rob(root.right);
        	if(root.right.left!=null)
        		val1+=rob(root.right.left);
        	if(root.right.right!=null)
        		val1+=rob(root.right.right);
        }
        return Math.max(val1, val2);
    }*/
}

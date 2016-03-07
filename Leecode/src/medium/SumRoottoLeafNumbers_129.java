package medium;


import easy.TreeNode;

public class SumRoottoLeafNumbers_129 {
	public int sumNumbers(TreeNode root) {
		if(root==null)
			return 0;
        Integer sum=addValue(root,0);
        return sum;
    }
	public int addValue(TreeNode root, int value){
		if (root.left == null && root.right == null) 
	    	return value*10+root.val;
		int val=0;
	    if (root.left != null) 
	    	val+=addValue(root.left, root.val+value*10);
	    if (root.right != null) 
	    	val+=addValue(root.right, root.val+value*10);
	    return val;
	}
}

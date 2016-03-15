package easy;

public class BalancedBinaryTree_110 {
	public boolean isBalanced(TreeNode root) {
        if(root==null)
        	return true;
        int l=depth(root.left);
        int r=depth(root.right);
        int sub=Math.abs(l-r);
        return sub<=1&&isBalanced(root.left)&&isBalanced(root.right);
    }
	public int depth (TreeNode root) {
        if (root == null)
        	return 0;
        int l=depth(root.left);
        int r=depth (root.right);
        return l>r?l+1:r+1;
    }
}

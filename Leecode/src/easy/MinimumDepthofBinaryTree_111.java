package easy;

public class MinimumDepthofBinaryTree_111 {
	public int minDepth(TreeNode root) {
        if(root==null)
        	return 0;
        if(root.left==null&&root.right==null)
        	return 1;
        int right=Integer.MAX_VALUE;
        int left=Integer.MAX_VALUE;
        if(root.right!=null)
        	right=minDepth(root.right)+1;
        if(root.left!=null)
        	left=minDepth(root.left)+1;
        if(right>left)
        	return left;
        else {
			return right;
		}
    }
}

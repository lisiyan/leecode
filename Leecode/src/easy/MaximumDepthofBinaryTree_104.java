package easy;

public class MaximumDepthofBinaryTree_104 {
	public int maxDepth(TreeNode root) {
		if(root==null){
			return 0;
		}
        TreeNode leftNode=root.left;
        int left=maxDepth(leftNode);
        TreeNode rightNode=root.right;
        int right=maxDepth(rightNode);
        if(left>right){
        	return left+1; 
        }
        else{
        	return right+1;
        }
    }
}

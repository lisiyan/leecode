package easy;

public class PathSum_112 {
	public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null)
        	return false;
        int val=root.val;
        if(root.left==null&&root.right==null){
        	if(val==sum)
        		return true;
        	else
				return false;
        }
        return hasPathSum(root.left, sum-val)||hasPathSum(root.right, sum-val);
    }
}

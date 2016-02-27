package easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths_257 {
	public List<String> binaryTreePaths(TreeNode root) {
		List<String> list=new ArrayList<String>();
		if (root != null) 
			addPath(root, "", list);
		return list;
    }
	private void addPath(TreeNode root, String path, List<String> answer) {
	    if (root.left == null && root.right == null) 
	    	answer.add(path + root.val);
	    if (root.left != null) 
	    	addPath(root.left, path + root.val + "->", answer);
	    if (root.right != null) 
	    	addPath(root.right, path + root.val + "->", answer);
	}
}

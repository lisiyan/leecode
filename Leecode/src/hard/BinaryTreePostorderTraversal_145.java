package hard;

//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

import easy.TreeNode;

public class BinaryTreePostorderTraversal_145 {
	public List<Integer> postorderTraversal(TreeNode root) {
		LinkedList<Integer> ans = new LinkedList<>();
	    Stack<TreeNode> stack = new Stack<>();
	    if (root == null) return ans;

	    stack.push(root);
	    while (!stack.isEmpty()) {
	        TreeNode cur = stack.pop();
	        ans.addFirst(cur.val);
	        if (cur.left != null) {
	            stack.push(cur.left);
	        }
	        if (cur.right != null) {
	            stack.push(cur.right);
	        } 
	    }
	    return ans;
		/*ArrayList<Integer> treeValue=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        if(root!=null){
        	while(!stack.empty()){
        		TreeNode node=stack.pop();
        		if(node.left!=null||node.right!=null){
        			stack.push(node);
        		}
        		else if(node.left==null||node.right==null){
        			treeValue.add(node.val);
        		}
        		if(node.right!=null){
        			stack.push(node.right);
        			node.right=null;
        		}
        		if(node.left!=null){
        			stack.push(node.left);
        			node.left=null;
        		}
        	}
        }
        return treeValue;*/
    }
}

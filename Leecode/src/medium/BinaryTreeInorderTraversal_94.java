package medium;


import easy.TreeNode;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal_94 {
	public List<Integer> inorderTraversal(TreeNode root) {
		LinkedList<Integer> treeValue=new LinkedList<Integer>();
		Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        if(root!=null){
        	while(!stack.empty()){
        		TreeNode node=stack.pop();
        		if(node.right!=null){
        			stack.push(node.right);
        			node.right=null;
        		}     		
        		if(node.left!=null){
        			stack.push(node);
        			stack.push(node.left);
        			node.left=null;
        		}
        		else{
        			treeValue.add(node.val);
        		}
        	}
        }
        return treeValue;
    }
}

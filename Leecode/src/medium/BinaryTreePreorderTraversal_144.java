package medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import easy.TreeNode;

public class BinaryTreePreorderTraversal_144 {
	public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> treeValue=new ArrayList<Integer>();
        Stack<TreeNode> stack=new Stack<TreeNode>();
        stack.push(root);
        if(root!=null){
        	while(!stack.empty()){
        		TreeNode node=stack.pop();
        		treeValue.add(node.val);
        		if(node.right!=null)
        			stack.push(node.right);
        		if(node.left!=null)
        			stack.push(node.left);
        	}
        }
        return treeValue;
    }
	/*
	List<Integer> list = new LinkedList<Integer>();
    Stack<TreeNode> rights = new Stack<TreeNode>();
    while(node != null) {
        list.add(node.val);
        if (node.right != null) {
            rights.push(node.right);
        }
        node = node.left;
        if (node == null && !rights.isEmpty()) {
            node = rights.pop();
        }
    }
    return list;
    */
}

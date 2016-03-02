package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import easy.TreeNode;

public class BinaryTreeZigzagLevelOrderTraversal_103 {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		if(root==null)
			return new ArrayList<List<Integer>>();
		List<List<Integer>> result=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<Integer>();

        Stack<TreeNode> nodes1=new Stack<TreeNode>();
        nodes1.add(root);
        Stack<TreeNode> nodes2=new Stack<TreeNode>();
        while(!nodes1.isEmpty()||!nodes2.isEmpty()){
            list=new ArrayList<Integer>();
        	while(!nodes1.isEmpty()){
        		TreeNode temp=nodes1.pop();
        		list.add(temp.val);
        		if(temp.left!=null){
        			nodes2.push(temp.left);
        		}
        		if(temp.right!=null){
        			nodes2.push(temp.right);
        		}
        	}
        	if(list.size()!=0){
        		result.add(list);
        	}
        	
        	list=new ArrayList<Integer>();
        	while(!nodes2.isEmpty()){
        		TreeNode temp=nodes2.pop();
        		list.add(temp.val);
        		if(temp.right!=null){
        			nodes1.push(temp.right);
        		}
        		if(temp.left!=null){
        			nodes1.push(temp.left);
        		}
        	}
        	if(list.size()!=0){
        		result.add(list);
        	}
        }
        
        return result;
    }
}

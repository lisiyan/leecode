package easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversalII_107 {
	 public List<List<Integer>> levelOrderBottom(TreeNode root) {
		 if(root==null)
				return new ArrayList<List<Integer>>();
		 	LinkedList<List<Integer>> result=new LinkedList<List<Integer>>();
	        List<Integer> list=new ArrayList<Integer>();
	        list.add(root.val);
	        result.addFirst(list);
	        
	        Queue<TreeNode> nodes1=new LinkedList<TreeNode>();
	        nodes1.add(root);
	        Queue<TreeNode> nodes2=new LinkedList<TreeNode>();
	        while(!nodes1.isEmpty()||!nodes2.isEmpty()){
	            list=new ArrayList<Integer>();
	        	while(!nodes1.isEmpty()){
	        		TreeNode temp=nodes1.poll();
	        		if(temp.left!=null){
	        			list.add(temp.left.val);
	        			nodes2.offer(temp.left);
	        		}
	        		if(temp.right!=null){
	        			list.add(temp.right.val);
	        			nodes2.offer(temp.right);
	        		}
	        	}
	        	if(list.size()!=0){
	        		result.addFirst(list);
	        	}
	        	list=new ArrayList<Integer>();
	        	while(!nodes2.isEmpty()){
	        		TreeNode temp=nodes2.poll();
	        		if(temp.left!=null){
	        			list.add(temp.left.val);
	        			nodes1.offer(temp.left);
	        		}
	        		if(temp.right!=null){
	        			list.add(temp.right.val);
	        			nodes1.offer(temp.right);
	        		}
	        	}
	        	if(list.size()!=0){
	        		result.addFirst(list);
	        	}
	        }
	        
	        return result;
	 }
}

package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import easy.TreeNode;

public class PathSumII_113 {
	public List<List<Integer>> pathSum(TreeNode root, int sum){
	    List<List<Integer>> result  = new LinkedList<List<Integer>>();
	    List<Integer> currentResult  = new LinkedList<Integer>();
	    pathSum(root,sum,currentResult,result);
	    return result;
	}

	public void pathSum(TreeNode root, int sum, List<Integer> currentResult,
	        List<List<Integer>> result) {

	    if (root == null)
	        return;
	    currentResult.add(new Integer(root.val));
	    if (root.left == null && root.right == null && sum == root.val) {
	        result.add(new LinkedList(currentResult));
	        currentResult.remove(currentResult.size() - 1);//don't forget to remove the last integer
	        return;
	    } else {
	        pathSum(root.left, sum - root.val, currentResult, result);
	        pathSum(root.right, sum - root.val, currentResult, result);
	    }
	    currentResult.remove(currentResult.size() - 1);
	}
	/*public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> lists=new ArrayList<List<Integer>>();
		addToList(root,sum,new ArrayList<Integer>(),lists);
		return lists;
    }
	public void addToList(TreeNode root, int sum,List<Integer> list
			,List<List<Integer>> all){
		if(root==null)
        	return;
        int val=root.val;
        list.add(val);
        if(root.left==null&&root.right==null){
        	if(val==sum)
        		all.add(list);
        	else
				return;
        }
        List<Integer> list1=new ArrayList<Integer>(list);
        List<Integer> list2=new ArrayList<Integer>(list);
        addToList(root.left, sum-val,list1,all);
        addToList(root.right, sum-val,list2,all);
	}*/
}

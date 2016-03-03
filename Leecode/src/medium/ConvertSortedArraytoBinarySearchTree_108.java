package medium;

import easy.TreeNode;

public class ConvertSortedArraytoBinarySearchTree_108 {
	public TreeNode sortedArrayToBST(int[] nums) {
		int len=nums.length;
		if(len==0)
		    return null;
        return tree(nums,0,len-1);
    }
	private TreeNode tree(int[] nums,int begin,int end){
	    //System.out.println("begin:"+begin+" end:"+end);
		if(begin>end)
			return null;
		int middle=(begin+end)/2;
		TreeNode root=new TreeNode(nums[middle]);
		root.left=tree(nums, begin, middle-1);
        root.right=tree(nums, middle+1,end);
        return root;
	}
}

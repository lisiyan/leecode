package easy;

public class SameTree_100 {
	public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null&&q==null){
        	return true;
        }
        else if(p==null||q==null){
        	return false;
        }
        else if(p.val!=q.val){
        	return false;
        }
        else if(isSameTree(p.left, q.left)&&isSameTree(p.right, q.right)){
        	return true;
        }
        else{
        	return false;
        }
    }
}

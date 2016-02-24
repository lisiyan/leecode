package easy;


public class LowestCommonAncestorofaBinarySearchTree_235 {
	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		/*HashSet<TreeNode> nodeSet=new HashSet<TreeNode>();
		TreeNode currentNode=root;
		int currentVal=currentNode.val;
		nodeSet.add(root);
		int pVal=p.val;
		int qVal=q.val;
		while(pVal!=currentVal){
			if(pVal<currentVal){
				currentNode=currentNode.left;
			}
			else{
				currentNode=currentNode.right;
			}
			currentVal=currentNode.val;
			nodeSet.add(currentNode);
		}
		TreeNode commonAncestor=root;
		currentNode=root;
		currentVal=currentNode.val;
		while(qVal!=currentVal){
			if(qVal<currentVal){
				currentNode=currentNode.left;
			}
			else{
				currentNode=currentNode.right;
			}
			currentVal=currentNode.val;
			if(!nodeSet.add(currentNode)){
				commonAncestor=currentNode;
			}
			
		}
		return commonAncestor;*/
		while ((root.val - p.val) * (root.val - q.val) > 0)
	        root = p.val < root.val ? root.left : root.right;
	    return root;
    }
	public static void main(String argv[]){
		TreeNode root=new TreeNode(2);
		TreeNode left=new TreeNode(1);
		root.left=left;
		System.out.println(lowestCommonAncestor(root, root, left));
	}
}

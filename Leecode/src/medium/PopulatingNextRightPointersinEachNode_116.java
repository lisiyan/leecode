package medium;
class TreeLinkNode {
	int val;
	TreeLinkNode left, right, next;
	TreeLinkNode(int x) { val = x; }
}
public class PopulatingNextRightPointersinEachNode_116 {
	public void connect(TreeLinkNode root) {
		TreeLinkNode current=root;
        while(current!=null){
        	TreeLinkNode temp=current;
        	while(temp!=null){
        		if(temp.left!=null){
        			temp.left.next=temp.right;
        		}
        		if(temp.next!=null){
        			temp.right.next=temp.next.left;
        		}
        		temp=temp.next;
        	}
        	current=current.left;
        }
    }
}

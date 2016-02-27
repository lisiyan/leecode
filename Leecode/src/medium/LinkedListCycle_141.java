package medium;
class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
		next = null;
	}
}
public class LinkedListCycle_141 {
	public boolean hasCycle(ListNode head) {
		if(head==null)
			return false;
        ListNode current=head.next;
        ListNode last=head;
        while(current!=null){
        	ListNode temp=current;
        	current=current.next;
        	temp.next=last;
        	if(current==head){
        		return true;
        	}
        }
        return false;
    }
}

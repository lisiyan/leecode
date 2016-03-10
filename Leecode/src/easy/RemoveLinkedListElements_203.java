package easy;

public class RemoveLinkedListElements_203 {
	public ListNode removeElements(ListNode head, int val) {
		if(head==null)
        	return null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode last=dummy;
        while(head!=null){
        	if(head.val==val){
        		last.next=head.next;
        	}
        	else{
        		last=head;
        	}
        	head=head.next;
        }
        return dummy.next;
    }
}

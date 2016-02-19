package easy;

public class RemoveDuplicatesfromSortedList_83 {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode current=head;
        while(current!=null){
        	ListNode next=current.next;
        	if(next==null)
        		break;
        	if(current.val==next.val){
        		current.next=next.next;
        		continue;
        	}
        	current=current.next;
        }
        return head;
    }
}

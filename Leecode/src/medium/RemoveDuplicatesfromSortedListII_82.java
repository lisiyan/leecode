package medium;

public class RemoveDuplicatesfromSortedListII_82 {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode dummy=new ListNode(0);
        dummy.next=head;
        if(head==null)
        	return null;
        int value=head.val;
        boolean duplicated=false;
        ListNode last=dummy;
        ListNode before=head;
        ListNode current=head.next;
        while(current!=null){
        	if(current.val==value){
        		duplicated=true;
        		current=current.next;
        	}
        	else{
        		if(!duplicated){
        			last=before;
        			before=current;
        			value=current.val;
        			current=current.next;
        		}
        		else{
        			last.next=current;
        			before=current;
        			value=current.val;
        			current=current.next;
        		}
        		duplicated=false;
        	}
        }
        if(duplicated){
            last.next=current;
        }
        return dummy.next;
    }
}

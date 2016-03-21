package medium;

public class PartitionList_86 {
	public ListNode partition(ListNode head, int x) {
		ListNode dummy=new ListNode(0);
        dummy.next=head;
        boolean findPivot=false;
        ListNode previous=dummy;
        ListNode begin=dummy;
        ListNode end=head;
        while(head!=null){
        	if(head.val>=x&&findPivot==false){
        		begin=previous;
        		end=head;
        		previous=head;
        		head=head.next;
        		findPivot=true;
        	}
        	else if(head.val>=x){
        		previous=head;
        		head=head.next;
        		continue;
        	}
        	else if(head.val<x&&findPivot==false){
        		previous=head;
        		head=head.next;
        		continue;
        	}
        	else{
        		previous.next=head.next;
        		begin.next=head;
        		begin=head;
        		head.next=end;
        		head=previous.next;
        	}
        }
        return dummy.next;
    }
}

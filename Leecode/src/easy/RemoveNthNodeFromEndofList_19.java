package easy;

//import java.util.HashMap;

public class RemoveNthNodeFromEndofList_19 {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode start = new ListNode(0);
	    ListNode slow = start, fast = start;
	    slow.next = head;

	    //Move fast in front so that the gap between slow and fast becomes n
	    for(int i=1; i<=n+1; i++)   {
	        fast = fast.next;
	    }
	    //Move fast to the end, maintaining the gap
	    while(fast != null) {
	        slow = slow.next;
	        fast = fast.next;
	    }
	    //Skip the desired node
	    slow.next = slow.next.next;
	    return start.next;
		/*ListNode dummy=new ListNode(0);
		dummy.next=head;
		HashMap<Integer, ListNode> map=new HashMap<Integer, ListNode>();
		map.put(0, dummy);
		int index=1;
		while(head!=null){
		    //System.out.println(index+" "+head.val);
			map.put(index,head);
			head=head.next;
			index++;
		}
		//System.out.println(index);
		map.get(index-n-1).next=map.get(index-n+1);
        return dummy.next;*/
    }
}

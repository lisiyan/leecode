package easy;

public class MergeTwoSortedLists_21 {
	@SuppressWarnings("null")
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head=null;
        ListNode current=null;
        while(l1!=null||l2!=null){
        	int v1=Integer.MAX_VALUE;
        	int v2=Integer.MAX_VALUE;
        	if(l1!=null){
        		v1=l1.val;
        	}
        	if(l2!=null){
        		v2=l2.val;
        	}
        	if(v1<v2){
        		if(head==null){
        			head=l1;
        			current=l1;
        		}
        		else{
        			current.next=l1;
        			current=l1;
        		}
        		l1=l1.next;
        	}
        	else{
        		if(head==null){
        			head=l2;
        			current=l2;
        		}
        		else{
        			current.next=l2;
        			current=l2;
        		}
        		l2=l2.next;
        	}
        }
        return head;
    }
}

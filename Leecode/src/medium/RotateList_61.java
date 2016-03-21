package medium;

public class RotateList_61 {
	public ListNode rotateRight(ListNode head, int k) {
        if(head==null||k==0)
            return head;
        int len=0;
        ListNode current=head;
        while(current!=null){
            len++;
            current=current.next;
        }
        k=k%len;
        if(k==0)
            return head;
        current=head;
        for(int i=0;i<len-k-1;i++){
            current=current.next;
        }
        ListNode newHead=current.next;
        current.next=null;
        current=newHead;
        while(current.next!=null)
            current=current.next;
        current.next=head;
        return newHead;
    }
}

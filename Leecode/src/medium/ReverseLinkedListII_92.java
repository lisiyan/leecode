package medium;

public class ReverseLinkedListII_92 {
	public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        if(head.next==null||m==n)
            return dummy.next;
        ListNode beginNode=dummy;
        ListNode endNode=null;
        ListNode reverse1=null;
        ListNode reverse2=null;
        ListNode lastNode=dummy;
        ListNode curNode=head;
        for(int i=0;i<n+1;i++){
        	if(i==m-1){
        		beginNode=lastNode;
        		reverse1=curNode;
        		lastNode=curNode;
        		curNode=curNode.next;
        	}
        	else if(i>m-1&&i<n){
        		ListNode temp=curNode.next;
        		curNode.next=lastNode;
        		lastNode=curNode;
        		curNode=temp;
        	}
        	else if(i==n){
        		endNode=curNode;
        		reverse2=lastNode;
        		break;
        	}
        	else{
        	    lastNode=curNode;
        		curNode=curNode.next;
        	}
        
        }
        if(reverse1!=null)
            reverse1.next=endNode;
        if(beginNode!=null)
            beginNode.next=reverse2;
        
        return dummy.next;
    }
}

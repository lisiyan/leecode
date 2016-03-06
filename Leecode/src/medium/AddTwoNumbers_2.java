package medium;

public class AddTwoNumbers_2 {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root=null;
        ListNode currentListNode=null;
        int add=0;
        while(l1!=null&&l2!=null){
        	int v1=l1.val;
        	int v2=l2.val;
        	int result=v1+v2+add;
        	if(result>=10){
        		result=result-10;
        		add=1;
        	}
        	else{
        		add=0;
        	}
        	if(root==null){
        		root=new ListNode(result);
        		currentListNode=root;
        	}
        	else{
        		currentListNode.next=new ListNode(result);
        		currentListNode=currentListNode.next;
        	}
        	l1=l1.next;
        	l2=l2.next;
        }
        while(l1!=null){
        	int v1=l1.val;
        	int result=v1+add;
        	if(result>=10){
        		result=result-10;
        		add=1;
        	}
        	else{
        		add=0;
        	}
        	if(root==null){
        		root=new ListNode(result);
        		currentListNode=root;
        	}
        	else{
        		currentListNode.next=new ListNode(result);
        		currentListNode=currentListNode.next;
        	}
        	l1=l1.next;
        }
        while(l2!=null){
        	int v2=l2.val;
        	int result=v2+add;
        	if(result>=10){
        		result=result-10;
        		add=1;
        	}
        	else{
        		add=0;
        	}
        	if(root==null){
        		root=new ListNode(result);
        		currentListNode=root;
        	}
        	else{
        		currentListNode.next=new ListNode(result);
        		currentListNode=currentListNode.next;
        	}
        	l2=l2.next;
        }
        if(add!=0){
        	currentListNode.next=new ListNode(1);
        }
        return root;
    /*
	ListNode c1 = l1;
    ListNode c2 = l2;
    ListNode sentinel = new ListNode(0);
    ListNode d = sentinel;
    int sum = 0;
    while (c1 != null || c2 != null) {
        sum /= 10;
        if (c1 != null) {
            sum += c1.val;
            c1 = c1.next;
        }
        if (c2 != null) {
            sum += c2.val;
            c2 = c2.next;
        }
        d.next = new ListNode(sum % 10);
        d = d.next;
    }
    if (sum / 10 == 1)
        d.next = new ListNode(1);
    return sentinel.next;
    */
    }

}

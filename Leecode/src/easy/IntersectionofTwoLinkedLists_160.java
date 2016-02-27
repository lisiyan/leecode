package easy;

public class IntersectionofTwoLinkedLists_160 {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int len1=length(headA);
        int len2=length(headB);
        while (len1 > len2) {
            headA = headA.next;
            len1--;
        }
        while (len1 < len2) {
            headB = headB.next;
            len2--;
        }
        
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
	private int length(ListNode head){
		ListNode current=head;
		int length=0;
		while(current!=null){
			length++;
			current=current.next;
		}
		return length;
	}
}

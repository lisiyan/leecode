package hard;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class MergekSortedLists_23 {
	public ListNode mergeKLists(ListNode[] lists) {
		Queue<ListNode> heap = new PriorityQueue<ListNode>(0, new Comparator<ListNode>(){
            @Override 
            public int compare(ListNode l1, ListNode l2) { 
                return l1.val - l2.val; 
            }
        });
        ListNode head = new ListNode(0), tail = head;
        for (ListNode node : lists) 
        	if (node != null) 
        		heap.offer(node);
        while (!heap.isEmpty()) {
            tail.next = heap.poll();
            tail = tail.next;
            if (tail.next != null) 
            	heap.offer(tail.next);
        }
        return head.next;
    }
}

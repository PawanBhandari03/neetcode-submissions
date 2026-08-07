class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode>pq = new PriorityQueue<>((a,b) -> a.val - b.val);
    
            for(ListNode node : lists){
                if(node != null){
                    pq.offer(node);
                }
            }

            ListNode dummy = new ListNode(-1);
            ListNode curr = dummy;
            while(!pq.isEmpty()){
                ListNode Smallest = pq.poll();
                curr.next = Smallest;
                curr = curr.next;

                if(Smallest.next != null){
                    pq.offer(Smallest.next);
                }
            }
        return dummy.next;
    }
}

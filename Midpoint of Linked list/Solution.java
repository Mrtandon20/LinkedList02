public class Solution {
    
    public static LinkedListNode<Integer> midPoint(LinkedListNode<Integer> head) {
        //Your code goes here
        if(head == null || head.next == null){
            return head;
        }
        LinkedListNode<Integer> fast = head.next;
        LinkedListNode<Integer> slow = head;

        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

}

/*

    Following is the Node class already written for the Linked List

    class LinkedListNode<T> {
        T data;
        LinkedListNode<T> next;
    
        public LinkedListNode(T data) {
            this.data = data;
        }
    }

*/


public class Solution {

	public static LinkedListNode<Integer> evenAfterOdd(LinkedListNode<Integer> head) {
		//Your code goes here
        if(head == null || head.next == null){
            return head;
        }

        LinkedListNode<Integer> oddhead = null;
        LinkedListNode<Integer> oddtail = null;
        LinkedListNode<Integer> evenhead = null;
        LinkedListNode<Integer> eventail = null;
        LinkedListNode<Integer> temp = head;

        while(temp!= null){
            if(temp.data%2==0){
                if(evenhead == null){
                    evenhead = temp;
                    eventail = temp;
                    temp = temp.next;
                }else{
                    eventail.next = temp;
                    eventail = temp;
                    temp = temp.next;
                }

            }else{
                    if(oddhead == null){
                        oddhead = temp;
                        oddtail = temp;
                        temp = temp.next;
                    }else{
                        oddtail.next = temp;
                        oddtail = temp;
                        temp = temp.next;
                    }
            }
        }

        if(oddhead == null){
            eventail.next = null;
            return evenhead;
        }

        if(evenhead == null){
            oddtail.next = null;
            return oddhead;
        }

        oddtail.next = evenhead;
        eventail.next= null;
        return oddhead;

	}

}

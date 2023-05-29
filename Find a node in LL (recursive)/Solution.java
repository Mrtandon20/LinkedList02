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


	public static int findNodeRec(LinkedListNode<Integer> head, int n) {
    	//Your code goes here
        if(head == null){
            return -1;
        }
        if(head.data == n){
            return 0;
        }

        int count =  findNodeRec(head.next, n);
        if(count == -1)
        return -1;
        return count+1;
	}

}

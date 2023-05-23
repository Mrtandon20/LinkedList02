public class LinkedListUse {
    
    public static Node<Integer> takeInput(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node<Integer> head = null;
        Node<Integer> tail = null;
        
        while(data!=-1){
            Node<Integer> newNode  = new Node<Integer>(data);
            if(head == null){
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
            data = sc.nextInt();
        }
        return head;
    }
    
    public static void printRec(Node<Integer> head){
        if(head == null){
            return;
        }
        System.out.println(head.data);
        printRec(head.next);
        
    }

    
    public static void main(String [] args){
//        Node<Integer> node1 = new Node<Integer>(10);
//        Node<Integer> node2 = new Node<Integer>(20);
//        Node<Integer> node3 = new Node<Integer>(30);
//        Node<Integer> node4 = new Node<Integer>(40);
//        
//        node1.next = node2;
//        node2.next = node3;
//        node3.next = node4;
//        node4.next = null;
        
        Node<Integer> head = null;
        
        head = takeInput();
        
        printRec(head);
        
    }
    
}

package ss10_DanhSach.ThucHanh.Linkedlist_Don_Gian;

public class MyLinkedList {
    private  Node head;
    private  int numNodes;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Node(Object data, Node node){
            this.data = data;
            next = node;
        }

        public Object getData() {
            return this.data;
        }
    }
    public void add(int index, Object data) {
        Node temp = head;
//        Node holder;

        for(int i=0; i < index && temp.next != null; i++) {
            temp = temp.next;
        }
//        holder = temp.next;

        Node n = new Node(data, temp.next);

        temp.next = n;
//        temp.next.next = holder;
        numNodes++;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0; i<index; i++) {
            temp = temp.next;
        }
        return temp;
    }
    public void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}


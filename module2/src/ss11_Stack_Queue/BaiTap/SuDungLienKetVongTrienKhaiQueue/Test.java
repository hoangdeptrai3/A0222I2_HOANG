package ss11_Stack_Queue.BaiTap.SuDungLienKetVongTrienKhaiQueue;

public class Test {
    public static void main(String[] args) {
        CircularQueueByLinkedList<Integer> circularQueueByLinkedList= new CircularQueueByLinkedList<>();
        circularQueueByLinkedList.enQueue(1);
        circularQueueByLinkedList.enQueue(3);
        circularQueueByLinkedList.enQueue(5);
        circularQueueByLinkedList.enQueue(8);
        circularQueueByLinkedList.enQueue(15);

        System.out.println("contain is: "+  circularQueueByLinkedList.contains(3));
        circularQueueByLinkedList.deQueue();
        circularQueueByLinkedList.display();
    }
}
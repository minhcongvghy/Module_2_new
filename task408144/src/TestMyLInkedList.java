public class TestMyLInkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(20);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(4, 9);
        ll.add(5, 30);
        ll.printList();
    }
}

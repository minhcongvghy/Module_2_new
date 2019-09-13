public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.add(1, 2);
        list.add(2, "CONG");
        list.add(3, 4);
        list.add(4, 5);
        list.addFirst(0);
        list.addLast("Last");
        list.contains(2);
//        list.get(5);
        list.indexOf(5);
//        list.clear();
//        System.out.println(list.indexOf("HDD"));
//        list.size();
        list.printList();
        MyLinkedList listB = new MyLinkedList(null);
        try {
            listB = (MyLinkedList) list.clone();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println();
        listB.printList();
    }
}

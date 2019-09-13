public class MyLinkedList implements Cloneable {
    private Node head;
    private int numNodes;
    private boolean flag;

    public MyLinkedList(Object data) {
        head = new Node(data);
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }

    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public void addLast(Object data) {
        if (head == null) {
            addFirst(data);
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new Node(data);
        }
    }

    public Object remove(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp.next = temp.next.next;
        }
        numNodes--;
        return head;
    }

    public boolean remove(Object e) {
        return true;
    }

    public void size() {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            temp = temp.next;
            i++;
        }
        System.out.println(i);
    }

    public boolean contains(Object data) {
        Node temp = head;
        for (int i = 0; i <= numNodes; i++) {
            if ((temp.data).equals(data)) {
                flag = true;
                break;
            } else {
                flag = false;
                temp = temp.next;
            }
        }
        return flag;
    }

    public int indexOf(Object data) {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            if ((temp.data).equals(data)) {
                return i;
            } else {
                temp = temp.next;
            }
        }
        return -1;
    }

    public void get(int index) {
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public Object getFirst() {
        return null;
    }

    public Object getLast() {
        return null;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public void clear() {
        Node temp = head;
        for (int i = 0; i < numNodes; i++) {
            temp.next = null;
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

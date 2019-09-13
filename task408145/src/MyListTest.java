public class MyListTest {
    public static void main(String[] args) {
        try {
            MyList<Integer> myList = new MyList<>();
            myList.add(0, 33);
            myList.add(1, 82);
            myList.add(2, 72);
            myList.add(3, 62);
            myList.add(4, 52);
            myList.add(5, 12);
            myList.add(6, 42);
            myList.add(7, 32);
            myList.add(8, 22);
            myList.add(9, 2);
            myList.add(10, 24);
            myList.add(8, 34);
            MyList copied = (MyList) myList.clone();

            myList.ensureCapacity(5);


            System.out.println(myList.getLength());
            System.out.println(copied.getElements());
            System.out.println(copied.getElements());
            System.out.println(myList.getElements());
            System.out.println(myList.getSize());
            System.out.println(myList.contains(52));
            System.out.println(myList.indexOf(52));
            System.out.println(myList.get(10));

            myList.clear();

        } catch (CloneNotSupportedException c){
        }
    }
}

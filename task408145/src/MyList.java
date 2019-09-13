import java.util.Arrays;

public class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E o) {
        if (index >= elements.length) {
            ensureCapa();
        }
        if (null == elements[index]) {
            elements[index] = o;
            size++;
        } else {
            for (int i = 1; i < elements.length; i++) {
                if (index >= elements.length) {
                    ensureCapa();
                }
                if (elements[elements.length - i] == elements[index]) {
                    break;
                }
                elements[elements.length - i] = elements[elements.length - (i + 1)];
            }
            elements[index] = o;
            size++;
        }
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
        }
        for (int i = index; i < elements.length; index++) {
            elements[i] = elements[i + 1];
        }
    }

    public int getSize() {
        return this.size;
    }

    public boolean contains(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (o == elements[i]) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(E o) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == o) {
                return i;
            }
        }
        return -1;
    }


    public boolean add(E o) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = o;
        if (elements[size] == o) {
            return true;
        }
        return false;
    }

    public void ensureCapacity(int minCapacity) {
        int minCapa = elements.length + minCapacity;
        if (size >= elements.length - minCapacity) {  //
            minCapa += minCapacity;
            elements = Arrays.copyOf(elements, minCapa);
        }
    }

    public E get(int i) {
        if (i >= size || i < 0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public int getLength() {
        return elements.length;
    }

    public String getElements() {
        return Arrays.toString(elements);
    }

    public MyList[] clone() {
        MyList[] clone = (MyList[]) Arrays.copyOf(elements , elements.length);
        return clone;
    }
}

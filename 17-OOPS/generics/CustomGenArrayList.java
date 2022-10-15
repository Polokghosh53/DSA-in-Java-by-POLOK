package generics;

import java.util.Arrays;
import java.util.List;

public class CustomGenArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as index value

    public CustomGenArrayList() {
        this.data = new Object[DEFAULT_SIZE];
    }

    // an example of wildcard
    public void wildCardgetList(List<? extends Number> list) {
        // do something
        // here with wildCard you can access Integer, Float other than the Number
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    public T remove() {
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index) {
        return (T)(data[index]);
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    @Override  
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list = new ArrayList();
        CustomGenArrayList list = new CustomGenArrayList();
//        list.add(3);
//        list.add(5);
//        list.add(9);
//        System.out.println(list);

        CustomGenArrayList<Integer> list2 = new CustomGenArrayList<>();
        for (int i = 0; i < 14; i++) {
            list2.add(2 * i);
        }

        System.out.println(list2);
    }
}

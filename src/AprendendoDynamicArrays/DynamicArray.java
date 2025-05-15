package AprendendoDynamicArrays;

import java.util.Arrays;
import java.util.Objects;

public class DynamicArray {
    int size;
    int capacity = 1;
    Object[] array;

    public DynamicArray() {
        array = new Object[capacity];
    }

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        array = new Object[capacity];
    }

    public void add(Object element) {
        if (this.capacity <= this.size) {
            grown();
        }
        array[size] = element;
        size++;
    }

    public void insert(int index, Object element) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (this.capacity <= this.size) {
            grown();
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i + 1];
        }
        array[index] = element;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Object current = array[size];
        for (int i = size; i > index; i--) {
            Object previous = array[i - 1];
            array[i - 1] = current;
            current = previous;
        }
    }

    public void delete(Object element) {
        int indexToRemove = search(element);
        if (indexToRemove != -1) {
            remove(indexToRemove);
            return;
        }
        System.out.println("There is no such element");
    }

    public int search(Object element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    private void grown() {
        array = Arrays.copyOf(array, capacity * 2);
    }

    private void shrink() {

    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size - 1; i++) {
            if (i + 2 == size) {
                str.append(array[i]);
                break;
            }
            str.append(array[i]).append(", ");
        }
        return "[" + str.toString() + "]";
    }
}

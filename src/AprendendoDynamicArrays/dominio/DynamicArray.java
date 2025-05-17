package AprendendoDynamicArrays.dominio;

import java.util.Arrays;

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
        verifGrown();
        array[size] = element;
        size++;
    }

    public void insert(int index, Object element) {
        if (index < 0 || index > this.size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        verifGrown();
        for (int i = size; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = element;
        size++;
    }

    public void remove(int index) {
        Object current = array[size];
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        size--;
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

    private void verifGrown() {
        if(this.capacity <= this.size){
            array = Arrays.copyOf(array, capacity * 2);
            capacity *= 2;
        }
    }

    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < size; i++) {
            if (i + 1 == size) {
                str.append(array[i]);
                break;
            }
            str.append(array[i]).append(", ");
        }
        return "[" + str.toString() + "]";
    }

    public int getSize() {
        return size;
    }


    public int getCapacity() {
        return capacity;
    }

}

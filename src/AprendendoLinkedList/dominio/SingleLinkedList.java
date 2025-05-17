package AprendendoLinkedList.dominio;

public class SingleLinkedList<T> {
    SingleNode<T> head;
    SingleNode<T> tail;
    int size;

    public SingleLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void addAt(int index, T object) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        SingleNode<T> auxNode = head;
        SingleNode<T> newSingleNode = new SingleNode<T>(object, null);
        if (index == 0) {
            addFirst(object);
            return;
        } else if (index == size) {
            addLast(object);
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            auxNode = auxNode.next;
        }
        SingleNode<T> nextNode = auxNode.next;
        auxNode.next = newSingleNode;
        newSingleNode.next = nextNode;
        size++;
    }

    public void addFirst(T object) {
        head = new SingleNode<T>(object, head);
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void addLast(T object) {
        SingleNode<T> newSingleNode = new SingleNode<T>(object, null);
        if (head == null) {
            head = newSingleNode;
            tail = head;
            size++;
            return;
        }
        tail.next = newSingleNode;
        tail = newSingleNode;
        size++;
    }

    public void removeAt(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            removeFirst();
            return;
        }
        if (index == size - 1) {
            removeLast();
            return;
        }
        SingleNode<T> auxNode = head;
        for (int i = 0; i < index - 1; i++) {
            auxNode = auxNode.next;
        }
        auxNode.next = auxNode.next.next;
        size--;
    }

    public void removeFirst() {
        if (head == null) return;
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) return;
        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }
        SingleNode<T> temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    @Override
    public String toString() {
        StringBuilder estruturaLista = new StringBuilder();
        estruturaLista.append("[");
        SingleNode<T> auxNode = head;
        for (int i = 0; i < size; i++) {
            estruturaLista.append(auxNode.data);
            if(i != size - 1) {
                estruturaLista.append(" -> ");
            }
            auxNode = auxNode.next;
        }
        estruturaLista.append("]");
        return estruturaLista.toString();
    }

    public T getValue(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            return getHeadValue();
        }
        if (index == size - 1) {
            return getTailValue();
        }
        SingleNode<T> auxNode = head;
        for (int i = 0; i < index; i++) {
            auxNode = auxNode.next;
        }
        return auxNode.data;
    }

    public T getHeadValue() {
        return head.getData();
    }

    public T getTailValue() {
        return tail.getData();
    }

    public int getSize() {
        return size;
    }
}
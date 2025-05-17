package AprendendoLinkedList.dominio;

public class SingleLinkedList {
    SingleNode head;
    SingleNode tail;
    int size;

    public SingleLinkedList() {
        SingleNode head = null;
        SingleNode tail = null;
        size = 0;
    }

    public void addAt(int index, Object object) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        SingleNode auxNode = head;
        SingleNode newSingleNode = new SingleNode(object, null);
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
        SingleNode nextNode = auxNode.next;
        auxNode.next = newSingleNode;
        newSingleNode.next = nextNode;
    }

    public void addFirst(Object object) {
        SingleNode newSingleNode = new SingleNode(object, null);
        SingleNode temp = head;
        head = newSingleNode;
        newSingleNode.next = temp;
        size++;
    }

    public void addLast(Object object) {
        SingleNode newSingleNode = new SingleNode(object, null);
        if (head == null) {
            head = newSingleNode;
            tail = head;
            size++;
            return;
        }
        tail.next = newSingleNode;
        tail = newSingleNode;
        System.out.println(newSingleNode);
        size++;
    }

    public void removeAt(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if (index == 0) {
            removeFirst();
        }
        if (index == size - 1) {
            removeLast();
        }
        SingleNode auxNode = head;
        for (int i = 0; i < index - 1; i++) {
            auxNode = auxNode.next;
        }
        auxNode.next = auxNode.next.next;
        size--;
    }

    public void removeFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head == null) {
            return;
        }
        SingleNode temp = head;
        for (int i = 0; i < size - 1; i++) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    public Object getFirst() {
        return head;
    }

    public Object getLast() {
        return tail;
    }

    @Override
    public String toString() {
        return "SingleLinkedList{" +
                "head=" + head +
                ", tail=" + tail +
                '}';
    }

    public Object getValue(int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        if(index == 0) {
            return getHeadValue();
        }
        if(index == size - 1) {
            return getTailValue();
        }
        SingleNode auxNode = head;
        for(int i = 0; i < index; i++){
            auxNode = auxNode.next;
        }
        return auxNode.data;
    }

    public Object getHeadValue() {
        return head.getData();
    }

    public Object getTailValue() {
        return tail.getData();
    }

    public int getSize() {
        return size;
    }
}
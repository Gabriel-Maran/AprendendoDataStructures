package AprendendoLinkedList.dominio;

import java.util.Optional;

public class SingleNode {
    Object data;
    SingleNode next;

    public SingleNode(Object data, SingleNode next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return "SingleNode{" +
                "data=" + data +
                ", next=" + next +
                '}';
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }
}

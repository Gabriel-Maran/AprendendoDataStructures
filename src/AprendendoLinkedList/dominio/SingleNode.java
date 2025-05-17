package AprendendoLinkedList.dominio;

import java.util.Optional;

public class SingleNode<T> {
    T data;
    SingleNode<T> next;

    public SingleNode(T data, SingleNode<T> next) {
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

    public T getData() {
        return data;
    }
}

package AprendendoQueue.teste;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTeste01 {

    // add = enqueue, offer()
    // remove = dequeue, poll()
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        System.out.println("Tamanho: " + queue.size());
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        System.out.println("Tamanho: " + queue.size());
        System.out.println("Contem o numero 30? " + queue.contains(30));
        System.out.println("Fila: " + queue);
        System.out.println("Primeiro elemento da fila: " + queue.peek());// Pega, sem remover, o primeiro elemento
        System.out.println("Item removido: " + queue.poll());// Remove o primeiro elemento da fila
        System.out.println("Fila: " + queue);


    }
}

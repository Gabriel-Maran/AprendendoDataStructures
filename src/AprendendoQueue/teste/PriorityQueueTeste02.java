package AprendendoQueue.teste;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTeste02 {
    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.add("D");
        priorityQueue.add("A");
        priorityQueue.add("C");
        priorityQueue.add("B");
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }
}

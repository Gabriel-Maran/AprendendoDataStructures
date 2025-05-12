package AprendendoQueue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTeste01 {
    public static void main(String[] args) {
        Queue<Double> priorityQueue = new PriorityQueue<Double>();
        priorityQueue.add(3.0);
        priorityQueue.add(1.0);
        priorityQueue.add(2.0);
        priorityQueue.add(2.5);
        priorityQueue.add(4.0);
        priorityQueue.add(0.5);
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());// Da o poll baseado no que é passado no Collections(menor até o maior, nessa situação)
        }

    }
}

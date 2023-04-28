package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();

        ad.add(firstQueue.poll());
        ad.add(firstQueue.poll());
        ad.add(secondQueue.poll());
        ad.add(secondQueue.poll());

        int move = 0;
        while (!firstQueue.isEmpty() || !secondQueue.isEmpty()) {
            if(move%2==0) {
                firstQueue.add(ad.removeLast());
                ad.add(firstQueue.poll());
                ad.add(firstQueue.poll());
            } else {
                secondQueue.add(ad.removeLast());
                ad.add(secondQueue.poll());
                ad.add(secondQueue.poll());
            }
            move++;
        }
        return ad;
    }
}

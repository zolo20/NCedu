package ru.ars.ncedu.task5.multithreading;


import ru.ars.ncedu.task1.GenerationArrayInteger;

import java.util.concurrent.BlockingQueue;

public class MultithreadingGenerateArray implements Runnable {
    private BlockingQueue<Integer[]> queue;

    public MultithreadingGenerateArray(BlockingQueue<Integer[]> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.put(GenerationArrayInteger.arrayGeneration(100_000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

package com.examples.threads;

public class ProducerAndConsumerWithBuffer {

    public static void main(String[] args) {
        Buffer buffer = new ProducerAndConsumerWithBuffer.Buffer();
        new Thread(() -> {
            for(int i =0; i<10;i++) {
                try {
                    buffer.put(String.valueOf(i));
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "producer").start();

        new Thread(() -> {
            for(int i =0; i<10;i++) {
                try {
                    System.out.println(buffer.take());
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }, "consumer").start();
    }

    public static class Buffer {
        private String data;
        private boolean  available = false;

        public synchronized void put(String s) throws InterruptedException {
            while(available) {
                wait();
            }
            data = String.valueOf(s);
            available = true;
            notifyAll();
        }

        public synchronized String take() throws InterruptedException {
            while(!available) {
                wait();
            }
            notifyAll();
            available = false;
            return data;
        }
    }
}

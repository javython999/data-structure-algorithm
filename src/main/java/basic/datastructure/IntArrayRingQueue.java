package basic.datastructure;

import basic.datastructure.QueueError.EmptyQueueException;
import basic.datastructure.QueueError.OverflowQueueException;

public class IntArrayRingQueue {

    private int[] que;
    private int capacity;
    private int num;
    private int front;
    private int rear;

    public IntArrayRingQueue(int mexLen) {
        num = 0;
        front = 0;
        rear = 0;
        capacity = mexLen;
        try {
            que = new int[mexLen];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int enque(int x) throws OverflowQueueException {
        if (num >= capacity) {
            throw new OverflowQueueException();
        }

        que[rear++] = x;
        num++;

        if (rear == capacity) {
            rear = 0;
        }

        return x;
    }

    public int dequeue() throws EmptyQueueException {
        if (num <= 0) {
            throw new EmptyQueueException();
        }

        int x = que[front++];
        num--;

        if (front == capacity) {
            front = 0;
        }

        return x;
    }

    public int peek() throws EmptyQueueException {
        if (num <= 0) {
            throw new EmptyQueueException();
        }

        return que[front];
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;

            if (que[idx] == x) {
                return idx;
            }
        }

        return -1;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() {
        if (num <= 0) {
            System.out.println("Queue is empty");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.println(que[(i + front) % capacity] + " ");
            }
            System.out.println();
        }

    }
}

package basic.datastructure;

import basic.datastructure.QueueError.EmptyQueueException;
import basic.datastructure.QueueError.OverflowQueueException;

public class IntArrayQueue {

    private int[] que;
    private int capacity;
    private int num;

    public IntArrayQueue(int mexLen) {
        num = 0;
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

        que[num++] = x;
        return x;
    }

    public int deque() throws EmptyQueueException {
        if (num <= 0) {
            throw new EmptyQueueException();
        }

        int x = que[0];

        for (int i = 0; i < num - 1; i++) {
            que[i] = que[i + 1];
        }
        num --;
        return x;
    }

    public int peek() throws EmptyQueueException {
        if (num <= 0) {
            throw new EmptyQueueException();
        }

        return que[0];
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            if (que[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        num = 0;
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
                System.out.print(que[i] + " ");
            }
            System.out.println();
        }
    }
}

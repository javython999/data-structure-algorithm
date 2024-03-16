package basic.datastructure;

import basic.datastructure.DequeException.EmptyDequeException;
import basic.datastructure.DequeException.OverflowDequeException;

public class Deque<E> {

    private E[] que;
    private int capacity;
    private int num;
    private int front;
    private int rear;

    public Deque(int mexLen) {
        capacity = mexLen;
        num = 0;
        front = 0;
        rear = 0;
        try {
            que = (E[]) new Object[mexLen];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public E enqueFront(E x) throws OverflowDequeException {

        if (num >= capacity) {
            throw new OverflowDequeException();
        }

        num ++;

        if (--front < 0) {
            front = capacity - 1;
        }

        que[front] = x;

        return x;
    }

    public E enqueRear(E x) throws OverflowDequeException {
        if (num >= capacity) {
            throw new OverflowDequeException();
        }

        que[rear++] = x;
        num++;

        if (rear == capacity) {
            rear =  0;
        }

        return x;
    }

    public E dequeFront() throws EmptyDequeException {
        if (num <= 0) {
            throw new EmptyDequeException();
        }

        E x = que[front++];
        num--;

        if (front == capacity) {
            front = 0;
        }

        return x;
    }

    public E dequeRear() throws EmptyDequeException {
        if (num <= 0) {
            throw new EmptyDequeException();
        }

        num--;

        if (--rear < 0) {
            rear = capacity - 1;
        }

        return que[rear];
    }

    public E peekFront() throws EmptyDequeException {
        if (num <= 0) {
            throw new EmptyDequeException();
        }
        return que[front];
    }

    public E peekRear() throws EmptyDequeException {
        if (num <= 0) {
            throw new EmptyDequeException();
        }

        return que[rear == 0 ? capacity -1 : rear -1];
    }

    public  int indexOf(E x) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == x) {
                return idx;
            }
        }

        return -1;
    }

    public int search(E x) {
        for (int i = 0; i < num; i++) {
            if (que[(i + front) % capacity] == x) {
                return i + 1;
            }
        }
        return 0;
    }

    public void clear() {
        num = 0;
        front = 0;
        rear = 0;
    }

    public int getCapacity() {
        return capacity;
    }

    public int size() {
        return num;
    }

    public  boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() {
        if (num <= 0) {
            System.out.println("덱이 비어있습니다.");
        } else {
            for (int i = 0; i < num; i++) {
                System.out.println(que[(i + front) % capacity] + " ");
            }
            System.out.println();
        }
    }
}

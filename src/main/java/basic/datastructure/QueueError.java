package basic.datastructure;

public class QueueError {

    public static class EmptyQueueException extends RuntimeException {
        public EmptyQueueException() {}
    }

    public static class OverflowQueueException extends RuntimeException {
        public OverflowQueueException() {}
    }
}

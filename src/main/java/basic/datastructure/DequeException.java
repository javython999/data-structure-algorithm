package basic.datastructure;

public class DequeException {

    public static class EmptyDequeException extends RuntimeException {
        public EmptyDequeException() { }
    }

    public static class OverflowDequeException extends RuntimeException {
        public OverflowDequeException() { }
    }
}

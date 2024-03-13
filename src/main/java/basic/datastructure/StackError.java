package basic.datastructure;

public class StackError {

    public static class EmptyStackException extends RuntimeException {
        public EmptyStackException() { }
    }

    public static class OverflowStackException extends RuntimeException {
        public OverflowStackException() { }
    }
}

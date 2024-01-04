import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("hello world");
    }

    public void rethrowException(int x) throws IOException {
        if (x < 0) {
            throw new IOException("Input cannot be negative");
        }
        try {
            System.out.println("only positive");
            //we can also use some certain condition here for throwing
        } catch (Exception e) {
            e.printStackTrace(); // Print the stack trace
            throw new RuntimeException("Error occurred", e); // Chain the exception
        }
    }
}
public class RequestCounter {
    private int count = 0;

    public void handleRequest() {
        count++;
        System.out.println("Request count: " + count);
    }

    public static void main(String[] args) {
        RequestCounter counter = new RequestCounter();

        // Simulate 3 requests
        counter.handleRequest();
        counter.handleRequest();
        counter.handleRequest();
    }
}
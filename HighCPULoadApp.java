public class HighCPULoadApp {
    public static void main(String[] args) {
        System.out.println("High CPU Load Application is running...");

        // Infinite loop generating CPU load
        while (true) {
            // Perform a computationally expensive task
            double result = 0;
            for (int i = 0; i < 1_000_000; i++) {
                result += Math.sqrt(i) * Math.sin(i); // Arbitrary CPU-intensive calculation
            }
        }
    }
}

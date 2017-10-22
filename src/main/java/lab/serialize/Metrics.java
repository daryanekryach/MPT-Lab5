package lab.serialize;

public class Metrics {
    private static long startTime;
    private static long stopTime;

    public static void start() {
        startTime = System.nanoTime();
    }

    public static void stop() {
        stopTime = System.nanoTime();
    }

    public static void getExecutionTime() {
        long estimatedTime = stopTime - startTime;
        System.out.println("Execution time: " + estimatedTime);
    }

    public static void getUsedMemory() {
        long usedBytes = (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
        System.out.println("Used memory: " + convertToMegabytes(usedBytes));
    }

    private static long convertToMegabytes(long bytes) {
        return bytes / 1048576;
    }
}

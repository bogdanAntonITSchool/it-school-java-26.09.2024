
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsMain {

    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();

        // This is how you can create a thread using Executors
//        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
//            executorService.execute(myRunnable);
//            executorService.execute(myRunnable);
//            executorService.execute(myRunnable);
//            executorService.execute(myRunnable);
//        }

        // This is how you can create a thread pool using Executors
        // You can specify the number of threads in the pool
        try (ExecutorService executorService = Executors.newFixedThreadPool(2)) {
            executorService.execute(myRunnable);
            executorService.execute(myRunnable);
        }

        System.out.println("Hello, from main Thread");
    }

    // You can pass runnables to the executor service
    // This is how you can create a custom runnable in a class
    private static class MyRunnable implements Runnable {
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("iteration " + i + " by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

}

public class Main {
    public static void main(String[] args) throws InterruptedException {
        // This is how you can create a thread
        Thread t = new CustomThread();
        Thread t1 = new CustomThread();
        Thread t2 = new CustomThread();
        Thread t3 = new CustomThread();
        Thread t4 = new CustomThread();

        // A daemon thread is a thread that does not prevent the JVM from exiting when the program finishes but the thread is still running
        // t.setDaemon(true);

        // This is how you can start a thread, this will call the run method of the thread
        // If we call the run method directly it will run in the same thread
        t.start();
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // calling join on a thread makes the current thread wait until the thread on which join is called is finished
        t.join();
        t1.join();
        t2.join();
        t3.join();
        t4.join();

        // The main thread will continue to run even if the other threads are still running
        Thread.sleep(500);
        System.out.println("done");
    }


    // This is how you can create a custom thread by extending the Thread class
    // This is not the recommended way to create a thread
    // The recommended way is to implement the Runnable interface
    private static class CustomThread extends Thread {

        // This is the method that will be executed
        // when the thread is started
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                System.out.println("iteration " + i + " by " + Thread.currentThread().getName());

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
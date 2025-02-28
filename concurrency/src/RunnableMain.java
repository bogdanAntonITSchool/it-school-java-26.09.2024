public class RunnableMain {

    public static void main(String[] args) throws InterruptedException {
        // This is a lambda expression that implements the Runnable interface
        Runnable r = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello from Runnable");
        };

        // This is how you can create a thread based on a Runnable
        Thread t = new Thread(r);

        t.start();
        t.join();

        System.out.println("done");
    }

}

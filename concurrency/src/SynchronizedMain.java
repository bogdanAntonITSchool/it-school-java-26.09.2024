import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SynchronizedMain {

    private static final Object lock = new Object();

    public static void main(String[] args) {
        Lock lockObject = new ReentrantLock();

        Thread t = new Thread(() -> doSomethingWithLock(lockObject));
        Thread t2 = new Thread(() -> doSomethingWithLock(lockObject));
        Thread t3 = new Thread(() -> doSomethingWithLock(lockObject));
        Thread t4 = new Thread(() -> doSomethingWithLock(lockObject));
        Thread t5 = new Thread(() -> doSomethingWithLock(lockObject));
        Thread t6 = new Thread(() -> doSomethingWithLock(lockObject));
        Thread t7 = new Thread(() -> doSomethingWithLock(lockObject));

        t.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

        System.out.println("Main");
    }

    // If we want to synchronize a block of code we can use the synchronized keyword
    // This must be applied on a variable that is shared between the threads
    // For example we have a static object that is shared between the threads
    private static void doSomething() {
        synchronized (lock) {
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

    // We can also use a Lock object to synchronize a block of code
    // This is more flexible than the synchronized keyword
    private static void doSomethingWithLock(Lock lock) {
        // the tryLock method will try to acquire the lock
        // if the lock is not available it will return false
        boolean b = lock.tryLock();
        if (!b) {
            System.out.println("Could not acquire lock");
            return;
        }

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("iteration " + i + " by " + Thread.currentThread().getName());
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        } finally {
            // we must release the lock when we are done
            lock.unlock();
        }
    }

}

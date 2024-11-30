package isp;

/**
 * This interface represents a worker.
 * A worker can work and do something.
 * <p>
 * The Interface Segregation Principle states that a class should not be forced to implement interfaces it doesn't use.
 */
public interface Worker {

    void work();

    void doSomething();

}

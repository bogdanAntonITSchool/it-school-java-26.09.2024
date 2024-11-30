package isp;

public class HumanWorker implements Worker {

    @Override
    public void work() {
        System.out.println("Working...");
    }

    @Override
    public void doSomething() {
        System.out.println("Doing something...");
    }

}

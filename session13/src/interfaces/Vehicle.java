package interfaces;

public abstract class Vehicle implements Drivable {

    private int hp;
    private int engineSize;

    // 'protected' makes the constructor accessible to subclasses
    protected Vehicle(int hp, int engineSize) {
        this.hp = hp;
        this.engineSize = engineSize;
    }

    public int getHp() {
        return hp;
    }

    public int getEngineSize() {
        return engineSize;
    }

}

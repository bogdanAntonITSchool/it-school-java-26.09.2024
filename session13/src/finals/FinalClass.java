package finals;

// 'final' at class level means that the class cannot be extended
public final class FinalClass {

    private int x;

    public FinalClass(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

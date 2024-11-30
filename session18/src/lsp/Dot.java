package lsp;

public class Dot extends ShapeWithoutArea {

    @Override
    public void draw() {
        System.out.println("Drawing Dot");
    }

    @Override
    public void commonBehavior() {
        System.out.println("Common behavior of Dot");
    }
}

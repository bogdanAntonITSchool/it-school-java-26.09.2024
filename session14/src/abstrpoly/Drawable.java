package abstrpoly;

public interface Drawable {

    void draw();

    default void drawWithColor(String color) {
        System.out.println("Drawing with color: " + color);
    }

}

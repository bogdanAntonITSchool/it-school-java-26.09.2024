public class Main {
    public static void main(String[] args) {
        // regular Book instance
        Book simpleBook = new Book("Simple Book", "Simple Author");

        // the variable specificBook is of type Book, but the object is of type SpecificBook
        Book specificBook = new SpecificBook("Specific Book", "Specific Author", "Specific Property");

        simpleBook.printBookDetails();
        specificBook.printBookDetails();

        // anonymous class.
        // it means that we create a class that extends the Book class and we create an instance of that class without giving it a name
        Book anonymousBook = new Book("Anonymous Book", "Anonymous Author") {
            @Override
            public void printBookDetails() {
                super.printBookDetails();
                System.out.println("Anonymous Book");
            }
        };

        anonymousBook.printBookDetails();

        // this is also an anonymous class, but now we implement the interface Drawable
        Drawable circle = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing a circle");
            }
        };

        // for functional interfaces we can use lambda expressions
        Drawable circleLambda = () -> System.out.println("Drawing a circle");

        // it prints "Drawing a circle" two times
        circle.draw();
        circleLambda.draw();

        // for non-functional interfaces we cannot use lambda expressions
        SecondDrawable secondDrawable = new SecondDrawable() {
            @Override
            public void draw() {
                System.out.println("Drawing a square");
            }

            @Override
            public void secondDraw() {
                System.out.println("Drawing a second square");
            }
        };

        DrawableArgs argsCircle = (s) -> System.out.println("Drawing a " + s);

        argsCircle.draw("triangle");
        argsCircle.draw("rectangle");
    }
}

// this is a functional interface because it has only one abstract method
@FunctionalInterface
interface Drawable {
    void draw();
}


// this is a functional interface because it has only one abstract method
@FunctionalInterface
interface DrawableArgs {
    void draw(String shape);
}

// this is not a functional interface because it has two abstract methods
interface SecondDrawable {
    void draw();

    void secondDraw();
}

class Book {

    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void printBookDetails() {
        System.out.println("--------------------");
        System.out.println("Title: " + title + ", Author: " + author);
    }

}

class SpecificBook extends Book {

    private String property;

    public SpecificBook(String title,
                        String author,
                        String property) {
        super(title, author);
        this.property = property;
    }

    @Override
    public void printBookDetails() {
        super.printBookDetails();
        System.out.println("Property: " + property);
    }

}
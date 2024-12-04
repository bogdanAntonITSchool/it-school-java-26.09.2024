package generics;

// This is a class containing an Object field.
// By having an Object field, this class can store any type of object.
// This is not a good practice as you need to cast the object to the desired type when you retrieve it.
public class Box {

    private Object content;

    public Box(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    public void printContent() {
        System.out.println(content);
    }
}

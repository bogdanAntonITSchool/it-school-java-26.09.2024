public class Main {
    public static void main(String[] args) {

        int x = 10;

        // This is how we can convert a primitive int to an Integer object
        Integer y = 20; // autoboxing

        // Any Wrapper Class object can be converted to a primitive type by using an instance method.
        byte b = y.byteValue();

        // If we want to convert a String to an Integer object, we can use the valueOf method.
        Integer i = Integer.valueOf("123");

        // The Wrapper classes contains a set of static methods that can be used for utility purposes.
        int min = Integer.min(10, 20);

        Integer integer = Integer.valueOf(10);
        Integer autoboxedInteger = 10;
        Integer anotherAutoboxedInteger = x;

        byte myPrimitiveByte = 10;

        // won't work as autoboxing is not taking care of casting
        // Integer anotherInteger = myPrimitiveByte;

        byte g = 10;
        int xx = g;

        // This is how we can convert an Integer object to a primitive int
        int ii = integer; // unboxing

        // String class contains the valueOf method that can be used to convert a primitive type to a String
        String s = String.valueOf(10); // "10"

    }
}
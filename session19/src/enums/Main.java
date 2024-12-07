package enums;

public class Main {

    public static void main(String[] args) {

        Color blue = Color.BLUE;
        System.out.println(blue.getLowerCase());

        Color[] values = Color.values();

        for (Color color : values) {
            System.out.println(color.getLowerCase());
        }

        Color red = Color.valueOf("RED");
        Color grEEn = Color.getEnumByValue("grEEn");

        System.out.println(grEEn);

        Color.hello();

    }

}

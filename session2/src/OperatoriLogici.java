public class OperatoriLogici {

    public static void main(String[] args) {
        int x = 10;

        System.out.println(x <= 10 && x == 15);
        System.out.println(x > 100 | true); // 0 | 1 =>
        System.out.println(x > 100 & true);

        System.out.println(5 & 2); // 101 & 010 => 000
        System.out.println(false && true);

        // '&&', both conditions must be 'true', then returns 'true', otherwise returns 'false';
        // '||', if at least one condition is 'true', then returns 'true';

        // '&&' stops if the first condition is 'false';
        // '||' stops if the first condition is 'true';

        // '!', negation operator, inverts the value of a boolean expression;
    }
}

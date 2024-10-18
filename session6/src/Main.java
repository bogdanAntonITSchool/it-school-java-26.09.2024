
public class Main {
    public static void main(String[] args) {
        String human = "A human";
        String dog = "a dog";

        // String concatenation
        human = human + " and "; // human --> "A human and "
        // equivalent to
        // human += " and ";

        human += dog; // human --> "A human and a dog"

        System.out.println(human);
        System.out.println(dog);

        int x = 10;

        x = 15;
        System.out.println(x);

        String s1 = "John";
        s1 = "Doe";


        String str1 = "It School";
        String str2 = "It School";

        String str3 = new String("It School");

        System.out.printf("Salut!");


        String firstString = "firstString";
        String secondString = new String("firstString");

        String internedSecondString = secondString.intern();

        System.out.println("salut");


        String s = "Hello"; // stored in the string pool
        String ss = new String("Hello"); // stored in the heap

        String internedSs = ss.intern();

        if (s == ss) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        if (s == internedSs) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

        if (s.equals(ss)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }


        String myString = "My String";
        String longSubstring = myString.substring(3);
        String shortSubstring = myString.substring(3, 5);

        System.out.println(longSubstring);
        System.out.println(shortSubstring);

        char[] charArray = myString.toCharArray();
//        for (char c : charArray) {
//            System.out.println(c);
//        }

        int length = charArray.length;
        int length1 = myString.length();

        char c = myString.charAt(3);
        System.out.println(c);

        int i = myString.indexOf('S');
        int i1 = myString.indexOf("Str");

        System.out.println(i);

        String upperCase = myString.toLowerCase();
        System.out.println(upperCase);

        boolean startsWith = myString.startsWith("Str", 3);
        System.out.println(startsWith);

        boolean contains = myString.contains("Str");
        System.out.println(contains);

        String replace = myString.replace('S', 'm');
        System.out.println(replace);

        String stringValue = "11223344";
        String stringReplaceValue = stringValue.replace('1', '2');
        String ss1 = stringValue.replaceFirst("1", "2");

        System.out.println(ss1);

        String untrimmedString = "  My String  ";
        String trimmedString = untrimmedString.trim();

        System.out.println(untrimmedString);
        System.out.println(trimmedString);

        // stringValue.replace("a" && "b", "m" && "n");

        if (stringValue.length() == 3 && trimmedString.contains("str")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        String dog1 = "  a Dog   ";
        String trimmedUpperCaseDog = dog1.toUpperCase().trim();

        System.out.println(trimmedUpperCaseDog);

        String h = "A human";
        String concatenatedString = h.concat(" ")
                .concat("and")
                .concat(" ")
                .concat("a dog");

        System.out.println(concatenatedString);


        StringBuilder sb = new StringBuilder("A");
        sb.append(" dog");
        sb.append(4);
        sb.insert(5, " has ");
        sb.insert(sb.length(), " yo.");

        String string = sb.toString();
        System.out.println(string);

        String string1 = new StringBuilder(string)
                .reverse()
                .toString();

        System.out.println(string1);
    }
}
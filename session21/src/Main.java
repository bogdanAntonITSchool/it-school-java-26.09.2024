public class Main {
    public static void main(String[] args) {

        MyHelperClass myHelperClass = new MyHelperClass("192.168.0.0");

        String anonymizeIp = myHelperClass.anonymizeIp();
        System.out.println(anonymizeIp);

        System.out.println(MyUtilityClass.anonymizeIp("192.168.0.0"));
    }
}

class MyUtilityClass {

    private MyUtilityClass() {}

    public static String anonymizeIp(String ip) {
        char[] charArray = ip.toCharArray();

        for (int i = 2; i < charArray.length - 2; i++) {
            charArray[i] = '*';
        }

        return new String(charArray);
    }

}

class MyHelperClass {

    private final String ip;

    public MyHelperClass(String ip) {
        this.ip = ip;
    }

    public String anonymizeIp() {
        char[] charArray = ip.toCharArray();

        for (int i = 2; i < charArray.length - 2; i++) {
            charArray[i] = '*';
        }

        return new String(charArray);
    }

}
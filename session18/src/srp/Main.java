package srp;

import srp.model.Document;
import srp.printer.Printer;
import srp.printer.impl.DocumentPrinter;

public class Main {

    public static void main(String[] args) {
        Printer documentPrinter = new DocumentPrinter();
        Document document = new Document("John", "Hello, World!", "My First Document");

        documentPrinter.print(document);
    }

}

package srp.printer.impl;

import srp.model.Document;
import srp.printer.Printer;

/**
 * This class is used to print documents.
 * It implements the Printer interface.
 * <p>
 * This class follows the Single Responsibility Principle as it has only one reason to change:
 * - if the printing logic changes.
 */
public class DocumentPrinter implements Printer {

    @Override
    public void print(Object o) {
        if (o instanceof Document document) {
            System.out.println("Title: " + document.getTitle());
            System.out.println("Author: " + document.getAuthor());
            System.out.println("Content: " + document.getContent());
        } else {
            System.out.println("Invalid document");
        }
    }

}

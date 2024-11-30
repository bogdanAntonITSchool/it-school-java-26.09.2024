package srp.model;

/**
 * This class represents a document.
 * It has a title, content and author.
 * <p>
 * This class follows the Single Responsibility Principle as it has only one reason to change:
 * - if the document structure changes.
 */
public class Document {

    private String title;
    private String content;
    private final String author;

    public Document(String author,
                    String content,
                    String title) {
        this.author = author;
        this.content = content;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAuthor() {
        return author;
    }

}

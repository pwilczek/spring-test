package name.wilu.spring.model;

/**
 * Created by PLPIWIL2 on 8/21/2014.
 */
public class Book {

    private String title, author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "The book of: " + this.getAuthor() + ", title:  " + this.getTitle();
    }
}

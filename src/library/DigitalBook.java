package library;

public class DigitalBook extends Book {

    DigitalBook(String bookTitle) {
        super(bookTitle);

    }
    public String getTitle()
    {
        return super.getTitle() + " Digital";
    }
}

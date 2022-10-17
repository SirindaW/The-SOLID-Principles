import java.util.List;

public class BookReader implements PrintToScreen {
    
    @Override
    public void printToScreen(Book book) {
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }

    public static void main(String[] args) {
        BookReader bookReader = new BookReader();
        BookPublisher bookPublisher = new BookPublisher();
        bookReader.printToScreen(bookPublisher.book);
    }
}
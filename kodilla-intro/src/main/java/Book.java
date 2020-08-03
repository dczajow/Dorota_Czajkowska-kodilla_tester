public class Book {

    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String toString() {
        return this.author + " - " + this.title;
    }

    public static void main(String[] args) {
        Book book = Book.of("Agnieszka Stein", "Dziecko z bliska");
        System.out.println(book);
    }

    private static Book of(String author, String title) {
        return new Book(author, title);
    }

}
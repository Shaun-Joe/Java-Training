package third;

class Book {
    private String title;
    private String author;

    // Instance initializer block
    {
        title = "Harry Potter";
        author = "J. K Rowling";
        System.out.println("Instance initializer block executed.");
    }

    public Book() {
        System.out.println("Book created: " + title + " by " + author);
    }
}

public class InstanceInitializerBlockExample {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        Book book = new Book();
    }
}

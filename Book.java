class Book {
    int bookId;
    String title;
    String author;
    double price;

    static int totalBooks = 0;

   
    Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;

        totalBooks++;
    }
    void display() {
        System.out.println("Book ID  : " + bookId);
        System.out.println("Title    : " + title);
        System.out.println("Author   : " + author);
        System.out.println("Price    : " + price);
        System.out.println();
    }
    void search(int id) {
        if (bookId == id)
            System.out.println("Book found: " + title);
        else
            System.out.println("Book not found");
    }
    void search(String t) {
        if (title.equalsIgnoreCase(t))
            System.out.println("Book found: " + title);
        else
            System.out.println("Book not found");
    }

   
    Book costlier(Book b) {
        if (this.price > b.price)
            return this;
        else
            return b;
    }

  
    public static void main(String[] args) {

        Book b1 = new Book(101, "Java Programming", "James", 500);
        Book b2 = new Book(102, "Python Programming", "Guido", 700);
        Book b3 = new Book(103, "C Programming", "Dennis", 450);

        System.out.println("BOOK DETAILS");
        System.out.println("------------");

        b1.display();
        b2.display();
        b3.display();
        System.out.println("Searching by Book ID:");
        b1.search(101);
        System.out.println("\nSearching by Title:");
        b2.search("Python Programming");

   
        Book costly = b1.costlier(b2);

        System.out.println("\nCostlier Book:");
        costly.display();

        System.out.println("Total Books Created: " + Book.totalBooks);
    }
}
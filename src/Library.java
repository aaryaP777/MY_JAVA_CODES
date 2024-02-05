public class Library {
    private String author, book_name;
    private int copies, shelves;
    public Library(String author, String book_name, int copies, int shelves) {
        this.author = author;
        this.book_name = book_name;
        this.copies = copies;
        this.shelves = shelves;
    }

    public String getAuthor() {
        return author;
    }

    public String getBook_name() {
        return book_name;
    }

    public int getCopies() {
        return copies;
    }

    public int getShelves() {
        return shelves;
    }

    public void setShelves(int shelves) {
        this.shelves = shelves;
    }

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("Author is: " + author);
        System.out.println("Book is: " + book_name);
        System.out.println("No. of copies: " + copies);
        System.out.println("No. of shelves: " + shelves);
    }

    public static void main(String[] args) {
        Library lib1 = new Library("JK Rowling", "Harry Potter", 10, 3);
        lib1.display();
    }
}

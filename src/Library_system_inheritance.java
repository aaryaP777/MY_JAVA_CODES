class Item {
    public String name;
    public int ID;
    public int cost;

    public void displayItem() {
        System.out.println("-----------THE ITEM IS-----------");
    }
}

class Book extends Item {
    String author;

    public Book(String name, int ID, int cost, String author) {
        this.name = name;
        this.ID = ID;
        this.cost = cost;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Title of the Book: " + name);
        System.out.println("ID of the Book: " + ID);
        System.out.println("Author of the Book: " + author);
        System.out.println("Cost of the Book: " + cost + "Rs.");
        System.out.println();
    }
}

class DVD extends Item {
    String director;

    public DVD(String name, int ID, int cost, String director) {
        this.name = name;
        this.ID = ID;
        this.cost = cost;
        this.director = director;
    }

    void displayDVD() {
        System.out.println("Title of the DVD: " + name);
        System.out.println("ID of the DVD: " + ID);
        System.out.println("Director of the DVD: " + director);
        System.out.println("Cost of the DVD: " + cost + "Rs.");
        System.out.println();
    }
}

class Magazine extends Item {
    String category;

    public Magazine(String name, int ID, int cost, String category) {
        this.name = name;
        this.ID = ID;
        this.cost = cost;
        this.category = category;
    }

    void displayMagazine() {
        System.out.println("Title of the Magazine: " + name);
        System.out.println("ID of the Magazine: " + ID);
        System.out.println("Category of the Magazine: " + category);
        System.out.println("Cost of the Magazine: " + cost + "Rs.");
        System.out.println();
    }
}


public class Library_system_inheritance {
    public static void main(String[] args) {
        System.out.println("LIBRARY MANAGEMENT SYSTEM");

        Book book = new Book("Harry Potter", 123, 800, "JK Rowling");
        book.displayItem();
        book.displayBook();

        DVD dvd = new DVD("Inception", 124, 500, "Christopher Nolan");
        dvd.displayItem();
        dvd.displayDVD();

        Magazine magazine = new Magazine("National Geographic", 125, 200, "Science");
        magazine.displayItem();
        magazine.displayMagazine();
    }
}

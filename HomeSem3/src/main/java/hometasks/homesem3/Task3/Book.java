package hometasks.homesem3.Task3;

public class Book {
    String nameBook;
    String secondNameAuthor;
    Integer price;
    Integer year;
    Integer countLists;

    public Book(String nameBook, String secondNameAuthor, int price, int year, int countLists) {
        this.nameBook = nameBook;
        this.secondNameAuthor = secondNameAuthor;
        this.price = price;
        this.year = year;
        this.countLists = countLists;
    }
    @Override
    public String toString() {
        return "Book{" +
                "NameBook: " + nameBook +
                " Author: " + secondNameAuthor +
                " price: " + price +
                " year: " + year +
                " Lists: " + countLists +
                '}' + "\n";
    }
}

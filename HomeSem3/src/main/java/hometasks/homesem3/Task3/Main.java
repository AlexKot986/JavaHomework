package hometasks.homesem3.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * 3. Сведения о книге состоят из названия, фамилии автора, цены, года издания и количества страниц.
     * Найти названия книг, в которых простое количество страниц, фамилия автора содержит «А» и
     * год издания после 2010 г, включительно.
     */
    public static void main(String[] args) {
        List<Book> books = GetBooks();

        for (Book book : books) {
            if (book.secondNameAuthor.startsWith("А") && book.year >= 2010 && IsSimple(book.countLists)){
                System.out.print(book.toString());
            }
        }
    }
    public static List<Book> GetBooks(){
        List<Book> books = new ArrayList<>();
        books.add(new Book("Война и мир", "Толстой", 1200, 1873, 1300));
        books.add(new Book("Ромашки в саду", "Афанасьев", 120, 2018, 131));
        books.add(new Book("Монстр на дороге", "Петров", 1000, 2005, 1000));
        books.add(new Book("Тигр в клетке", "Рыбкин", 160, 2020, 870));
        books.add(new Book("Как приручить хорька", "Жукова", 5000, 2019, 600));
        books.add(new Book("Сад и огород", "Арчик", 100, 2001, 500));
        books.add(new Book("О рыбалке", "Суслов", 80, 1999, 771));
        books.add(new Book("Зимний сад", "Прыжков", 890, 2022, 300));
        books.add(new Book("Тюлени на охоте", "Алая", 1250, 2013, 719));
        books.add(new Book("Про футбол", "Гусь", 70, 2023, 1010));

        return books;
    }
    public static boolean IsSimple(int number){
        if (number == 1) return false;
        if (number == 2) return true;
        if (number % 2 == 0) return false;
        if (number > 1) {
            for (int i = 3; i <= Math.sqrt(number); i += 2) {
                if (number % i == 0) return false;
            }
            return true;
        }
        return false;
    }
}

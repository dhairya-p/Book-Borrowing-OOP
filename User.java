package BookBorrowing;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {
    private String name;
    private LocalDate birthday;
    private ArrayList<Book> books;

    // Constructor
    public User(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
        this.books = new ArrayList<>();
    }

    // Method to borrow a book
    public void borrow(Book book) {
        this.books.add(book);
    }

    // Method to get the user's age
    public int getAge() {
        return Period.between(this.birthday, LocalDate.now()).getYears();
    }

    // Getter for the name
    public String getName() {
        return this.name;
    }

    // Setter for the name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for the birthday
    public LocalDate getBirthday() {
        return this.birthday;
    }

    // Setter for the birthday
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    // Method to get the list of borrowed books
    public ArrayList<Book> getBooks() {
        return this.books;
    }
}

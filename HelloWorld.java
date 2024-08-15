package BookBorrowing;

import java.time.LocalDate;

public class HelloWorld {
    public static void main(String []args) {
        User user = new User("John", LocalDate.of(2001, 7, 4));
        System.out.println("Name: " + user.getName());
        System.out.println("Age: " + user.getAge());

        // Example of borrowing a book
        Book book = new Book("1984", "George Orwell");
        user.borrow(book);

        // Display borrowed books
        System.out.println("Borrowed Books:");
        for (Book b : user.getBooks()) {
            System.out.println("Title: " + b.getTitle() + ", Author: " + b.getAuthor());
        }
    }
}

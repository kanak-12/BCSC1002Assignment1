/*  Created by IntelliJ IDEA.
 *  User: Kanak Srivastava (kanak-12)
 *  Date: 29/08/20
 *  Time: 10:00 AM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] booksThatAreCurrentlyAvailabe;

    public Library() {
        this.booksThatAreCurrentlyAvailabe = new Book[8];
        for (int i = 0; i < booksThatAreCurrentlyAvailabe.length; i++) {
            booksThatAreCurrentlyAvailabe[i] = new Book("Book" + (i + 1));
        }
    }

    public Library(Book[] booksThatAreCurrentlyAvailabe) {
        this.booksThatAreCurrentlyAvailabe = booksThatAreCurrentlyAvailabe;
    }

    public Book[] getBooksThatAreCurrentlyAvailabe() {
        return booksThatAreCurrentlyAvailabe;
    }

    public void setBooksThatAreCurrentlyAvailabe(Book[] booksThatAreCurrentlyAvailabe) {
        this.booksThatAreCurrentlyAvailabe = booksThatAreCurrentlyAvailabe;
    }

    // The toString method.
    public String toString() {
        return "Library{" +
                "booksThatAreCurrentlyAvailabe=" + Arrays.toString(booksThatAreCurrentlyAvailabe) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(getBooksThatAreCurrentlyAvailabe(), library.getBooksThatAreCurrentlyAvailabe());
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(getBooksThatAreCurrentlyAvailabe());
    }

    /**
     * This method helps us to issue a book.
     *
     * @param bookName The name of the book to be issued.
     */
    public void issueBook(String bookName) {
        System.out.println(bookName + "is issued to you.");
    }

    /**
     * This method helps us to return the book.
     *
     * @param bookName Name of the book to be returned from the student.
     */
    public void returnBook(String bookName) {
        System.out.println("Thanks for returning" + bookName + ".");
    }
}


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
}


/*  Created by IntelliJ IDEA.
 *  User: Kanak Srivastava (kanak-12)
 *  Date: 28/08/20
 *  Time: 8:06 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book {
    private String nameOfBook;
    private String authorOfBook;
    private String isbnNumber;

    public Book() {
        nameOfBook = "Advanced Engineering Mathematics";
        authorOfBook = "H.K.Dass";
        isbnNumber = "9876543211234";
    }

    public String getAuthorOfBook() {
        return authorOfBook;
    }

    public void setAuthorOfBook(String authorOfBook) {
        this.authorOfBook = authorOfBook;
    }

    public String getNameOfBook() {
        return nameOfBook;
    }

    public void setNameOfBook(String nameOfBook) {
        this.nameOfBook = nameOfBook;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    //The toString() method.
    public String toString() {
        return "Book{" +
                "nameOfBook='" + nameOfBook + '\'' +
                ", authorOfBook='" + authorOfBook + '\'' +
                ", isbnNumber='" + isbnNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getNameOfBook(), book.getNameOfBook()) &&
                Objects.equals(getAuthorOfBook(), book.getAuthorOfBook()) &&
                Objects.equals(getIsbnNumber(), book.getIsbnNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNameOfBook(), getAuthorOfBook(), getIsbnNumber());
    }
}

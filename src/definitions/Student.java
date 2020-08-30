/*  Created by IntelliJ IDEA.
 *  User: Kanak Srivastava (kanak-12)
 *  Date: 28/08/20
 *  Time: 10:14 PM
 *  File Name : Student.java
 * */
package definitions;

public class Student {
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private long universityRollNumberOfStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] namesOfBookIssuedByStudent;

    public int getNumberOfBooksIssuedByStudent() {
        return numberOfBooksIssuedByStudent;
    }

    public void setNumberOfBooksIssuedByStudent(int numberOfBooksIssuedByStudent) {
        this.numberOfBooksIssuedByStudent = numberOfBooksIssuedByStudent;
    }

    public long getUniversityRollNumberOfStudent() {
        return universityRollNumberOfStudent;
    }

    public void setUniversityRollNumberOfStudent(long universityRollNumberOfStudent) {
        this.universityRollNumberOfStudent = universityRollNumberOfStudent;
    }

    public String getFirstNameOfStudent() {
        return firstNameOfStudent;
    }

    public void setFirstNameOfStudent(String firstNameOfStudent) {
        this.firstNameOfStudent = firstNameOfStudent;
    }

    public String getLastNameOfStudent() {
        return lastNameOfStudent;
    }

    public void setLastNameOfStudent(String lastNameOfStudent) {
        this.lastNameOfStudent = lastNameOfStudent;
    }

    public String getMiddleNameOfStudent() {
        return middleNameOfStudent;
    }

    public void setMiddleNameOfStudent(String middleNameOfStudent) {
        this.middleNameOfStudent = middleNameOfStudent;
    }

    public Book[] getNamesOfBookIssuedByStudent() {
        return namesOfBookIssuedByStudent;
    }

    public void setNamesOfBookIssuedByStudent(Book[] namesOfBookIssuedByStudent) {
        this.namesOfBookIssuedByStudent = namesOfBookIssuedByStudent;
    }
}

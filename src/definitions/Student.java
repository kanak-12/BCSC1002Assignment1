/*  Created by IntelliJ IDEA.
 *  User: Kanak Srivastava (kanak-12)
 *  Date: 28/08/20
 *  Time: 10:14 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    private String firstNameOfStudent;
    private String middleNameOfStudent;
    private String lastNameOfStudent;
    private long universityRollNumberOfStudent;
    private int numberOfBooksIssuedByStudent;
    private Book[] namesOfBookIssuedByStudent;

    public Student() {
        firstNameOfStudent = "Abhishek";
        middleNameOfStudent = "Pratap";
        lastNameOfStudent = "Singh";
        universityRollNumberOfStudent = 191500334;
        numberOfBooksIssuedByStudent = 13;
    }

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

    // The toString() method.
    public String toString() {
        return "Student{" +
                "firstNameOfStudent='" + firstNameOfStudent + '\'' +
                ", middleNameOfStudent='" + middleNameOfStudent + '\'' +
                ", lastNameOfStudent='" + lastNameOfStudent + '\'' +
                ", universityRollNumberOfStudent=" + universityRollNumberOfStudent +
                ", numberOfBooksIssuedByStudent=" + numberOfBooksIssuedByStudent +
                ", namesOfBookIssuedByStudent=" + Arrays.toString(namesOfBookIssuedByStudent) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumberOfStudent() == student.getUniversityRollNumberOfStudent() &&
                getNumberOfBooksIssuedByStudent() == student.getNumberOfBooksIssuedByStudent() &&
                Objects.equals(getFirstNameOfStudent(), student.getFirstNameOfStudent()) &&
                Objects.equals(getMiddleNameOfStudent(), student.getMiddleNameOfStudent()) &&
                Objects.equals(getLastNameOfStudent(), student.getLastNameOfStudent()) &&
                Arrays.equals(getNamesOfBookIssuedByStudent(), student.getNamesOfBookIssuedByStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getFirstNameOfStudent(), getMiddleNameOfStudent(), getLastNameOfStudent(), getUniversityRollNumberOfStudent(), getNumberOfBooksIssuedByStudent());
        result = 31 * result + Arrays.hashCode(getNamesOfBookIssuedByStudent());
        return result;
    }
}

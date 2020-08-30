/*  Created by IntelliJ IDEA.
 *  User: Kanak Srivastava (kanak-12)
 *  Date: 29/08/20
 *  Time: 2:45 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Library;

import java.util.Scanner;

public class FrontDesk {
    private static final int ISSUE_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int SHOW_ALL_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;

    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int studentChoice;
        Library libraryObject = new Library();

        do {
            System.out.println("_=_=__=_=_Welcome To The Front Desk");
            System.out.println("How may I help you today?");
            System.out.println("1.Issue a new book for me.");
            System.out.println("2.Return a previously issued book.");
            System.out.println("3.Show me all issued books.");
            System.out.println("4.Exit");
            System.out.println("Enter your choice(1...4:)");
            studentChoice = scannerObject.nextInt();
            switch (studentChoice) {
                case ISSUE_BOOK:
                    System.out.println("Enter the name of the book which you want to issue:");
                    scannerObject.nextLine();
                    String bookName = scannerObject.nextLine();
                    libraryObject.issueBook(bookName);
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the nem of the book which you want to return:");
                    scannerObject.nextLine();
                    bookName = scannerObject.nextLine();
                    libraryObject.returnBook(bookName);
                    break;
                case SHOW_ALL_ISSUED_BOOKS:
                    libraryObject.showAllIssuedBooks();
                    break;
                case EXIT:
                    System.out.println("Thank You.");
                    break;
                default:
                    System.out.println("wrong choice");

            }
        } while (studentChoice != EXIT);
        scannerObject.close();
    }
}

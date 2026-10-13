package lms;
import lms.model.*;
import lms.service.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book b1 = new Book("B001", "Clean Code", "Robert C. Martin");
        Book b2 = new Book("B002", "Effective Java", "Joshua Bloch");
        DVD d1 = new DVD("D001", "Introduction to Algorithms", 120);

        library.addItem(b1);
        library.addItem(b2);
        library.addItem(d1);

        Student s1 = new Student("M001", "Nadeesha Perera");
        Staff st1 = new Staff("M002", "Mr. Kasun Silva");

        library.addMember(s1);
        library.addMember(st1);

        library.listItems();
        library.listMembers();
        library.printAllLateFees(3);

        try {
            Book invalidBook = new Book("B003", "", "Unknown");
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected invalid book: " + e.getMessage());
        }
    }
}

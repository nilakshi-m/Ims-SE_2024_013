package lms.service;

import lms.model.LibraryItems;
import lms.model.Member;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private final List<LibraryItems> items = new ArrayList<>();
    private final List<Member> members = new ArrayList<>();

    public void addItem(LibraryItems item) {
        items.add(item);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public void listItems() {
        System.out.println("--- Library Items ---");
        for (LibraryItems item : items) {
            System.out.println(item);
        }
    }

    public void listMembers() {
        System.out.println("--- Registered Members ---");
        for (Member member : members) {
            System.out.println(member);
        }
    }

    public void printAllLateFees(int daysLate) {
        System.out.println("--- Late Fees if " + daysLate + " day(s) late ---");
        for (LibraryItems item : items) {
            System.out.println(item.getTitle() + ": " + item.calculateLateFee(daysLate));
        }
    }
}

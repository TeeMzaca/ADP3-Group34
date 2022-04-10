//author Ethan Swart 220126283
package za.ac.cput.domain.entity;

import za.ac.cput.LibrarySystem.domain.entity.Item;

public class TestItem {

    public static void TestBuilder() {

        Item item = new Item.Builder("637291")
                .itemType("Book")
                .dateBorrowed("2022-04-01")
                .setLoanPeriod(20)
                .whatLanguage("English")
                .build();

        System.out.println(item.toString());
    }

    /*public static void main(String[] args) {
        TestBuilder();
    }*/
}

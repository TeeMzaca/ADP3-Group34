//Ethan Christopher Swart 220126283
package za.ac.cput.LibrarySystem.factory;

import za.ac.cput.LibrarySystem.domain.entity.Item;
import za.ac.cput.LibrarySystem.util.Helper;

public class ItemFactory {

    //Factory method
    public static Item createItem(String barcode, String type, String borrowed, String returnDate, int loanPeriod, String language) {

        if(Helper.isNullorEmpty(barcode) || Helper.isNullorEmpty(type) || Helper.isNullorEmpty(language)){
            return null;
        }

        return new Item.Builder(barcode)
                .itemType(type)
                .dateBorrowed(borrowed)
                .setLoanPeriod(loanPeriod)
                .whatLanguage(language)
                .build();
    }
}

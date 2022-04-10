//author Ethan Swart 220126283
package za.ac.cput.LibrarySystem.domain.entity;

/*
    Item.java
    Student: Ethan Swart (220126283)
 */

public class Item {

    //Attributes for Item class
    private String barcode;
    private String type;
    private String borrowed;
    private String returnDate;
    private int loanPeriod;
    private String language;

    public static class Builder {

        //Attributes for Builder Class
        private String barcode;
        private String type;
        private String borrowed;
        private String returnDate;
        private int loanPeriod;
        private String language;

        //Builder Class Constructor
        public Builder(String barcode) {
            this.barcode = barcode;
        }

        //Builder Class Returns
        public Builder scanBarcode(String barcode) {
            this.barcode = barcode;
            return this;
        }

        public Builder itemType(String type) {
            this.type = type;
            return this;
        }

        public Builder dateBorrowed(String borrowed) {
            this.borrowed = borrowed;
            return this;
        }

        public Builder dateReturned(String returnDate) {
            this.returnDate = returnDate;
            return this;
        }

        public Builder setLoanPeriod(int loanPeriod) {
            this.loanPeriod = loanPeriod;
            return this;
        }

        public Builder whatLanguage(String language) {
            this.language = language;
            return this;
        }

        //The build method that returns an item object.
        public Item build() {
            Item item = new Item();
            item.barcode = this.barcode;
            item.type = this.type;
            item.borrowed = this.borrowed;
            item.returnDate = this.returnDate;
            item.loanPeriod = this.loanPeriod;
            item.language = this.language;

            return item;
        }

    }

    //Private Item constructor, so that the object has to be built to be used.
    private Item() {

    }

    //Getters
    public String getBarcode() {
        return barcode;
    }

    public String getType() {
        return type;
    }

    public String getBorrowed() {
        return borrowed;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public int getLoanPeriod() {
        return loanPeriod;
    }

    public String getLanguage() {
        return language;
    }

    //Setters
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setBorrowed(String borrowed) {
        this.borrowed = borrowed;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public void setLoanPeriod(int loanPeriod) {
        this.loanPeriod = loanPeriod;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    //toString
    @Override
    public String toString() {
        return "Item{" +
                "barcode='" + barcode + '\'' +
                ", type='" + type + '\'' +
                ", borrowed='" + borrowed + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", loanPeriod=" + loanPeriod +
                ", language='" + language + '\'' +
                '}';
    }
}

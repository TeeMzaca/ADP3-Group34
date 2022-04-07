package za.ac.cput.LibrarySystem.domain.entity;

import java.util.Arrays;
import java.util.Date;

public class Account {

    //Attributes for Account Class
    private int id;
    private String firstName;
    private String lastName;
    private String dob;
    private String homeAddress;
    private String dateOpened;
    private String status;

    public static class Builder {

        //Attributes for the Builder Class
        private int id;
        private String firstName;
        private String lastName;
        private String dob;
        private String homeAddress;
        private String dateOpened;
        private String status;

        //Builder Class Constructor
        public Builder(int id) {
            this.id = id;
        }

        //Builder Class returns
        public Builder theirFirstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder theirLastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder theirDOB(String dob){
            this.dob = dob;
            return this;
        }

        public Builder theirHomeAddress(String homeAddress){
            this.homeAddress = homeAddress;
            return this;
        }

        public Builder accountDateOpened(String dateOpened) {
            this.dateOpened = dateOpened;
            return this;
        }

        public Builder accountStatus(String status) {
            this.status = status;
            return this;
        }

        //The build method that returns an account object.
        public Account build() {
            Account account = new Account();
            account.id = this.id;
            account.firstName = this.firstName;
            account.lastName = this.lastName;
            account.dob = this.dob;
            account.homeAddress = this.homeAddress;
            account.dateOpened = this.dateOpened;
            account.status = this.status;

            return account;
        }
    }

    //Private Constructor with no fields, so that only the Builder Class can be used to construct the Account Object
    private Account() {

    }

    //Getters
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDob() {
        return dob;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public String getDateOpened() {
        return dateOpened;
    }

    public String getStatus() {
        return status;
    }

    //Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public void setDateOpened(String dateOpened) {
        this.dateOpened = dateOpened;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dob='" + dob + '\'' +
                ", homeAddress='" + homeAddress + '\'' +
                ", dateOpened='" + dateOpened + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
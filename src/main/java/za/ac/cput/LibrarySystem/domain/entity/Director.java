//File Descriptor    : Director.java
//Program Descriptor : This is a director domain
//Author             : Tumelo Mzaca (206006330)
//Date Created       : 07-04-2022


package za.ac.cput.LibrarySystem.domain.entity;

public class Director {

    //Attributes
    private int id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String bio;

    //Constructor

    //Getters and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    @Override
    public String toString() {
        return "Director{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", bio='" + bio + '\'' +
                '}';
    }

    public static class Builder{

        //Attributes under the builder
        private int id;
        private String firstName;
        private String lastName;
        private String birthDate;
        private String bio;

        //Setters
        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setBirthDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setBio(String bio) {
            this.bio = bio;
            return this;
        }
    }
}

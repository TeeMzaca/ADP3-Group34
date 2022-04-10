//File Descriptor    : Director.java
//Program Descriptor : This is a director domain
//Author             : Tumelo Mzaca (206006330)
//Date Created       : 07-04-2022


package za.ac.cput.LibrarySystem.domain.entity;

public class Director {

    //Attributes (push)
    private String id;
    private String firstName;
    private String lastName;
    private String birthDate;
    private String bio;

    //Constructor
    private Director(Builder builder){
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
    }
    //Getters and Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
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
        private String id;
        private String firstName;
        private String lastName;
        private String birthDate;
        private String bio;

        //Setters
        public Builder setId(String id) {
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

        public Builder copy(Director director){
            this.id = director.id;
            this.firstName = director.firstName;
            this.lastName = director.lastName;
            return this;
        }

        public Director build(){
            return new Director(this); //We need to create this constructor
        }
    }
}

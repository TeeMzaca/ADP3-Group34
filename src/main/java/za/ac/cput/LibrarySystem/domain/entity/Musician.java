package za.ac.cput.LibrarySystem.domain.entity;
/*
        Musician.java
        Entity for Musician
        Author: Mogammad Faeedh Daniels (219174288)
        Date: 8 April 2022
 */
public class Musician {
    private int id;
    private String name;
    private String birthDate;
    private String bio;

    public static class Builder {
        private int id;
        private String name;
        private String birthDate;
        private String bio;

        //Builder Class Constructor
        public Builder(int id) {
            this.id = id;
        }

        public Musician.Builder Name(String name){
            this.name = name;
            return this;
        }

        public Musician.Builder BirthDate(String birthDate){
            this.birthDate = birthDate;
            return this;
        }

        public Musician.Builder Bio(String bio){
            this.bio = bio;
            return this;
        }

        //The build method that returns a musician object.
        public Musician build() {
            Musician musician  = new Musician();
            musician.id = this.id;
            musician.name = this.name;
            musician.birthDate = this.birthDate;
            musician.bio = this.bio;

            return musician;
        }
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        return "Musician " +
                " id= " + id +
                ", name= '" + name + '\'' +
                ", birthdate= " + birthDate +
                ", bio= '" + bio + '\'' +
                '}';
    }
}
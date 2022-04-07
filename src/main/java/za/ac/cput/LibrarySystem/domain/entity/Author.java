package za.ac.cput.LibrarySystem.domain.entity;
/*
        Entity for Author
        Student: Lana Africa (216166640)
        Date: 7 April 2022
 */
public class Author {
    private Integer id;
    private String name;
    private String birthDate;
    private String bio;

    //private constructor
    private Author(Builder builder){
        this.id = builder.ID;
        this.name = builder.name;
        this.birthDate = builder.birthDate;
        this.bio = builder.bio;
    }

    // Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "Author{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", date=" + birthDate +
                ", bio='" + bio + '\'' +
                '}';
    }

    public static class Builder {
        private Integer ID;
        private String name;
        private String birthDate;
        private String bio;

        public Builder setID(Integer ID) {
            this.ID = ID;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setDate(String birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Builder setBio(String bio) {
            this.bio = bio;
            return this;
        }

        public Builder copy(Author author){
            this.ID = author.id;
            this.name = author.name;
            this.birthDate = author.birthDate;
            this.bio = author.bio;
            return this;
        }

        public Author build(){
            return  new Author(this);
        }

    }
}

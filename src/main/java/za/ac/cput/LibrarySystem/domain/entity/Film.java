//File Descriptor    : Film.java
//Program Descriptor : This is a film domain
//Author             : Tumelo Mzaca (206006330)
//Date Created       : 07-04-2022


package za.ac.cput.LibrarySystem.domain.entity;

public class Film {

    //Attributes (push)
    private String id;
    private String title;
    private String releaseDate;
    private int timeLength;
    private String description;
    private String studioCompany;

    //Constructor
    private Film(Film.Builder builder){
        this.id = builder.id;
        this.title = builder.title;
        this.releaseDate = builder.releaseDate;
    }
    //My Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getTimeLength() {
        return timeLength;
    }

    public void setTimeLength(int timeLength) {
        this.timeLength = timeLength;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStudioCompany() {
        return studioCompany;
    }

    public void setStudioCompany(String studioCompany) {
        this.studioCompany = studioCompany;
    }

    @Override
    public String toString() {
        return "Film{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                ", timeLength=" + timeLength +
                ", description='" + description + '\'' +
                ", studioCompany='" + studioCompany + '\'' +
                '}';
    }

    public static class Builder{

        //Attributes under the builder
        private String id;
        private String title;
        private String releaseDate;
        private int timeLength;
        private String description;
        private String studioCompany;

        //Setting everything
        public Builder setId(String id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setReleaseDate(String releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder setTimeLength(int timeLength) {
            this.timeLength = timeLength;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setStudioCompany(String studioCompany) {
            this.studioCompany = studioCompany;
            return this;
        }

        public Film.Builder copy(Film film){
            this.id = film.id;
            this.title = film.title;
            this.releaseDate = film.releaseDate;
            return this;
        }

        public Film build(){
            return new Film(this); //We need to create this constructor
        }
    }
}

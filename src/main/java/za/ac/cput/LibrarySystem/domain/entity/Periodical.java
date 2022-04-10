package za.ac.cput.LibrarySystem.domain.entity;

import java.util.Date;


public class Periodical {

    private int id;
    private String title;
    private Date releaseDate;
    private String description;
    private String gendre;
    private int numberOfPages;

    private Periodical(Builder builder){
        this.id = builder.id;
        this.title = builder.title;
        this.releaseDate = builder.releaseDate;
        this.description = builder.description;
        this.gendre = builder.gendre;
        this.numberOfPages = builder.numberOfPages;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGendre() {
        return gendre;
    }

    public void setGendre(String gendre) {
        this.gendre = gendre;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Periodical{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", releaseDate=" + releaseDate +
                ", description='" + description + '\'' +
                ", gendre='" + gendre + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    public static class Builder {
        private int id;
        private String title;
        private Date releaseDate;
        private String description;
        private String gendre;
        private int numberOfPages;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setReleaseDate(Date releaseDate) {
            this.releaseDate = releaseDate;
            return this;
        }

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setGendre(String gendre) {
            this.gendre = gendre;
            return this;
        }

        public Builder setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
            return this;
        }

        public Builder copy(Periodical periodical) {
            this.id = periodical.id;
            this.title = periodical.title;
            this.releaseDate = periodical.releaseDate;
            this.description = periodical.description;
            this.gendre = periodical.gendre;
            this.numberOfPages = periodical.numberOfPages;
            return this;
        }

        public Periodical build(){
            return new Periodical(this);
        }


    }

}

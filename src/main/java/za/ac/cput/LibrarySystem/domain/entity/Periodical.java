package za.ac.cput.LibrarySystem.domain.entity;
/*

        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
public class Periodical {

    private int  id;
    private String title;
    private String releaseDate;
    private String description;
    private String genre;
    private int numberOfPages;

    private Periodical(Periodical.Builder builder){
        this.id = builder.id;
        this.title = builder.title;
        this.releaseDate = builder.releaseDate;
        this.description = builder.description;
        this.genre = builder.genre;
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

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
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
                ", genre='" + genre + '\'' +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    public static class Builder {
        private int id;
        private String title;
        private String releaseDate;
        private String description;
        private String genre;
        private int numberOfPages;

        public Builder setId(int id) {
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

        public Builder setDescription(String description) {
            this.description = description;
            return this;
        }

        public Builder setGendre(String gendre) {
            this.genre = genre;
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
            this.genre = periodical.genre;
            this.numberOfPages = periodical.numberOfPages;
            return this;
        }


        public Periodical build(){
            return new Periodical(this);
        }


    }

}

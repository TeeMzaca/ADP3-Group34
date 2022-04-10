package za.ac.cput.LibrarySystem.domain.entity;
/*
        MusicAlbum.java
        Entity for Music Album
        Author: Mogammad Faeedh Daniels ( 219174288 )
        Date: 8 April 2022
 */
public class MusicAlbum {
    private int id;
    private String title;
    private String publisher;
    private String publicationDate;
    private Float value;
    private int timeLength;

    public static class Builder {
        private int id;
        private String title;
        private String publisher;
        private String publicationDate;
        private Float value;
        private int timeLength;

        //Builder Class Constructor
        public Builder(int id) {
            this.id = id;
        }

        public MusicAlbum.Builder Id(int id) {
            this.id = id;
            return this;
        }

        public MusicAlbum.Builder Title(String title) {
            this.title = title;
            return this;
        }

        public MusicAlbum.Builder Publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public MusicAlbum.Builder publicationDate(String publicationDate) {
            this.publicationDate = publicationDate;
            return this;
        }

        public MusicAlbum.Builder Value(Float value) {
            this.value = value;
            return this;
        }

        public MusicAlbum.Builder timeLength(int timeLength) {
            this.timeLength = timeLength;
            return this;
        }

        //The build method that returns an album object.
        public MusicAlbum build() {
            MusicAlbum album  = new MusicAlbum();
            album.id = this.id;
            album.title = this.title;
            album.publisher = this.publisher;
            album.publicationDate = this.publicationDate;
            album.value = this.value;
            album.timeLength = this.timeLength;

            return album;
        }
    }

    // Getters and Setters
    public String getIdString() {
        return Integer.toString(id);
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

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(String publicationDate) {
        this.publicationDate = publicationDate;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public int getTime() {
        return timeLength;
    }

    public void setTimeLength(int timeLength) {
        this.timeLength = timeLength;
    }

    @Override
    public String toString() {
        return "MusicAlbum " +
                " id= " + id + '\'' +
                ", title= '" + title + '\'' +
                ", publisher= '" + publisher + '\'' +
                ", publicationDate= " + publicationDate +
                ", value= " + value +
                ", timeLength= " + timeLength;
    }
}


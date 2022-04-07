package za.ac.cput.LibrarySystem.domain.entity;
/*
        Builder Entity: Book
        Student: Lana Africa (216166640)
        Date: 7 April 2022
 */
public class Book {
    private String isbn;
    private String title;
    private String publisher;
    private String publicationDate;
    private Float value;
    private Integer numberOfPages;

    //private constructor
    private Book(Builder builder){
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.publisher = builder.publisher;
        this.publicationDate = builder.publicationDate;
        this.value = builder.value;
        this.numberOfPages = builder.numberOfPages;
    }

    // Getters and Setters

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
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

    public Integer getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(Integer numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationDate=" + publicationDate +
                ", value=" + value +
                ", numberOfPages=" + numberOfPages +
                '}';
    }

    public static class Builder{
        private String isbn;
        private String title;
        private String publisher;
        private String publicationDate;
        private Float value;
        private  Integer numberOfPages;

        public Builder setIsbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder setTitle(String title) {
            this.title = title;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Builder setPublicationDate(String publicationDate) {
            this.publicationDate = publicationDate;
            return this;
        }

        public Builder setValue(Float value) {
            this.value = value;
            return this;
        }

        public Builder setNumberOfPages(Integer numberOfPages) {
            this.numberOfPages = numberOfPages;
            return this;
        }

        public Builder copy(Book book){
            this.isbn = book.isbn;
            this.title = book.title;
            this.publisher = book.publisher;
            this.publicationDate = book.publicationDate;
            this.value = book.value;
            this.numberOfPages = book.numberOfPages;
            return this;
        }
        public Book build(){
            return  new Book(this);
        }
    }
}


package za.ac.cput.LibrarySystem.domain.entity;

import java.util.Date;

public class Publisher {

    private int id;
    private String companyName;
    private String bio;
    private Date startDate;

    private Publisher(Publisher.Builder builder){
        this.id = builder.id;
        this.companyName = builder.companyName;
        this.bio = builder.bio;
        this.startDate = builder.startDate;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", bio=" + bio +
                ", startDate=" + startDate +
                '}';
    }

    public static class Builder{
        private int id;
        private String companyName;
        private String bio;
        private Date startDate;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder setBio(String bio) {
            this.bio = bio;
            return this;
        }

        public Builder setStartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }
        public Publisher.Builder copy(Publisher publisher){
            this.id = publisher.id;
            this.companyName = publisher.companyName;
            this.bio = publisher.bio;
            this.startDate = publisher.startDate;
            return this;
        }
        public Publisher build(){
            return new Publisher(this);
        }
    }
}

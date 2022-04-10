package za.ac.cput.LibrarySystem.domain.entity;
/*

        Student: Darryll Merkeur (220253595)
        Date: 8 April 2022
*/
public class Publisher {

    private int id;
    private String companyName;
    private String bio;
    private String startDate;

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

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
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
        private String startDate;

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

        public Builder setStartDate(String startDate) {
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

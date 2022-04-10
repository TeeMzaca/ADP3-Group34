//Author Adrian Bennett 214075982
package za.ac.cput.LibrarySystem.domain.entity;

public class Library{

    private int id;
    private String name;
    private String address;

    private Library (Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.address = builder.address;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Library{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class Builder{

        private int id;
        private String name;
        private String address;

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }

        public Library build(){
            return new Library (this);
        }

    }

}
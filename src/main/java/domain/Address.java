package domain;

import java.util.Objects;

class Address {

    private String street;
    private int building;
//    local can be non integer value ie. "44" or "44a" can be possible
    private String local;
    private String city;
//    value with dash between two numbers is allowed
    private String post;

    public Address() {
    }

    public Address(String street, int building, String local, String city, String post) {
        this.street = street;
        this.building = building;
        this.local = local;
        this.city = city;
        this.post = post;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getBuilding() {
        return building;
    }

    public void setBuilding(int building) {
        this.building = building;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return building == address.building &&
                Objects.equals(street, address.street) &&
                Objects.equals(local, address.local) &&
                Objects.equals(city, address.city) &&
                Objects.equals(post, address.post);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, building, local, city, post);
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", building=" + building +
                ", local='" + local + '\'' +
                ", city='" + city + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}

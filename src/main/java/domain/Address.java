package domain;

import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Table;

@Embeddable
@NoArgsConstructor
@Table(name = "address")

class Address {

    @Column(name = "address_street", nullable = false, length = 30)
    private String street;

    @Column(name = "address_building", nullable = false, length = 5)
    private int building;
//    local can be non integer value ie. "44" or "44a" can be possible
    @Column(name = "address_local", nullable = false, length = 5)
    private String local;

    @Column(name = "address_city", nullable = false, length = 30)
    private String city;
//    value with dash between two numbers is allowed
    @Column(name = "address_post", nullable = false, length = 10)
    private String post;

    /*public Address() {
    }*/

    /*public Address(String street, int building, String local, String city, String post) {
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
    }*/
}

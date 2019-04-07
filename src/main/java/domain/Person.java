package domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Data
@NoArgsConstructor
@Entity
@Table(name = "person")

public class Person extends Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id", nullable = false, length = 10)
    private int id;

    @Column(name = "person_name", nullable = false, length = 20)
    private String name;

    @Column(name = "person_secondName", nullable = false, length = 20)
    private String secondName;

    @Column(name = "person_birthYear", nullable = false, length = 4)
    private int birthYear;

    @Column(name = "person_height", nullable = false, length = 4)
    private int height;

    @Column(name = "person_weight", nullable = false, length = 10)
    private double weight;

    @Column(name = "person_language", nullable = true)
    private Language language;

    @Embedded
    private Address address;


//    adnotacja @NoArgsConstructor wymusila zakomentowanie bezparametrowego konstruktora
    /*public Person() {
    }*/

    public Person(String name, String secondName, int birthYear, int height,
                  double weight, Language language, Address address) {
        this.name = name;
        this.secondName = secondName;
        this.birthYear = birthYear;
        this.height = height;
        this.weight = weight;
        this.language = language;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Language getLanguage() {
        return language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return birthYear == person.birthYear &&
                height == person.height &&
                Double.compare(person.weight, weight) == 0 &&
                Objects.equals(name, person.name) &&
                Objects.equals(secondName, person.secondName) &&
                language == person.language &&
                Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName, birthYear, height, weight, language, address);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", birthYear=" + birthYear +
                ", height=" + height +
                ", weight=" + weight +
                ", language=" + language +
                ", address=" + address +
                '}';
    }

    public void totalWeight(Person person) {

    }

    public void totalHeight(Person person) {

    }

    public void totalAge(Person person) {

    }

    public void addPerson(Person person) {

    }

    public void removePerson(Person person) {

    }

    public void updatePerson(Person person) {

    }
}

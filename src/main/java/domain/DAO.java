package domain;

public interface DAO {

    public void totalWeight(Person person);
    public void totalHeight(Person person);
    public void totalAge(Person person);

    public void addPerson(Person person);
    public void removePerson(Person person);
    public void updatePerson(Person person);

}

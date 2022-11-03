package se.lexicon;

public class Person {

    private int personalId;
    private String firstName;
    private String lastName;

    public void setPersonalId(int personalId) {
        this.personalId = personalId;
    }

    public int getPersonalId() {
        return personalId;
    }

    public void setFirstName(String FirstName) {
        this.firstName = FirstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public Person(int personalId, String firstName, String lastName) {
        this.personalId = personalId;
        this.firstName = firstName;
        this.lastName = lastName;


    }
}
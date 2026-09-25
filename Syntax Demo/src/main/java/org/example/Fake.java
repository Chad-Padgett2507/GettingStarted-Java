package org.example;

public class Fake {
    public int age;
    public String firstName;
    public String lastName;

    public Fake(int age, String firstName, String lastName) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
        return age; //defaults to age variable for class; can replace with this.age
    }
}

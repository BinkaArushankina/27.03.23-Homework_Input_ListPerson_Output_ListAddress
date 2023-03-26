package Homework;
public class Person {
    String name;
    String address;
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return  name + " " + address;
    }
}

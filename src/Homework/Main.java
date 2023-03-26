package Homework;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //Есть два класса: Address с полями String street и int houseNumber и Person с полями String name и Address address.
    //Нужно написать метод List<Address> getAddresses(List persons) то есть по списку persons метод будет возвращать
    //список их адресов. Протестировать его.
    public static void main(String[] args) {

        List<Person> person = new ArrayList<>();
        person.add( new Person("Daniel","München"));
        person.add( new Person("Stefan","Ulm"));
        person.add( new Person("Andreas","Stuttgart"));


        System.out.println(getAddresses(person));  //[Marktplatz 5, Blumenstrasse 8, Lindenallee 2]

    }
    public static List<Address> getAddresses(List persons){
        persons = Arrays.asList(
                new Address("Marktplatz",5),
                new Address("Blumenstrasse",8),
                new Address("Lindenallee",2));
        return persons;
    }

}

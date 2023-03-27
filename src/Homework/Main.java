package Homework;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        //Есть два класса: Address с полями String street и int houseNumber и Person с полями String name и Address address.
        //Нужно написать метод List<Address> getAddresses(List persons) то есть по списку persons метод будет возвращать
        //список их адресов. Протестировать его.

    }
    List<Address> getAddresses(List <Person> persons) {
        List<Address> addresses = new ArrayList<>();

        for (Person p : persons) {
            Address personAddress = p.getAddress();
            addresses.add(personAddress);
        }
         return addresses;
    }
}

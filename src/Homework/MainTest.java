package Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    Main main;

    @BeforeEach
    public void init(){
         main = new Main();
    }
    @Test
    public void input_person_return_address(){
        Address address = new Address("Street1",1);
        Person person= new Person("Person1",address);
        List<Person > actual=Arrays.asList(person);
        List<Address> expected= Arrays.asList(address);


        assertEquals(expected, main.getAddresses(actual));
    }

    @Test
    public void input_person_return_address_two(){
        Address address1 = new Address("Street1",1);
        Address address2 = new Address("Street2",2);
        Person person1= new Person("Person1",address1);
        Person person2= new Person("Person2",address2);
        List<Person > actual=Arrays.asList(person1,person2);
        List<Address> expected= Arrays.asList(address1,address2);


        assertEquals(expected, main.getAddresses(actual));
    }


}

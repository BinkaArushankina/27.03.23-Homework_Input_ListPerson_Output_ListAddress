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

        List<Person > actual=Arrays.asList( new Person("Daniel","München"),
                new Person("Stefan","Ulm"),
                new Person("Andreas","Stuttgart"));
        List<Address> expected= Arrays.asList( new Address("Marktplatz",5),
                new Address("Blumenstrasse",8),
                new Address("Lindenallee",2));


        assertEquals(expected, main.getAddresses(actual));
    }

    @Test
    public void input_person_return_address_test_size(){

        List<String > actual=Arrays.asList();
        List<String> expected= Arrays.asList("Marktplatz 5", "Blumenstrasse 8", "Lindenallee 2");


        assertEquals(expected,main.getAddresses(actual));
    }
//org.opentest4j.AssertionFailedError: expected: java.util.Arrays$ArrayList@3d36e4cd<[Marktplatz 5, Blumenstrasse 8, Lindenallee 2]> but was: java.util.Arrays$ArrayList@6a472554<[Marktplatz 5, Blumenstrasse 8, Lindenallee 2]>

}

package list_tasks_tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTasksTest {

    private ListTasks listTasks;

    @BeforeEach
    public void init(){
        listTasks=new ListTasks();
    }

    @Test
    public void removeNamesLength4_test_fourIn_twoOut(){
       List<String > actual= Arrays.asList("John", "Pablo", "Ann", "Jack") ;
       List<String > expected= Arrays.asList("Pablo", "Ann") ;

       assertEquals(expected,listTasks.removeNamesLength4(actual));
    }
    @Test
    public void removeNames_test_empty(){
        assertEquals(Arrays.asList(),listTasks.removeNamesLength4(Arrays.asList()));
    }
    @Test
    public void removeNames_test_noNamesLength4(){
        List<String > actual= Arrays.asList("Johnn", "Pablo", "Ann", "Jackk") ;
        List<String > expected= Arrays.asList("Johnn", "Pablo", "Ann", "Jackk") ;

        assertEquals(expected,listTasks.removeNamesLength4(actual));
    }
    @Test
    public void removeNames_test_allNamesLength4(){
        List<String > actual= Arrays.asList("John", "Pabl", "Anna", "Jack") ;
        List<String > expected= Arrays.asList() ;

        assertEquals(expected,listTasks.removeNamesLength4(actual));
    }
    @Test
    public void removeNames_test_allNamesLength4_thenReturnEmptyList() {
        List<String> actual = Arrays.asList("John", "Pabl", "Anna", "Jack");
        List<String> expected = Arrays.asList();

        assertEquals(expected, listTasks.removeNamesLength4(actual));
    }







        //compareYesNo
    @Test
    public void if_two_digits_are_equal_return_yes(){
        List<Integer> ints1 = Arrays.asList(2,4,6,8);
        List<Integer> ints2 = Arrays.asList(5,4,6,9);
        List<String> expected = Arrays.asList("No", "Yes", "Yes", "No");

        assertEquals(expected,listTasks.compareYesNo(ints1,ints2));
    }
    @Test
    public void if_two_digits_are_equal_return_yes_If_not_equal_return_no(){
        List<Integer> ints1 = Arrays.asList(2,3,7,8);
        List<Integer> ints2 = Arrays.asList(5,4,6,9);
        List<String> expected = Arrays.asList("No", "No", "No", "No");

        assertEquals(expected,listTasks.compareYesNo(ints1,ints2));
    }
    @Test
    public void if_two_digits_are_equal_or_not_return_yes_or_no(){
        List<Integer> ints1 = Arrays.asList(2,4,6,8);
        List<Integer> ints2 = Arrays.asList(2,4,6,8);
        List<String> expected = Arrays.asList("Yes", "Yes", "Yes", "Yes");

        assertEquals(expected,listTasks.compareYesNo(ints1,ints2));
    }
    @Test
    public void test_compare_yes_no_return_EmptyList(){
        List<Integer> ints1 = Arrays.asList();
        List<Integer> ints2 = Arrays.asList();
        List<String> expected = Arrays.asList();

        assertEquals(expected,listTasks.compareYesNo(ints1,ints2));
    }





            //reversed
    @Test
    public void test_reversed(){
        List<Integer> actual= Arrays.asList(5,4,3,2,1);
        List<Integer> expected= Arrays.asList(1,2,3,4,5);

        assertEquals(expected,listTasks.reversed(actual));
    }
    @Test
    public void test_reversed_two(){
        List<Integer> actual= Arrays.asList(0,0,0);
        List<Integer> expected= Arrays.asList(0,0,0);

        assertEquals(expected,listTasks.reversed(actual));
    }
    @Test
    public void test_reversed_return_EmptyList(){
        List<Integer> actual= Arrays.asList();
        List<Integer> expected= Arrays.asList();

        assertEquals(expected,listTasks.reversed(actual));
    }

}
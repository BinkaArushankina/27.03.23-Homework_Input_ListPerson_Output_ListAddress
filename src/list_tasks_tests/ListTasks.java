package list_tasks_tests;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTasks {

    //Estj spisok s imenami. napisatj metod woswraschajuschij List bes imen w dlinu 4 simwola.
    //John, Pablo, Ann, Jack -> Pablo, Ann.

    public List<String> removeNamesLength4(List<String> names){
        List<String> res = new ArrayList<>();
        for (String name: names){
            if(name.length()!=4){
                res.add(name);
            }
        }
        return res;
    }
    /*
    Есть два списка одинаковой длинны с целыми числами. Написать метод, который возвращает список с элементами Yes или
    No, где значение на i-том месте зависит от того , равны ли элементы двух списков под номер i
    [2,  4,  6,  8]
    [5,  4,  6,  9]
    [no,yes,yes,no]
     */

    public List<String> compareYesNo(List<Integer> ints1, List<Integer> ints2){
        List<String> res = new ArrayList<>();
        for(int i =0; i<ints1.size();i++){
            if(ints1.get(i) .equals ( ints2.get(i))){
                res.add("Yes");
            }else{
                res.add("No");
            }
        }
        return res;
    }

    //Napisatj metod, kotorij rewersiruet List, t.e. Woswraschaet spisok elementow w obratnom poradke
    //[1,2,3,4,5] -> [5,4,3,2,1]

    public List<Integer> reversed(List<Integer> ints){
        Collections.reverse(ints);
        return ints;
    }


}

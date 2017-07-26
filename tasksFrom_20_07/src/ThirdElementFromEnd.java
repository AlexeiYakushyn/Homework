/**
 * Created by alexei.yakushyn on 26.07.2017.
 */

// Реализовать метод для поиска третьего элемента с конца.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ThirdElementFromEnd {

    Iterator<Integer> iterator;

    public ThirdElementFromEnd(Iterator<Integer> iterator) {
        this.iterator = iterator;
    }

    public int getThirdElementFromTheEnd(ArrayList<Integer> list) {
        // your code here
       int count = 0;
       int n = 0;

       for (int i = 0; i < list.size(); i++){
           count++;
       }
        System.out.println(count);

        for (int i = 0; i < list.size(); i++){
           if (i == count - 2){
               n = i;
           }
        }

            return n;
    }
}

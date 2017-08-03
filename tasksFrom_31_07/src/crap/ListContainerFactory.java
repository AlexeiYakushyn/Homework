package crap;

import java.util.ArrayList;

/**
 * Created by alexei.yakushyn on 02.08.2017.
 */
public class ListContainerFactory extends ListContainer {

    public ArrayList<Integer> setCreateSize(int size) {

        return new ArrayList<Integer>(size);
    }

    public static void main(String[] args) {
        ListContainerFactory factory = new ListContainerFactory();
        ArrayList<Integer> mass = factory.setCreateSize(5);
        ListContainer listContainer = new ListContainer();

        for (int i = 0; i < mass.size(); i++) {
            listContainer.add(i);
        }

            for (int i = 0; i < listContainer.size; i++) {
                System.out.print(listContainer);
            }
    }
}

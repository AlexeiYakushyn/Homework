package crap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexei.yakushyn on 02.08.2017.
 */
public  class ListContainer implements Container {
    int size;
    private int element;

    List<Integer> list = new ArrayList<>();

    @Override
    public void add(int element) {
        this.element = element;
        if (list.size() < size) {
            list.add(element);
        } else {
            list.remove(0);
            list.add(element);
        }
    }

    @Override
    public List<Integer> get() {
        return list;
    }
}

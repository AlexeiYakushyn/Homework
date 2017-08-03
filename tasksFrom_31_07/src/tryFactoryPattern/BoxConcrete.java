package tryFactoryPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexei.yakushyn on 03.08.2017.
 */
public class BoxConcrete implements BoxFactory {

    private int size = 5;

    ArrayList list = new ArrayList(size);

    public BoxConcrete(int i) {
        this.size = i;
    }

    public BoxConcrete() {
    }

    @Override
    public int size(int x) {
        return this.size = x;
    }

    @Override
    public void add(int num) {
        if (list.size() < size) {
            list.add(num);
        } else {
            list.remove(0);
            list.add(num);
        }
    }

    @Override
    public List get() throws BoxException {

        if (size <= 0) {

            throw new BoxException("Capacity should be more than zero", size);

        } else return list;
    }
}

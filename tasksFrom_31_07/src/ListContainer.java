import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexei.yakushyn on 03.08.2017.
 */
public class ListContainer {
    Create sz = new Create();
    private int size = sz.size;

    public ListContainer(int size) {
        this.size = size;
    }

    ArrayList<Integer> list = new ArrayList<>(size);

    public ListContainer() {

    }

    public void add(int num) throws ListContainerException {

        if (size <= 0) {
            throw new  ListContainerException("Capacity should be more than zero", size);
        }

        if (list.size() < size) {
            list.add(num);
        }
        else {
            list.remove(0);
            list.add(num);
        }
    }

    public ArrayList get() {
        return list;
    }
}

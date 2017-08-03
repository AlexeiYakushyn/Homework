import java.util.ArrayList;

/**
 * Created by alexei.yakushyn on 03.08.2017.
 */
public class MainContainer {

    public static void main(String[] args) throws ListContainerException {

        ListContainer listContainer = new ListContainer(7);

        listContainer.add(6);
        listContainer.add(7);
        listContainer.add(8);
        listContainer.add(8);
        listContainer.add(8);
        listContainer.add(8);
        listContainer.add(8);

        ListContainer listContainer1 = new ListContainer();
        listContainer1.add(5);
        listContainer1.add(4);
        listContainer1.add(3);
        listContainer1.add(2);
        listContainer1.add(1);
        listContainer1.add(8);
        listContainer1.add(9);

        System.out.println(listContainer.get());
        System.out.println(listContainer1.get());

        ListContainer listException = new ListContainer(0);
        listException.add(3);


    }
}

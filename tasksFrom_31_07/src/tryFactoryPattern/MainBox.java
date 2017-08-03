package tryFactoryPattern;

/**
 * Created by alexei.yakushyn on 03.08.2017.
 */
public class MainBox {

    public static void main(String[] args) throws BoxException {

        BoxConcrete list = new BoxConcrete();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        System.out.println(list.get());

        BoxConcrete list1 = new BoxConcrete(3);

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        System.out.println(list1.get());

        BoxConcrete list2 = new BoxConcrete(0);
        System.out.println(list2.get());
    }
}

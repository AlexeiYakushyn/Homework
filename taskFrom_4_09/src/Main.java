import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexei.yakushyn on 07.09.2017.
 */
public class Main {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<String>();
        strList.add("Blaaaaaaa");
        strList.add("Blaaaaa");
        strList.add("Blaaaa");
        strList.add("Blaaa");
        strList.add("Blaa");
        strList.add("Bla");
        strList.add("Blaaaaaaafff");
        strList.add("Blaaaaaaahhhhhh");
        strList.add("ggg");

        StringSort strSort = new StringSort();
        strSort.stringSort(strList);
        System.out.println(strList);
    }
}

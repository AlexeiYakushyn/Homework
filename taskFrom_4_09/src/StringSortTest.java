import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by alexei.yakushyn on 07.09.2017.
 */
public class StringSortTest {

    StringSort stringSort = new StringSort();
    List<String> strings = new ArrayList<String>();

    @Before
    public void createInstanse() {

        strings.add("Blaaaaaaa");
        strings.add("Blaaaaa");
        strings.add("Blaaaa");
        strings.add("Blaaa");
        strings.add("Blaa");
        strings.add("Bla");
        strings.add("Blaaaaaaafff");
        strings.add("Blaaaaaaahhhhhh");
        strings.add("ggg");
    }

    @Test
    public void stringSortPutNull() throws Exception {
        strings.add(null);
        stringSort.stringSort(strings);
    }

    @Test
    public void stringSortNull() {
        stringSort.stringSort(null);
    }

    @Test
    public void stringIsEmpty() {
        strings.add("");
        strings.add("");
        strings.add("");
        stringSort.stringSort(strings);
    }

}
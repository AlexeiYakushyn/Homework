package tryFactoryPattern;

import java.util.List;

/**
 * Created by alexei.yakushyn on 03.08.2017.
 */
public interface BoxFactory {
    int size = 0;

    int size(int x);

    void add(int n);

    List get() throws BoxException;
}


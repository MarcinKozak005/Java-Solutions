import java.util.ArrayList;
import java.util.Iterator;

public class P52_JavaIterator {
    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            if (element instanceof String)
                break;
        }
        return it;

    }
}

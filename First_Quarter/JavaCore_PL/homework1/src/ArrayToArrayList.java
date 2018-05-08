import java.util.ArrayList;

public class ArrayToArrayList {
    static <T> ArrayList<T> arrayToArrayList(final T[] array) {
        final ArrayList<T> list = new ArrayList<T>(array.length);

        for (final T s : array) {
            list.add(s);
        }
        return (list);
    }
}

package bigOne;

import java.util.*;

public class Box <T extends Fruit> {

    private Map<String, T> map = new HashMap<>();


    public void add(T entity) {
        if (entity == null) return;
        map.put(entity.name, entity);
    }

    public void add(T[] entity) {
        if (entity == null) return;
        for (final T fruit : entity) {
            if (fruit == null) continue;
            add(fruit);
        }
    }

    public T get(String name) {
        if (name == null || name.isEmpty()) return null;
        return map.get(name);
    }

    public Collection<T> getCollection() {
        return map.values();
    }

    public void remove(T entity) {
        if (entity == null) return;
        map.remove(entity.name);
    }

    public void removeById(String name) {
        if (name == null || name.isEmpty()) return;
        map.remove(name);
    }

    public Set<String> getIds() {
        return map.keySet();
    }

    public void remove() {
        map.clear();
    }

    public Integer getCount() {
        return map.keySet().size();
    }

//    public T getWeight() {
//        T t = null;
//        for (Map.Entry<String, T> entry : map.entrySet()) {
//           t += entry.getValue();
//        }
//        return t;
//    }
}

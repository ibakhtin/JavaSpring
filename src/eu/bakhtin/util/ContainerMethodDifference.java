package eu.bakhtin.util;

import java.lang.reflect.Method;
import java.util.*;

/**
 * @author ibakhtin
 */
public class ContainerMethodDifference {

    static Set<String> methodSet(Class<?> type) {
        Set<String> result = new TreeSet<>();

        for (Method m : type.getMethods())
            result.add(m.getName());

        return result;
    }

    static void interfaces(Class<?> type) {
        List<String> result = new ArrayList<>();

        for (Class<?> c : type.getInterfaces())
            result.add(c.getSimpleName());

        System.out.printf("Interfaces in %s: %s%n", type.getSimpleName(), result);
    }

    static Set<String> object = methodSet(Objects.class);

    static {
        object.add("clone");
    }

    static void difference(Class<?> superset, Class<?> subset) {
        System.out.print(superset.getSimpleName() + " extends " + subset.getSimpleName() + ", adds: ");
        Set<String> comp = Sets.difference(methodSet(superset), methodSet(subset));
        comp.removeAll(object);
        interfaces(superset);
    }

    public static void main(String[] args) {

        interfaces(AbstractList.class);

        System.out.printf("%n%n");
        System.out.println("Collection: " + methodSet(Collection.class));
        interfaces(Collection.class);
        difference(Set.class, Collection.class);
        difference(HashSet.class, Set.class);
        difference(LinkedHashSet.class, HashSet.class);
        difference(TreeSet.class, Set.class);
        difference(List.class, Collection.class);
        difference(ArrayList.class, List.class);
        difference(LinkedList.class, List.class);
        difference(Queue.class, Collection.class);
        difference(PriorityQueue.class, Queue.class);
        System.out.println("Map: " + methodSet(Map.class));
        difference(HashMap.class, Map.class);
        difference(LinkedHashMap.class, HashMap.class);
        difference(SortedMap.class, Map.class);
        difference(TreeMap.class, Map.class);
    }
}

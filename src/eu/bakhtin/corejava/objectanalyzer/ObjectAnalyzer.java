package eu.bakhtin.corejava.objectanalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/**
 * @author Igor Bakhtin
 */
public class ObjectAnalyzer {

    ArrayList<Object> visited = new ArrayList<>();

    /**
     * Converts an object to a string representation that lists all fields.
     * @param obj an object
     * @return a string with the object's class name and all field names and values
     */
    public String toString(Object obj) {
        if (obj == null) return null;

        if (visited.contains(obj)) return "...";

        visited.add(obj);

        Class cl = obj.getClass();

        if (cl == String.class) return (String) obj;

        if (cl.isArray()) {
            String r = cl.getComponentType() + "[] {";
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0) r += ",";
                Object value = Array.get(obj, i);
                if (cl.getComponentType().isPrimitive()) r += value;
                else r += toString(value);
            }
            return r += "}";
        }

        String r = cl.getName();

        do {
            r += "[";
            Field[] fields = cl.getDeclaredFields();

            AccessibleObject.setAccessible(fields, true);

            for (Field field : fields) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    if (!r.endsWith("[")) r += ",";
                    r += field.getName() + "=";
                    try {
                        Class t = field.getType();
                        Object value = field.get(obj);
                        if (t.isPrimitive()) r += value;
                        else r += toString(value);
                    }
                    catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            r += "]";
            cl = cl.getSuperclass();
        } while (cl != null);
        return r;
    }
}


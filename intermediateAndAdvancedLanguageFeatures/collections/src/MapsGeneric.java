import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class MapsGeneric {
  public static void main(String[] args) {
    Map<Integer, String> people = new HashMap<Integer, String>();

    people.put(25, "Kaique");
    people.put(27, "Bianca");
    people.put(8, "Enzo");

    /*
     * Maps are known as if they were/represent 3 collections
     */
    // Key collection
    System.out.println("Keys: " + people.keySet());
    // Collection of values
    System.out.println("Values: " + people.values());
    // Association Collection
    System.out.println("Associations: " + people.entrySet());

    /*
     * Iterable in Key collection
     * Mode 1
     * ForEach
     */
    people.keySet().forEach(age -> {
      System.out.println(people.get(age));
    });

    // Mode 2
    Set<Integer> keys = people.keySet();
    for (Integer age : keys) {
      System.out.println(people.get(age));
    }

    /*
     * Iterable in Collection of values
     * Mode 1
     */
    Collection<String> values = people.values();
    for (String name : values) {
      System.out.println(name);
    }

    // Mode 2
    people.values().forEach(name -> {
      System.out.println(name);
    });

    /*
     * Iterable in Association Collection
     * Mode 1
     */
    Set<Entry<Integer, String>> associations = people.entrySet();
    for (Entry<Integer, String> association : associations) {
      System.out.println(association.getKey() + " - " + association.getValue());
    }

    // Mode 2
    people.entrySet().forEach(association -> {
      System.out.println(association.getKey() + " - " + association.getValue());
    });
  }
}

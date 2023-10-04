import java.util.HashSet;
import java.util.Set;

public class Sets {
  public static void main(String[] args) {
    Set<String> names = new HashSet<String>(); // They do not index collections of sets, they return true or false when
                                               // inserted or not

    names.add("Kaique");
    names.add("Kaique"); // Does not add duplicate data
    names.add("Bianca");
    names.add("Enzo");

    for (String name : names) {
      System.out.println(name);
    }

  }
}

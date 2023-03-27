/* 
 * Base class;
 * Parent class;
 * Super class;
 * Generic class.
 */

/*
 * An abstract class can have:
 *      - Attributes;
 *      - Methods;
 *      - Abstract methods;
 * 
 * Abstract methods: 
 *      They are methods, which have no implementation, only a declaration, and, obligatorily, the classes that inherit from this class with abstract methods, need to implement these methods.
 */

public abstract class Person_Abstract_Classes {
    private String name;
    private int birth_year;

    public Person_Abstract_Classes(String name, int birth_year) {
        this.name = name;
        this.birth_year = birth_year;
    }

    // Implemented methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Abstract methods
    public int getBirth_year() {
        return birth_year;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    // Abstract methods
    public abstract String salutation(String salutation);
}

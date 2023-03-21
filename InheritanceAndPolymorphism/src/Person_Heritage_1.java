/* 
 * Base class;
 * Parent class;
 * Super class;
 * Generic class.
 */

public class Person_Heritage_1 {
    private String name;
    private int birth_year;

    public Person_Heritage_1(String name, int birth_year){
        this.name = name;
        this.birth_year = birth_year;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getBirth_year() {
        return birth_year;
    }
    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }
}

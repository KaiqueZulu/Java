
/*
 * Specific class;
 * Sub-class;
 * Child class.
 */

/*
 * With inheritance, the class inherits all methods and attributes of the class, avoiding all code redundancy.
 * 
 * Commented code is code avoided by inheriting from the person class
 */

public class Student_Heritage_2 extends Person_Heritage_1_Polymorphism {
    private String ra;
    // private String name;
    // private int birth_year;

    public Student_Heritage_2(String name, int birth_year, String ra) {
        // this.name = name;
        // this.birth_year = birth_year;
        super(name, birth_year);
        this.ra = ra;
    }

    // public String getName() {
    // return name;
    // }

    // public void setName(String name) {
    // this.name = name;
    // }

    // public int getBirth_year() {
    // return birth_year;
    // }

    // public void setBirth_year(int birth_year) {
    // this.birth_year = birth_year;
    // }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
}

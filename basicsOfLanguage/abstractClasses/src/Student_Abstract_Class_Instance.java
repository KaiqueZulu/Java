
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

public class Student_Abstract_Class_Instance extends Person_Abstract_Classes {
    private String ra;

    public Student_Abstract_Class_Instance(String name, int birth_year, String ra) {
        super(name, birth_year);
        this.ra = ra;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    // Implemented Abstract methods
    public String salutation(String salutation) {
        System.out.print(salutation);
        return salutation;
    }

}

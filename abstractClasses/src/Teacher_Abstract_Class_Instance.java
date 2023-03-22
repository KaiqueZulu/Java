/*
 * Specific class;
 * Sub-class;
 * Child class.
 */

public class Teacher_Abstract_Class_Instance extends Person_Abstract_Classes {
    private String registration;

    public Teacher_Abstract_Class_Instance(String registration, String name, int birth_year) {
        super(name, birth_year);
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    // Implemented Abstract methods
    public String salutation(String salutation) {
        System.out.print(salutation);
        return salutation;
    }
}

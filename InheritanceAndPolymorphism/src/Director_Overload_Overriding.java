/*
 * overloading a method is when we override a base class method in the child class 
 */

public class Director_Overload_Overriding extends Person_Heritage_1_Polymorphism {
    private String sector;

    public Director_Overload_Overriding(String name, int birth_year, String sector) {
        super(name, birth_year);
        this.sector = sector;
    }

    // Override
    public String getName() {

        return "Director: " + super.getName();
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }
}

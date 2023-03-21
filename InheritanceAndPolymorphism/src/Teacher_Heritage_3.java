public class Teacher_Heritage_3 extends Person_Heritage_1_Polymorphism {
    private String registration;

    public Teacher_Heritage_3(String registration, String name, int birth_year){
        super(name, birth_year);
        this.registration = registration;
    }

    public String getRegistration() {
        return registration;
    }
    public void setRegistration(String registration) {
        this.registration = registration;
    }
    
}

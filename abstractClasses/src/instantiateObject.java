/*
 * It is a resource that provides a block in the creation of objects, being able to only use "abstract classes" to extend other specific classes
 */

public class instantiateObject {
    public static void main(String[] args) {
        // cannot instantiate
        // Person_Abstract_Classes preson = new Person_Abstract_Classes("Fulano", 20);
        Student_Abstract_Class_Instance Kaique = new Student_Abstract_Class_Instance("Kaique", 98, "74");
        Teacher_Abstract_Class_Instance Bianca = new Teacher_Abstract_Class_Instance("1012", "Bianca", 97);

        System.out.println("Student " + Kaique.getName()+ " was born in " + Kaique.getBirth_year());
        System.out.println("Teacher " + Bianca.getName()+ " was born in " + Bianca.getBirth_year());


    }
}

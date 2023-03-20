public class ClassConstructor_Person {
    String name, email;
    int dateOfBirth;

    /*
     * A class can have more than one constructor, the empty constructor is built by
     * default when we don't create one by the JVM, when we create a constructor and
     * we don't create an empty one, the empty one is not created and we can only
     * use the created constructor
     */

    // Empty constructor
    public ClassConstructor_Person() {
    };

    // Constructor with parameters
    public ClassConstructor_Person(String name, String email, int dateOfBirth) {
        this.name = name;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

}

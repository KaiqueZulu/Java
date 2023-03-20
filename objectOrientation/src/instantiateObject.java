public class instantiateObject {
    public static void main(String[] args) throws Exception {
        ClassModel_Product product1 = new ClassModel_Product(); // Empty constructor
        ClassModel_Product product2 = new ClassModel_Product(); // Empty constructor
        ClassConstructor_Person person1 = new ClassConstructor_Person("Kaique", "kaique@test.com", 16); // Constructor with parameters
        
        //instance = product1
        product1.name = "Notebook";
        product1.price = 2.367f;
        product1.discount = 15.0f;
        
        System.out.println("------------ Product1 ------------" );
        System.out.println(product1.name);
        System.out.println("R$ " + product1.price);
        System.out.println(product1.discount + "%");
        
        
        product2.name = "Caneta Bic";
        product2.price = 2.45f;
        product2.discount = 5;
        
        System.out.println("------------ Product2 ------------" );
        System.out.println(product2.name);
        System.out.println("R$ " + product2.price);
        System.out.println(product2.discount + "%");



        System.out.println("------------ Person1 ------------" );
        System.out.println(person1.name);
        System.out.println(person1.email);
        System.out.println(person1.dateOfBirth);
    }
}

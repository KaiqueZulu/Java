public class ClassModel_Product {
    String name;            // attributes
    float price, discount;  // attributes

    void increase_price(float valueToIncrement){  // Method
        this.price = this.price + valueToIncrement;
    }

}

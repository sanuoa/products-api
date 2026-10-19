package uk.ac.westminster.products_api;


/* A PhysicalProduct IS-A Product because has same attributes as same as the product class */
/* As an example an order class would not pass this test because they dont have same attributes in their clases */
public class PhysicalProduct extends Product{
    private double weightKG;
    private String dimensions;

    public PhysicalProduct(){

    }

    public PhysicalProduct(Long id,String name,double price,double weightKG,String dimensions){
        super(id,name,price);
        this.weightKG = weightKG;
        this.dimensions = dimensions;
    }

    public double getWeightKG() {
        return weightKG;
    }

    public void setWeightKG(double weightKG) {
        this.weightKG = weightKG;
    }

    public String getDimensions() {
        return dimensions;
    }

    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
}

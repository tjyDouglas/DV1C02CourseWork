public class Payment {
    
    protected String productName;
    protected Double cost;
  
    public Product(String productName, Double cost) {
        super();
        this.productName = productName;
        this.cost = cost;
    }
  
    public String getProductName() {
        return productName;
    }
 
    public Double cost() {
        return cost;
    }
}

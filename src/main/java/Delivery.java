public class Delivery {
    
    protected String deliveryName;
    protected String DeliveryStatus;
    protected String location;
    protected String sellerName;
    protected String buyerName;
    public Delivery(String deliveryName, String DeliveryStatus, String location, String sellerName, String buyerName) {
        super();
        this.deliveryName = deliveryName;
        this.DeliveryStatus = DeliveryStatus;
        this.location = location;
        this.sellerName = sellerName;
        this.buyerName = buyerName;
        this.buyerName = buyerName;
    }
    public String getDeliveryName() {
        return deliveryName;
    }
    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }
    public String getDeliveryStatus() {
        return DeliveryStatus;
    }
    public void setDescription(String DeliveryStatus) {
        this.DeliveryStatus = DeliveryStatus;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getSellerName() {
        return sellerName;
    }
    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }
   public String getBuyerName() {
        return buyerName;
    }
    public void setBuyerName(String buyerName) {
        this.buyerName = buyerName;
    }


}


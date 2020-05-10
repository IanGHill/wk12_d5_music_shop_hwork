public class Accessory implements ISell{

  private String type;
  private Double purchasePrice;
  private Double salePrice;
  private String brand;

  public Accessory (String brand, String type, Double purchasePrice, Double salePrice) {
    this.brand = brand;
    this.type = type;
    this.purchasePrice = purchasePrice;
    this.salePrice = salePrice;
  }

  public Double getMarkup() {
    return (((salePrice - purchasePrice) / purchasePrice) * 100);
  }

  public String getBrand() {
    return brand;
  }

  public String getType() {
    return type;
  }

  public Double getPurchasePrice() {
    return purchasePrice;
  }

  public Double getSalePrice() {
    return salePrice;
  }
}

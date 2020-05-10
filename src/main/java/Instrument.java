public abstract class Instrument implements ISell{

  private String colour;
  private String type;
  private Double purchasePrice;
  private Double salePrice;
  private String brand;

  public Instrument(String brand, String colour, String type, Double purchasePrice, Double salePrice) {
    this.brand = brand;
    this.colour = colour;
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

  public String getColour() {
    return colour;
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

import java.util.ArrayList;

public class Shop {
  private String name;
  private ArrayList<ISell> stock;
  public Shop(String name) {
    this.name = name;
    this.stock = new ArrayList<ISell>();
  }

  public String getName() {
    return name;
  }

  public ArrayList<ISell> getStock() {
    return this.stock;
  }

  public void addToStock(ISell stockItem){
    this.stock.add(stockItem);
  }

  public void removeFromStock(ISell stockItem){
    this.stock.remove(stockItem);
  }

}

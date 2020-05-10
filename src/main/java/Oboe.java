public class Oboe extends Instrument implements IPlay  {

  private String sound;

  public Oboe(String brand, String colour, String type, Double purchasePrice, Double salePrice, String sound) {
    super(brand, colour, type, purchasePrice, salePrice);
    this.sound = sound;
  }

  public String getSound() {
    return sound;
  }
}

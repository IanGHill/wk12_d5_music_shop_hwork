public class Guitar extends Instrument implements IPlay{

  private int numStrings;
  private String sound;
  
  public Guitar(String brand, String colour, String type, Double purchasePrice, Double salePrice, String sound,
                int numStrings) {
    super(brand, colour, type, purchasePrice, salePrice);
    this.numStrings = numStrings;
    this.sound = sound;
  }

  public String getSound() {
    return sound;
  }

  public int getNumStrings() {
    return numStrings;
  }
  
}

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AccessoryTest {

  Accessory guitarStrings;

  @Before
  public void before(){

    guitarStrings = new Accessory("Fender","Guitar Strings",3.00,6.00);
  }

  @Test
  public void hasBrand(){
    assertEquals("Fender", guitarStrings.getBrand());
  }

  @Test
  public void hasType(){
    assertEquals("Guitar Strings", guitarStrings.getType());
  }

  @Test
  public void hasPurchasePrice(){
    assertEquals(3.00, guitarStrings.getPurchasePrice(), 0.1 );
  }

  @Test
  public void hasSalePrice(){
    assertEquals(6.00, guitarStrings.getSalePrice(), 0.1);
  }

  @Test
  public void canGetMarkup(){
    assertEquals(100.00, guitarStrings.getMarkup(), 0.1);
  }
}

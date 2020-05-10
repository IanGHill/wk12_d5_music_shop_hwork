import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OboeTest {

  Oboe yamaha;

  @Before
  public void before(){

    yamaha = new Oboe("Yamaha","Black","Double Reed Oboe",1000.00,1500.00,"Paaarp");
  }

  @Test
  public void hasBrand(){
    assertEquals("Yamaha", yamaha.getBrand());
  }

  @Test
  public void hasColour(){
    assertEquals("Black", yamaha.getColour());
  }

  @Test
  public void hasType(){
    assertEquals("Double Reed Oboe", yamaha.getType());
  }

  @Test
  public void hasPurchasePrice(){
    assertEquals(1000.00, yamaha.getPurchasePrice(), 0.1 );
  }

  @Test
  public void hasSalePrice(){
    assertEquals(1500.00, yamaha.getSalePrice(), 0.1);
  }

  @Test
  public void canPlaySound(){
    assertEquals("Paaarp", yamaha.getSound());
  }

  @Test
  public void canGetMarkup(){
    assertEquals(50.00, yamaha.getMarkup(), 0.1);
  }
}

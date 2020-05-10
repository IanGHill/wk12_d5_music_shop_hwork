import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuitarTest {

  Guitar fender;

  @Before
  public void before(){

    fender = new Guitar("Fender","Red","Lead Guitar",100.00,200.00,"Strummm",6);
  }

  @Test
  public void hasBrand(){
    assertEquals("Fender", fender.getBrand());
  }

  @Test
  public void hasColour(){
    assertEquals("Red", fender.getColour());
  }

  @Test
  public void hasType(){
    assertEquals("Lead Guitar", fender.getType());
  }

  @Test
  public void hasPurchasePrice(){
    assertEquals(100.00, fender.getPurchasePrice(), 0.1 );
  }

  @Test
  public void hasSalePrice(){
    assertEquals(200.00, fender.getSalePrice(), 0.1);
  }

  @Test
  public void hasNumStrings(){
    assertEquals(6, fender.getNumStrings());
  }

  @Test
  public void canPlaySound(){
    assertEquals("Strummm", fender.getSound());
  }

  @Test
  public void canGetMarkup(){
    assertEquals(100.00, fender.getMarkup(), 0.1);
  }
}

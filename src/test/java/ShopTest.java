import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {

  Guitar fender;
  Oboe yamaha;
  Accessory guitarStrings;
  Shop shop;

  @Before
  public void before(){
    fender = new Guitar("Fender","Red","Lead Guitar",100.00,200.00,"Strummm",6);
    yamaha = new Oboe("Yamaha","Black","Double Reed Oboe",1000.00,1500.00,"Paaarp");
    guitarStrings = new Accessory("Fender","Guitar Strings",3.00,6.00);
    shop = new Shop("The Music Cave");
  }

  @Test
  public void hasName(){
    assertEquals("The Music Cave", shop.getName());
  }
  @Test
  public void hasStock(){
    shop.addToStock(fender);
    assertEquals(1, shop.getStock().size());
  }

  @Test
  public void canAddStock(){
    shop.addToStock(fender);
    shop.addToStock(yamaha);
    assertEquals(2, shop.getStock().size());
  }

  @Test
  public void canRemoveFromStock(){
    shop.addToStock(guitarStrings);
    shop.addToStock(fender);
    shop.addToStock(yamaha);
    assertEquals(3, shop.getStock().size());
    shop.removeFromStock(yamaha);
    assertEquals(2, shop.getStock().size());
  }

}

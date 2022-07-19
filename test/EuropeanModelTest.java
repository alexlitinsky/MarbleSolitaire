import org.junit.Before;
import org.junit.Test;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;
import cs3500.marblesolitaire.model.hw04.EuropeanSolitaireModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * A Representation for a European Model test.
 */
public class EuropeanModelTest extends AbstractModelTest {

  EuropeanSolitaireModel eN; // normal installation
  EuropeanSolitaireModel eP1; // exception occurs - invalid empty
  EuropeanSolitaireModel eA1; // exception occurs - invalid arm thickness
  EuropeanSolitaireModel eB1; // exception occurs - invalid empty
  EuropeanSolitaireModel eB2; // exception occurs - invalid arm thickness
  EuropeanSolitaireModel eB3; // exception occurs - invalid empty and arm thickness (checking both?)


  @Before
  @Override
  public void init() {
    normModel = new EuropeanSolitaireModel();
    emptyModel = new EuropeanSolitaireModel(3, 3);
    emptyModel2 = new EuropeanSolitaireModel(4, 4);
    armModel = new EuropeanSolitaireModel(5);
    paramModel = new EuropeanSolitaireModel(5, 4, 4);
    eN = new EuropeanSolitaireModel();

  }

  // test invalid constructors
  // testing invalid empty
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidEmpty() {
    eP1 = new EuropeanSolitaireModel(0, 0);
  }

  // testing invalid arm
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidArm() {
    eA1 = new EuropeanSolitaireModel(4);
  }

  // testing invalid empty with multiple params
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidParams1() {
    eB1 = new EuropeanSolitaireModel(3, 0, 0);

  }

  // testing invalid arm with multiple params
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidParams2() {
    eB2 = new EuropeanSolitaireModel(4, 3, 3);


  }

  // testing in valid arm and empty with multiple parms
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidParams3() {
    eB3 = new EuropeanSolitaireModel(4, 0, 0);
  }

  // testing the corners of european model
  @Test
  public void testingCorners() {
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, eN.getSlotAt(1, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, eN.getSlotAt(1, 5));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, eN.getSlotAt(5, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, eN.getSlotAt(5, 5));
  }

  // testing game over functionality
  @Test
  public void testGameOver() {
    eN.move(3, 1, 3, 3);
    assertFalse(eN.isGameOver());
    eN.move(3, 4, 3, 2);
    assertFalse(eN.isGameOver());
    eN.move(3, 6, 3, 4);
    assertFalse(eN.isGameOver());
    eN.move(5, 3, 3, 3);
    assertFalse(eN.isGameOver());
    eN.move(2, 3, 4, 3);
    assertFalse(eN.isGameOver());
    eN.move(0, 3, 2, 3);
    assertFalse(eN.isGameOver());
    eN.move(5, 5, 3, 5);
    assertFalse(eN.isGameOver());
    eN.move(3, 4, 3, 6);
    assertFalse(eN.isGameOver());
    eN.move(1, 5, 3, 5);
    assertFalse(eN.isGameOver());
    eN.move(3, 6, 3, 4);
    assertFalse(eN.isGameOver());
    eN.move(2, 3, 2, 5);
    assertFalse(eN.isGameOver());
    eN.move(4, 3, 4, 5);
    assertFalse(eN.isGameOver());
    eN.move(2, 6, 2, 4);
    assertFalse(eN.isGameOver());
    eN.move(4, 6, 4, 4);
    assertFalse(eN.isGameOver());
    eN.move(1, 1, 1, 3);
    assertFalse(eN.isGameOver());
    eN.move(2, 1, 2, 3);
    assertFalse(eN.isGameOver());
    eN.move(4, 1, 4, 3);
    assertFalse(eN.isGameOver());
    eN.move(5, 1, 5, 3);
    assertFalse(eN.isGameOver());
    eN.move(2, 3, 0, 3);
    assertFalse(eN.isGameOver());
    eN.move(4, 4, 4, 2);
    assertFalse(eN.isGameOver());
    eN.move(5, 4, 5, 2);
    assertFalse(eN.isGameOver());
    eN.move(4, 2, 2, 2);
    assertFalse(eN.isGameOver());
    eN.move(6, 2, 4, 2);
    assertFalse(eN.isGameOver());
    eN.move(2, 4, 4, 4);
    assertFalse(eN.isGameOver());
    eN.move(0, 4, 2, 4);
    assertFalse(eN.isGameOver());
    eN.move(6, 4, 6, 2);
    assertFalse(eN.isGameOver());
    eN.move(0, 2, 0, 4);
    assertTrue(eN.isGameOver());
  }

  @Test
  public void getScore() {
    assertEquals(36, eN.getScore());
    eN.move(3, 1, 3, 3);
    assertEquals(35, eN.getScore());
  }

}

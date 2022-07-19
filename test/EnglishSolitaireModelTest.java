
import org.junit.Before;
import org.junit.Test;

import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;


import static org.junit.Assert.assertEquals;

/**
 * A Representation to test the English Solitaire Model.
 */
public class EnglishSolitaireModelTest extends AbstractModelTest {
  EnglishSolitaireModel eN; // normal installation
  EnglishSolitaireModel eP1; // exception occurs - invalid empty

  EnglishSolitaireModel eA1; // exception occurs - invalid arm thickness

  EnglishSolitaireModel eB1; // exception occurs - invalid empty
  EnglishSolitaireModel eB2; // exception occurs - invalid arm thickness
  EnglishSolitaireModel eB3; // exception occurs - invalid empty and arm thickness (checking both?)

  @Before
  @Override
  public void init() {
    normModel = new EnglishSolitaireModel();
    emptyModel = new EnglishSolitaireModel(3, 3);
    emptyModel2 = new EnglishSolitaireModel(4, 4);
    armModel = new EnglishSolitaireModel(5);
    paramModel = new EnglishSolitaireModel(5, 4, 4);
    eN = new EnglishSolitaireModel();
  }

  // testing invalid empty slot
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidSolitaireModelP() {
    eP1 = new EnglishSolitaireModel(0, 0);
  }

  // testing invalid empty slot with multiple params
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidEnglishSolitaireModelB1() {
    eB1 = new EnglishSolitaireModel(5, 0, 3);
  }

  // testing even arm thickness with multiple params
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidEnglishSolitaireModelB2() {
    eB2 = new EnglishSolitaireModel(4, 3, 3);
  }

  // testing invalid empty slot and arm thickness
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidEnglishSolitaireModelB3() {
    eB3 = new EnglishSolitaireModel(4, 1, 1);
  }

  // testing even arm thickness
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidEnglishSolitaireModelA1() {
    eA1 = new EnglishSolitaireModel(4);
  }


  // testing if game is over after a certain number of moves
  @Test
  public void testIsGameOver() {
    assertEquals(false, eN.isGameOver());
    eN.move(3, 1, 3, 3);
    assertEquals(false, eN.isGameOver());
    eN.move(3, 4, 3, 2);
    assertEquals(false, eN.isGameOver());
    eN.move(3, 6, 3, 4);
    assertEquals(false, eN.isGameOver());
    eN.move(5, 3, 3, 3);
    assertEquals(false, eN.isGameOver());
    eN.move(2, 3, 4, 3);
    assertEquals(false, eN.isGameOver());
    eN.move(0, 3, 2, 3);
    assertEquals(true, eN.isGameOver());
  }


  // testing getting different scores from the same board
  @Test
  public void testGetScore() {
    assertEquals(32, eN.getScore());
    eN.move(5, 3, 3, 3);
    assertEquals(31, eN.getScore());
  }
}
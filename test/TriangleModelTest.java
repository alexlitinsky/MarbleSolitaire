import org.junit.Before;
import org.junit.Test;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;
import cs3500.marblesolitaire.model.hw04.TriangleSolitaireModel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * A Representation for a Triangle Model test.
 */
public class TriangleModelTest extends AbstractModelTest {
  private MarbleSolitaireModel invalTri; // invalid arm

  @Before
  @Override
  public void init() {
    normModel = new TriangleSolitaireModel();
    emptyModel = new TriangleSolitaireModel(3, 3);
    emptyModel2 = new TriangleSolitaireModel(4, 4);
    armModel = new TriangleSolitaireModel(5);
    paramModel = new TriangleSolitaireModel(5, 4, 4);
  }

  // test invalid constructors as well

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidArm() {
    invalTri = new TriangleSolitaireModel(0);
  }

  @Test(expected = IllegalArgumentException.class)
  public void testInvalidEmpty() {
    invalTri = new TriangleSolitaireModel(0, 1);
  }

  // testing invalid side length
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidParams1() {
    invalTri = new TriangleSolitaireModel(0, 1, 1);
  }

  // testing invalid empty slot
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidParams2() {
    invalTri = new TriangleSolitaireModel(4, 0, 1);
  }

  // testing invalid arm and empty slot
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidParams3() {
    invalTri = new TriangleSolitaireModel(0, 0, 1);
  }

  @Test
  @Override
  public void testMarbleSolitaireModelParam() {
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, paramModel.getSlotAt(4, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, paramModel.getSlotAt(0, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(1, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, normModel.getSlotAt(0, 2));
  }

  // testing all possible moves
  @Test
  @Override
  public void testMove() {
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(0, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(1, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(2, 2));
    // moving up left diagonally
    normModel.move(2, 2, 0, 0);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(0, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(1, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(4, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(2, 2));
    // moving up right diagonally
    normModel.move(4, 0, 2, 2);
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(4, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 2));
    // moving left
    normModel.move(3, 3, 3, 1);
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(1, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(2, 1));
    // moving down right diagonally
    normModel.move(1, 0, 3, 2);
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(1, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(2, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 3));
    // moving right
    normModel.move(3, 1, 3, 3);
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(2, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(1, 0));
    // moving up
    normModel.move(3, 0, 1, 0);
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(2, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(1, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(0, 0));
    // moving down
    normModel.move(0, 0, 2, 0);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(2, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(1, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(0, 0));

    //process of moving down left diagonally
    normModel = new TriangleSolitaireModel();
    normModel.move(2, 2, 0, 0);
    normModel.move(4, 0, 2, 2);
    normModel.move(3, 3, 3, 1);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(4, 0));
    //moving left diagonally
    normModel.move(2, 2, 4, 0);
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(4, 0));
  }

  @Test
  @Override
  public void testNormalModel() {
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(0, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(4, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(4, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, normModel.getSlotAt(2, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, normModel.getSlotAt(0, 1));
  }

  @Test
  @Override
  public void testGetBoardSize() {
    assertEquals(5, normModel.getBoardSize());
    assertEquals(5, armModel.getBoardSize());
  }

  @Test
  @Override
  public void testMarbleSolitaireModelArm() {
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, armModel.getSlotAt(0, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, armModel.getSlotAt(4, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, armModel.getSlotAt(4, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, armModel.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, armModel.getSlotAt(0, 1));
  }

  @Test
  @Override
  public void testGetSlotAt() {
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(0, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, normModel.getSlotAt(0, 1));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(1, 0));
  }

  // testing game over functionality
  @Test
  public void testGameOver() {
    normModel.move(2, 2, 0, 0);
    assertFalse(normModel.isGameOver());
    normModel.move(3, 1, 1, 1);
    assertFalse(normModel.isGameOver());
    normModel.move(4, 4, 2, 2);
    assertFalse(normModel.isGameOver());
    normModel.move(4, 3, 2, 1);
    assertFalse(normModel.isGameOver());
    normModel.move(4, 1, 4, 3);
    assertFalse(normModel.isGameOver());
    normModel.move(1, 1, 3, 3);
    assertFalse(normModel.isGameOver());
    normModel.move(2, 0, 2, 2);
    assertFalse(normModel.isGameOver());
    normModel.move(0, 0, 2, 0);
    assertFalse(normModel.isGameOver());
    normModel.move(3, 0, 1, 0);
    assertFalse(normModel.isGameOver());
    normModel.move(2, 2, 4, 4);
    assertFalse(normModel.isGameOver());
    normModel.move(4, 4, 4, 2);
    assertTrue(normModel.isGameOver());
  }

  // testing get score method
  @Test
  public void testGetScore() {
    assertEquals(14, normModel.getScore());
    normModel.move(2, 2, 0, 0);
    assertEquals(13, normModel.getScore());
  }

}

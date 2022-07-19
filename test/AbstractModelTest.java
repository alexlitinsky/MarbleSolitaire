
import org.junit.Before;
import org.junit.Test;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;

import static org.junit.Assert.assertEquals;

/**
 * An Abstract class for testing the models (shared methods).
 */
public abstract class AbstractModelTest {

  protected MarbleSolitaireModel normModel; //e
  protected MarbleSolitaireModel armModel; //a

  protected MarbleSolitaireModel emptyModel; //p

  protected MarbleSolitaireModel emptyModel2; //p

  protected MarbleSolitaireModel paramModel; //b


  @Before
  public abstract void init();

  @Test
  public void testGetBoardSize() {
    assertEquals(7, normModel.getBoardSize());
    assertEquals(13, armModel.getBoardSize());
  }

  // testing getting slot
  @Test
  public void testGetSlotAt() {
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(4, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(2, 2));
  }

  @Test
  public void testMove() {
    // testing lower to upper row
    normModel.move(5, 3, 3, 3);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(4, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(5, 3));
    this.init();
    // testing upper to lower row
    normModel.move(1, 3, 3, 3);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(2, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(1, 3));
    this.init();
    // testing from higher to lower column
    normModel.move(3, 5, 3, 3);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 5));
    this.init();
    // testing from lower to higher column
    normModel.move(3, 1, 3, 3);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 1));
    // testing move after first initial move
    normModel.move(3, 4, 3, 2);
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(3, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 4));
  }

  // testing invalid moves
  // 1 - testing from more than a marble away
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove1() {
    normModel.move(3, 6, 3, 3);

  }

  // 2 - testing from 1 spot away from empty
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove2() {
    normModel.move(3, 4, 3, 3);
  }

  // 3 - testing marble to invalid spot
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove3() {
    normModel.move(3, 4, 1, 1);

  }

  // 4 - testing empty to marble
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove4() {
    normModel.move(3, 3, 3, 5);

  }

  // testing from marbles from more than 2 spots away
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove5() {
    normModel.move(1, 3, 5, 3);

  }

  // testing invalid to marble
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove6() {
    normModel.move(1, 1, 4, 4);

  }

  // testing invalid to empty
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove7() {
    normModel.move(1, 1, 3, 3);
  }

  // testing empty to invalid
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove8() {
    normModel.move(3, 3, 1, 1);
  }

  // testing marble to empty but over marble
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove9() {
    normModel.move(3, 5, 3, 3);
    normModel.move(3, 6, 3, 4);
  }

  // testing out of bounds index to empty
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove10() {
    normModel.move(-1, -1, 3, 3);
  }

  // testing empty to out of bounds index
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove11() {
    normModel.move(3, 3, -1, -1);
  }

  // testing empty to out of bounds index
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove12() {
    normModel.move(3, 3, 7, 7);
  }

  // testing empty to out of bounds index
  @Test(expected = IllegalArgumentException.class)
  public void testInvalidMove13() {
    normModel.move(7, 7, 3, 3);
  }

  // testing new empty slot
  @Test
  public void testMarbleSolitaireModelEmpty() {
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, emptyModel.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, emptyModel.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, emptyModel2.getSlotAt(4, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, emptyModel2.getSlotAt(3, 3));
  }

  // testing arm thickness model
  @Test
  public void testMarbleSolitaireModelArm() {
    assertEquals(13, armModel.getBoardSize());
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, armModel.getSlotAt(6, 6));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, armModel.getSlotAt(4, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, armModel.getSlotAt(5, 5));
  }

  // testing if paramModel (dif. arm thickness) is initalized correctly
  @Test
  public void testMarbleSolitaireModelParam() {
    assertEquals(13, paramModel.getBoardSize());
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, paramModel.getSlotAt(4, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, paramModel.getSlotAt(6, 6));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, paramModel.getSlotAt(5, 5));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, paramModel.getSlotAt(0, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, paramModel.getSlotAt(4, 0));
  }

  @Test
  public void testNormalModel() {
    assertEquals(MarbleSolitaireModelState.SlotState.Empty, normModel.getSlotAt(3, 3));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(4, 4));
    assertEquals(MarbleSolitaireModelState.SlotState.Marble, normModel.getSlotAt(2, 2));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, normModel.getSlotAt(0, 0));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, normModel.getSlotAt(6, 6));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, normModel.getSlotAt(0, 6));
    assertEquals(MarbleSolitaireModelState.SlotState.Invalid, normModel.getSlotAt(6, 0));
  }
}

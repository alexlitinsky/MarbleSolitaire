import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import cs3500.marblesolitaire.controller.MarbleSolitaireControllerImpl;
import cs3500.marblesolitaire.model.hw04.EuropeanSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;

import static org.junit.Assert.assertEquals;

/**
 * A Representation for a European Solitaire Controller Test.
 */
public class EuropeanMarbleSolitaireControllerImplTest extends AbstractControllerTest {

  @Before
  @Override
  public void init() {
    normModel = new EuropeanSolitaireModel();
  }

  // testing low inputs (2-3 inputs)
  @Test
  public void lowInputs1() {
    Readable re = new StringReader("4 6 4 q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }

  // testing low inputs (2-3 inputs)
  @Test
  public void lowInputs2() {
    Readable re = new StringReader("4 6 q 4");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }

  // testing low inputs (2-3 inputs)
  @Test
  public void lowInputs3() {
    Readable re = new StringReader("4 q 6 4");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }

  // testing low inputs (2-3 inputs)
  @Test
  public void lowInputs4() {
    Readable re = new StringReader("q 4 6 4");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }


  // testing for bad inputs (multi-char string)
  @Test
  public void badInputs1() {
    Readable re = new StringReader("hello q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Please enter a integer(s) as an input." + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }

  // testing for bad inputs (singe char that's not q)
  @Test
  public void badInputs3() {
    Readable re = new StringReader("a q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Please enter a integer(s) as an input." + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }

  // testing for bad inputs (single space)
  @Test
  public void badInputs4() {
    Readable re = new StringReader(" q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }

  // testing for bad inputs (final char of sequence not an integer)
  @Test
  public void badInputs5() {
    Readable re = new StringReader("4 6 4 a q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Please enter a integer(s) as an input." + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }

  // testing for bad inputs (negative integer)
  @Test
  public void badInputs6() {
    Readable re = new StringReader("-5 4 3 4 q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Please enter a integer(s) as an input." + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }

  // testing lower case Q
  @Test
  public void testQuit1() {
    Readable re = new StringReader("6 4 4 4 q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 35" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 35", app.toString());
  }

  // testing uppercase q
  @Test
  public void testQuit2() {
    Readable re = new StringReader("6 4 4 4 Q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 35" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 35", app.toString());
  }

  // testing quit after several moves
  @Test
  public void testQuit3() {
    Readable re = new StringReader("6 4 4 4 5 2 5 4 Q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 35" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ _ O O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 34" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ _ O O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 34", app.toString());
  }

  // testing move left
  @Test
  public void testMoveL() {
    Readable re = new StringReader("4 2 4 4 Q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ _ O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 35" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ _ O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 35", app.toString());
  }

  // testing move right
  @Test
  public void testMoveR() {
    Readable re = new StringReader("4 6 4 4 Q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O _ _ O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 35" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O _ _ O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 35", app.toString());
  }

  // testing move up
  @Test
  public void testMoveU() {
    Readable re = new StringReader("6 4 4 4 Q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 35" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 35", app.toString());
  }

  // testing move down
  @Test
  public void testMoveD() {
    Readable re = new StringReader("2 4 4 4 Q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 35" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 35", app.toString());
  }

  // testing new line move
  @Test
  public void testMoveNL() {
    Readable re = new StringReader("2\n4\n4\n4\nQ");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 35" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 35", app.toString());
  }

  // testing a large move
  @Test
  public void InvMove1() {
    Readable re = new StringReader("8 4 4 4 q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 36" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }

  // testing over empty
  @Test
  public void InvMove2() {
    Readable re = new StringReader("2 4 4 4 1 4 3 4 q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 35" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 35" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 35", app.toString());
  }

  // testing marble to invalid
  @Test
  public void InvMove3() {
    Readable re = new StringReader("2 4 1 1 q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 36" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }

  // testing  out of bounds (from)
  @Test
  public void InvMove4() {
    Readable re = new StringReader("1 9 4 4 q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 36" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }

  // testing out of bounds (to)
  @Test
  public void InvMove5() {
    Readable re = new StringReader("2 4 9 1 q");
    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 36" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36", app.toString());
  }

  // testing game over state
  @Test
  public void testGameOver() {
    Readable re = new StringReader("4 2 4 4 4 5 4 3 4 7 4 5 6 4 4 4 3 4 5 4 1 4 3 4 6 6 4 6 "
            + "4 5 4 7 2 6 4 6 4 7 4 5 3 4 3 6 5 4 5 6 3 7 3 5 5 7 5 5 2 2 2 4 3 2 3 4 5 2 5 4 "
            + "6 2 6 4 3 4 1 4 5 5 5 3 6 5 6 3 5 3 3 3 7 3 5 3 3 5 5 5 1 5 3 5 7 5 7 3 1 3 1 5 q");

    Appendable app = new StringBuilder();
    EuropeanSolitaireModel model = new EuropeanSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 36" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ _ O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 35" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ O _ _ O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 34" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 33" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ O O O _ _" + "\n"
            + "O O O _ O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 32" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 31" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  O O _ O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O _ O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 30" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  O O _ O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ O _ O O _" + "\n"
            + "O O O O O _ O" + "\n"
            + "  O O _ O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 29" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  O O _ O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ O _ _ _ O" + "\n"
            + "O O O O O _ O" + "\n"
            + "  O O _ O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 28" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  O O _ O _" + "\n"
            + "O O O O O _ O" + "\n"
            + "O _ O _ _ O O" + "\n"
            + "O O O O O _ O" + "\n"
            + "  O O _ O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 27" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  O O _ O _" + "\n"
            + "O O O O O _ O" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O O O _ O" + "\n"
            + "  O O _ O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 26" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  O O _ O _" + "\n"
            + "O O O _ _ O O" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O O O _ O" + "\n"
            + "  O O _ O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 25" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  O O _ O _" + "\n"
            + "O O O _ _ O O" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O _ _ O O" + "\n"
            + "  O O _ O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 24" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  O O _ O _" + "\n"
            + "O O O _ O _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O _ _ O O" + "\n"
            + "  O O _ O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 23" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  O O _ O _" + "\n"
            + "O O O _ O _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O _ O _ _" + "\n"
            + "  O O _ O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 22" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  _ _ O O _" + "\n"
            + "O O O _ O _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O _ O _ _" + "\n"
            + "  O O _ O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 21" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  _ _ O O _" + "\n"
            + "O _ _ O O _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O _ O _ _" + "\n"
            + "  O O _ O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 20" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  _ _ O O _" + "\n"
            + "O _ _ O O _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O _ _ O O _ _" + "\n"
            + "  O O _ O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 19" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "  _ _ O O _" + "\n"
            + "O _ _ O O _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O _ _ O O _ _" + "\n"
            + "  _ _ O O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 18" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  _ _ _ O _" + "\n"
            + "O _ _ _ O _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O _ _ O O _ _" + "\n"
            + "  _ _ O O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 17" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  _ _ _ O _" + "\n"
            + "O _ _ _ O _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O _ O _ _ _ _" + "\n"
            + "  _ _ O O _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 16" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  _ _ _ O _" + "\n"
            + "O _ _ _ O _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O _ O _ _ _ _" + "\n"
            + "  _ O _ _ _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 15" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  _ _ _ O _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O _ _ _ O _ _" + "\n"
            + "O _ _ _ _ _ _" + "\n"
            + "  _ O _ _ _" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 14" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  _ _ _ O _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O _ _ _ O _ _" + "\n"
            + "O _ O _ _ _ _" + "\n"
            + "  _ _ _ _ _" + "\n"
            + "    _ O O" + "\n"
            + "\n"
            + "Score: 13" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "  _ _ _ O _" + "\n"
            + "O _ O _ _ _ _" + "\n"
            + "O _ _ _ _ _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "  _ _ _ _ _" + "\n"
            + "    _ O O" + "\n"
            + "\n"
            + "Score: 12" + "\n"
            + "\n"
            + "    O O _" + "\n"
            + "  _ _ _ _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O _ _ _ _ _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "  _ _ _ _ _" + "\n"
            + "    _ O O" + "\n"
            + "\n"
            + "Score: 11" + "\n"
            + "\n"
            + "    O O _" + "\n"
            + "  _ _ _ _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O _ _ _ _ _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "  _ _ _ _ _" + "\n"
            + "    O _ _" + "\n"
            + "\n"
            + "Score: 10" + "\n"
            + "\n"
            + "    _ _ O" + "\n"
            + "  _ _ _ _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O _ _ _ _ _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "  _ _ _ _ _" + "\n"
            + "    O _ _" + "\n"
            + "\n"
            + "Score: 9" + "\n"
            + "Game over!" + "\n"
            + "    _ _ O" + "\n"
            + "  _ _ _ _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O _ _ _ _ _ _" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "  _ _ _ _ _" + "\n"
            + "    O _ _" + "\n"
            + "Score: 9", app.toString());

  }
}



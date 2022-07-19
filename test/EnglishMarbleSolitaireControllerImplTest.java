import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import cs3500.marblesolitaire.controller.MarbleSolitaireControllerImpl;
import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;

import static org.junit.Assert.assertEquals;

/**
 * A Representation of a MarbleSolitaire Controller Implementation Test.
 */
public class EnglishMarbleSolitaireControllerImplTest extends AbstractControllerTest {

  @Before
  @Override
  public void init() {
    normModel = new EnglishSolitaireModel();
  }

  // testing low inputs (2-3 inputs)
  @Test
  public void lowInputs1() {
    Readable re = new StringReader("4 6 4 q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }

  // testing low inputs (2-3 inputs)
  @Test
  public void lowInputs2() {
    Readable re = new StringReader("4 6 q 4");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }

  // testing low inputs (2-3 inputs)
  @Test
  public void lowInputs3() {
    Readable re = new StringReader("4 q 6 4");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }

  // testing low inputs (2-3 inputs)
  @Test
  public void lowInputs4() {
    Readable re = new StringReader("q 4 6 4");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }


  // testing for bad inputs (multi-char string)
  @Test
  public void badInputs1() {
    Readable re = new StringReader("hello q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Please enter a integer(s) as an input." + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }

  // testing for bad inputs (singe char that's not q)
  @Test
  public void badInputs3() {
    Readable re = new StringReader("a q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Please enter a integer(s) as an input." + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }

  // testing for bad inputs (single space)
  @Test
  public void badInputs4() {
    Readable re = new StringReader(" q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }

  // testing for bad inputs (final char of sequence not an integer)
  @Test
  public void badInputs5() {
    Readable re = new StringReader("4 6 4 a q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Please enter a integer(s) as an input." + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }

  // testing for bad inputs (negative integer)
  @Test
  public void badInputs6() {
    Readable re = new StringReader("-5 4 3 4 q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Please enter a integer(s) as an input." + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }

  // testing lower case Q
  @Test
  public void testQuit1() {
    Readable re = new StringReader("6 4 4 4 q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 31" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "Score: 31", app.toString());
  }

  // testing uppercase q
  @Test
  public void testQuit2() {
    Readable re = new StringReader("6 4 4 4 Q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 31" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "Score: 31", app.toString());
  }

  // testing quit after several moves
  @Test
  public void testQuit3() {
    Readable re = new StringReader("6 4 4 4 5 2 5 4 Q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 31" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ _ O O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 30" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ _ O O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "Score: 30", app.toString());
  }

  // testing move left
  @Test
  public void testMoveL() {
    Readable re = new StringReader("4 2 4 4 Q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ _ O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 31" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ _ O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 31", app.toString());
  }

  // testing move right
  @Test
  public void testMoveR() {
    Readable re = new StringReader("4 6 4 4 Q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O _ _ O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 31" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O _ _ O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 31", app.toString());
  }

  // testing move up
  @Test
  public void testMoveU() {
    Readable re = new StringReader("6 4 4 4 Q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 31" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "Score: 31", app.toString());
  }

  // testing move down
  @Test
  public void testMoveD() {
    Readable re = new StringReader("2 4 4 4 Q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O _ O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 31" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O _ O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 31", app.toString());
  }

  // testing new line move
  @Test
  public void testMoveNL() {
    Readable re = new StringReader("2\n4\n4\n4\nQ");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O _ O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 31" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O _ O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 31", app.toString());
  }

  // testing a large move
  @Test
  public void InvMove1() {
    Readable re = new StringReader("8 4 4 4 q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 32" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }

  // testing over empty
  @Test
  public void InvMove2() {
    Readable re = new StringReader("2 4 4 4 1 4 3 4 q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O _ O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 31" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    O O O" + "\n"
            + "    O _ O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 31" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O _ O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 31", app.toString());
  }

  // testing marble to invalid
  @Test
  public void InvMove3() {
    Readable re = new StringReader("2 4 1 1 q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 32" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }

  // testing  out of bounds (from)
  @Test
  public void InvMove4() {
    Readable re = new StringReader("1 9 4 4 q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 32" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }

  // testing out of bounds (to)
  @Test
  public void InvMove5() {
    Readable re = new StringReader("2 4 9 1 q");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 32" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32", app.toString());
  }

  // testing game over state
  @Test
  public void testGameOver() {
    Readable re = new StringReader("4 2 4 4 4 5 4 3 4 7 4 5 6 4 4 4 3 4 5 4 1 4 3 4");
    Appendable app = new StringBuilder();
    EnglishSolitaireModel model = new EnglishSolitaireModel();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "Score: 32" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ _ O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 31" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ O _ _ O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 30" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 29" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ O O O _ _" + "\n"
            + "O O O _ O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 28" + "\n"
            + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O O O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 27" + "\n"
            + "\n"
            + "    O _ O" + "\n"
            + "    O _ O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O O O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "\n"
            + "Score: 26" + "\n"
            + "Game over!" + "\n"
            + "    O _ O" + "\n"
            + "    O _ O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ O _ O _ _" + "\n"
            + "O O O O O O O" + "\n"
            + "    O _ O" + "\n"
            + "    O O O" + "\n"
            + "Score: 26", app.toString());
  }
}
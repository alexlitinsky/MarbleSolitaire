import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import cs3500.marblesolitaire.controller.MarbleSolitaireControllerImpl;
import cs3500.marblesolitaire.model.hw04.TriangleSolitaireModel;
import cs3500.marblesolitaire.view.TriangleSolitaireTextView;

import static org.junit.Assert.assertEquals;

/**
 * A Representation for a Triangle Controller Test.
 */
public class TriangleMarbleSolitaireControllerImplTest extends AbstractControllerTest {

  @Before
  @Override
  public void init() {
    normModel = new TriangleSolitaireModel();
  }

  // testing low inputs (2-3 inputs)
  @Test
  public void lowInputs1() {
    Readable re = new StringReader("4 6 4 q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }

  // testing low inputs (2-3 inputs)
  @Test
  public void lowInputs2() {
    Readable re = new StringReader("4 6 q 4");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }

  // testing low inputs (2-3 inputs)
  @Test
  public void lowInputs3() {
    Readable re = new StringReader("4 q 6 4");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }

  // testing low inputs (2-3 inputs)
  @Test
  public void lowInputs4() {
    Readable re = new StringReader("q 4 6 4");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }


  // testing for bad inputs (multi-char string)
  @Test
  public void badInputs1() {
    Readable re = new StringReader("hello q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Please enter a integer(s) as an input." + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }

  // testing for bad inputs (singe char that's not q)
  @Test
  public void badInputs3() {
    Readable re = new StringReader("a q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Please enter a integer(s) as an input." + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }

  // testing for bad inputs (single space)
  @Test
  public void badInputs4() {
    Readable re = new StringReader(" q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }

  // testing for bad inputs (final char of sequence not an integer)
  @Test
  public void badInputs5() {
    Readable re = new StringReader("4 6 4 a q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Please enter a integer(s) as an input." + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }

  // testing for bad inputs (negative integer)
  @Test
  public void badInputs6() {
    Readable re = new StringReader("-5 4 3 4 q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Please enter a integer(s) as an input." + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }

  // testing lower case Q
  // change row
  @Test
  public void testQuit1() {
    Readable re = new StringReader("3 3 1 1 q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 13" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 13", app.toString());
  }

  // testing uppercase q
  // change row
  @Test
  public void testQuit2() {
    Readable re = new StringReader("3 3 1 1 Q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 13" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 13", app.toString());
  }

  // testing quit after several moves
  // change row
  @Test
  public void testQuit3() {
    Readable re = new StringReader("3 3 1 1 3 1 3 3 Q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 13" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  _ _ O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 12" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  _ _ O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 12", app.toString());
  }

  // testing up left diag
  @Test
  public void testMoveULD() {
    Readable re = new StringReader("3 3 1 1 Q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 13" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 13", app.toString());
  }

  // testing move right
  @Test
  public void testMoveR() {
    Readable re = new StringReader("3 3 1 1 3 1 3 3 Q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 13" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  _ _ O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 12" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  _ _ O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 12", app.toString());
  }

  // testing move up
  @Test
  public void testMoveU() {
    Readable re = new StringReader("3 1 1 1 q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   _ O" + "\n"
            + "  _ O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 13" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O" + "\n"
            + "   _ O" + "\n"
            + "  _ O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 13", app.toString());
  }

  // testing move left
  @Test
  public void testMoveL() {
    Readable re = new StringReader("3 1 1 1 3 3 3 1 q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   _ O" + "\n"
            + "  _ O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 13" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   _ O" + "\n"
            + "  O _ _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 12" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O" + "\n"
            + "   _ O" + "\n"
            + "  O _ _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 12", app.toString());
  }

  // testing new line move
  @Test
  public void testMoveNL() {
    Readable re = new StringReader("3\n3\n1\n1\nQ");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 13" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 13", app.toString());
  }

  // testing a large move
  @Test
  public void InvMove1() {
    Readable re = new StringReader("4 4 1 1 q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 14" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }

  // testing over empty
  @Test
  public void InvMove2() {
    Readable re = new StringReader("3 3 1 1 4 4 2 2 q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 13" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 13" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 13", app.toString());
  }

  // testing marble to invalid
  @Test
  public void InvMove3() {
    Readable re = new StringReader("2 1 2 3 q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 14" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }

  // testing  out of bounds (from)
  @Test
  public void InvMove4() {
    Readable re = new StringReader("1 9 1 1 q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 14" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }

  // testing out of bounds (to)
  @Test
  public void InvMove5() {
    Readable re = new StringReader("3 3 9 1 q");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "Invalid move. Play again. Please enter a valid row and column."
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 14" + "\n"
            + "Game quit!" + "\n"
            + "State of game when quit:" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14", app.toString());
  }

  // testing game over state
  @Test
  public void testGameOver() {
    Readable re = new StringReader("3 3 1 1 4 2 2 2 5 5 3 3 5 4 3 2 5 2 5 4 2 2 4 4 3 1 3 3"
            + " 1 1 3 1 4 1 2 1 4 4 2 2");
    Appendable app = new StringBuilder();
    TriangleSolitaireModel model = new TriangleSolitaireModel();
    TriangleSolitaireTextView view = new TriangleSolitaireTextView(model, app);
    MarbleSolitaireControllerImpl controller = new MarbleSolitaireControllerImpl(model, view, re);
    controller.playGame();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "Score: 14" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 13" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O O" + "\n"
            + "  O _ _" + "\n"
            + " O _ O O" + "\n"
            + "O O O O O" + "\n"
            + "\n"
            + "Score: 12" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O O" + "\n"
            + "  O _ O" + "\n"
            + " O _ O _" + "\n"
            + "O O O O _" + "\n"
            + "\n"
            + "Score: 11" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O _ _ _" + "\n"
            + "O O O _ _" + "\n"
            + "\n"
            + "Score: 10" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O _ _ _" + "\n"
            + "O _ _ O _" + "\n"
            + "\n"
            + "Score: 9" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O _ _ O" + "\n"
            + "O _ _ O _" + "\n"
            + "\n"
            + "Score: 8" + "\n"
            + "\n"
            + "    O" + "\n"
            + "   O _" + "\n"
            + "  _ _ O" + "\n"
            + " O _ _ O" + "\n"
            + "O _ _ O _" + "\n"
            + "\n"
            + "Score: 7" + "\n"
            + "\n"
            + "    _" + "\n"
            + "   _ _" + "\n"
            + "  O _ O" + "\n"
            + " O _ _ O" + "\n"
            + "O _ _ O _" + "\n"
            + "\n"
            + "Score: 6" + "\n"
            + "\n"
            + "    _" + "\n"
            + "   O _" + "\n"
            + "  _ _ O" + "\n"
            + " _ _ _ O" + "\n"
            + "O _ _ O _" + "\n"
            + "\n"
            + "Score: 5" + "\n"
            + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  _ _ _" + "\n"
            + " _ _ _ _" + "\n"
            + "O _ _ O _" + "\n"
            + "\n"
            + "Score: 4" + "\n"
            + "Game over!" + "\n"
            + "    _" + "\n"
            + "   O O" + "\n"
            + "  _ _ _" + "\n"
            + " _ _ _ _" + "\n"
            + "O _ _ O _" + "\n"
            + "Score: 4", app.toString());
  }
}

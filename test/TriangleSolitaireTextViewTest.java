import org.junit.Before;
import org.junit.Test;
import java.io.IOException;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw04.TriangleSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;
import cs3500.marblesolitaire.view.TriangleSolitaireTextView;

import static org.junit.Assert.assertEquals;

/**
 * A TriangleSolitaireTextView test.
 */
public class TriangleSolitaireTextViewTest {

  private TriangleSolitaireTextView text;
  private MarbleSolitaireModel model;

  @Before
  public void init() {
    model = new TriangleSolitaireModel();
    text = new TriangleSolitaireTextView(model);
  }

  // testing triangle view along with a move
  @Test
  public void testTriangleView() {
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O", text.toString());
    model.move(2, 2, 0, 0); // top left
    assertEquals("    O" + "\n"
            + "   O _" + "\n"
            + "  O O _" + "\n"
            + " O O O O" + "\n"
            + "O O O O O", text.toString());
  }

  // testing toString method
  @Test
  public void triangleToString() {
    text = new TriangleSolitaireTextView(new TriangleSolitaireModel(3));
    assertEquals("  _" + "\n"
            + " O O" + "\n"
            + "O O O", text.toString());
    text = new TriangleSolitaireTextView(new TriangleSolitaireModel(1, 0));
    assertEquals("    O" + "\n"
            + "   _ O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O", text.toString());
    text = new TriangleSolitaireTextView(new TriangleSolitaireModel(3, 1, 0));
    assertEquals("  O" + "\n"
            + " _ O" + "\n"
            + "O O O", text.toString());
  }

  // testing rendered board for Triangle model
  @Test
  public void testRenderBoardTriangle() throws IOException {
    StringBuilder out = new StringBuilder();
    TriangleSolitaireModel sample = new TriangleSolitaireModel();
    TriangleSolitaireTextView textView = new TriangleSolitaireTextView(sample, out);
    textView.renderBoard();
    assertEquals("    _" + "\n"
            + "   O O" + "\n"
            + "  O O O" + "\n"
            + " O O O O" + "\n"
            + "O O O O O" + "\n", out.toString());
  }
  
  // testing render msg for triangle
  @Test
  public void renderMsgTriangle() throws IOException {
    StringBuilder out = new StringBuilder();
    TriangleSolitaireModel sample = new TriangleSolitaireModel();
    TriangleSolitaireTextView textView = new TriangleSolitaireTextView(sample, out);
    textView.renderMessage("foobar");
    assertEquals("foobar", out.toString());
    textView.renderMessage("123");
    assertEquals("foobar123", out.toString());
  }

  // testing invalid message for triangle
  @Test
  public void testInvalidMessageTriangle() throws IOException {
    StringBuilder out = new StringBuilder();
    TriangleSolitaireModel sample = new TriangleSolitaireModel();
    MarbleSolitaireTextView textView = new MarbleSolitaireTextView(sample, out);
    textView.renderMessage(null);
    String s = "";
    assertEquals(s + null, out.toString());
  }



}
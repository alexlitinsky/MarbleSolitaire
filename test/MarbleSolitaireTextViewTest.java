import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw04.EuropeanSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;
import cs3500.marblesolitaire.view.MarbleSolitaireView;

import static org.junit.Assert.assertEquals;

/**
 * A Representation to test Marble Solitaire Text View.
 */
public class MarbleSolitaireTextViewTest {
  private MarbleSolitaireView text;
  private MarbleSolitaireView text2;
  private MarbleSolitaireModel model2;
  private MarbleSolitaireModel model;

  @Before
  public void init() {
    model = new EnglishSolitaireModel();
    text = new MarbleSolitaireTextView(model);
    model2 = new EuropeanSolitaireModel();
    text2 = new MarbleSolitaireTextView(model2);
  }


  // testing if view construct functions and testing move with English
  @Test
  public void testViewEnglish() {
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n" + "    O O O", text.toString());
    model.move(3, 1, 3, 3);
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ _ O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n" + "    O O O", text.toString());

  }

  // testing view for european as well as a successful move
  @Test
  public void testViewEuropean() {
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n" + "    O O O", text2.toString());
    model2.move(3, 1, 3, 3);
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O _ _ O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n" + "    O O O", text2.toString());
  }

  // testing invalid text view with null model
  @Test(expected = IllegalArgumentException.class)
  public void invalidModelTextView() {
    MarbleSolitaireView inv_text = new MarbleSolitaireTextView(null);
  }

  // testing toString for English
  @Test
  public void testToStringEnglish() {
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n" + "    O O O", text.toString());
    text = new MarbleSolitaireTextView(new EnglishSolitaireModel(4, 4));
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O _ O O" + "\n"
            + "    O O O" + "\n" + "    O O O", text.toString());
    text = new MarbleSolitaireTextView(new EnglishSolitaireModel(5));
    assertEquals("        O O O O O" + "\n" +
            "        O O O O O" + "\n" +
            "        O O O O O" + "\n" +
            "        O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "O O O O O O _ O O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "        O O O O O" + "\n" +
            "        O O O O O" + "\n" +
            "        O O O O O" + "\n" +
            "        O O O O O", text.toString());
    text = new MarbleSolitaireTextView(new EnglishSolitaireModel(5, 7, 7));
    assertEquals("        O O O O O" + "\n" +
            "        O O O O O" + "\n" +
            "        O O O O O" + "\n" +
            "        O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "O O O O O O O _ O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "        O O O O O" + "\n" +
            "        O O O O O" + "\n" +
            "        O O O O O" + "\n" +
            "        O O O O O", text.toString());
  }

  // testing toString for European
  @Test
  public void testToStringEuropean() {
    text2 = new MarbleSolitaireTextView(new EuropeanSolitaireModel(4, 4));
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O O _ O O" + "\n"
            + "  O O O O O" + "\n" + "    O O O", text2.toString());
    text2 = new MarbleSolitaireTextView(new EuropeanSolitaireModel(5));
    assertEquals("        O O O O O" + "\n" +
            "      O O O O O O O" + "\n" +
            "    O O O O O O O O O" + "\n" +
            "  O O O O O O O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "O O O O O O _ O O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "  O O O O O O O O O O O" + "\n" +
            "    O O O O O O O O O" + "\n" +
            "      O O O O O O O" + "\n" +
            "        O O O O O", text2.toString());
    text2 = new MarbleSolitaireTextView(new EuropeanSolitaireModel(5, 7, 7));
    assertEquals("        O O O O O" + "\n" +
            "      O O O O O O O" + "\n" +
            "    O O O O O O O O O" + "\n" +
            "  O O O O O O O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "O O O O O O O _ O O O O O" + "\n" +
            "O O O O O O O O O O O O O" + "\n" +
            "  O O O O O O O O O O O" + "\n" +
            "    O O O O O O O O O" + "\n" +
            "      O O O O O O O" + "\n" +
            "        O O O O O", text2.toString());
  }

  // testing rendered board for english model
  @Test
  public void testRenderBoardEnglish() throws IOException {
    StringBuilder out = new StringBuilder();
    EnglishSolitaireModel sample = new EnglishSolitaireModel();
    MarbleSolitaireTextView textView = new MarbleSolitaireTextView(sample, out);
    textView.renderBoard();
    assertEquals("    O O O" + "\n"
            + "    O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "    O O O" + "\n"
            + "    O O O" + "\n", out.toString());
  }

  // testing rendered board for european model
  @Test
  public void testRenderBoardEuropean() throws IOException {
    StringBuilder out = new StringBuilder();
    EuropeanSolitaireModel sample = new EuropeanSolitaireModel();
    MarbleSolitaireTextView textView = new MarbleSolitaireTextView(sample, out);
    textView.renderBoard();
    assertEquals("    O O O" + "\n"
            + "  O O O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "O O O _ O O O" + "\n"
            + "O O O O O O O" + "\n"
            + "  O O O O O" + "\n"
            + "    O O O" + "\n", out.toString());
  }

  // testing rendered message for European
  @Test
  public void testRenderMessageEnglish() throws IOException {
    StringBuilder out = new StringBuilder();
    EnglishSolitaireModel sample = new EnglishSolitaireModel();
    MarbleSolitaireTextView textView = new MarbleSolitaireTextView(sample, out);
    textView.renderMessage("foobar");
    assertEquals("foobar", out.toString());
    textView.renderMessage("123");
    assertEquals("foobar123", out.toString());
  }

  // testing invalid message for European
  @Test
  public void testInvalidMessageEnglish() throws IOException {
    StringBuilder out = new StringBuilder();
    EnglishSolitaireModel sample = new EnglishSolitaireModel();
    MarbleSolitaireTextView textView = new MarbleSolitaireTextView(sample, out);
    textView.renderMessage(null);
    String s = "";
    assertEquals(s + null, out.toString());
  }

  // testing rendered message for european
  @Test
  public void testRenderMessageEuropean() throws IOException {
    StringBuilder out = new StringBuilder();
    EuropeanSolitaireModel sample = new EuropeanSolitaireModel();
    MarbleSolitaireTextView textView = new MarbleSolitaireTextView(sample, out);
    textView.renderMessage("foobar");
    assertEquals("foobar", out.toString());
    textView.renderMessage("123");
    assertEquals("foobar123", out.toString());
  }

  // testing invalid message for european
  @Test
  public void testInvalidMessageEuropean() throws IOException {
    StringBuilder out = new StringBuilder();
    EuropeanSolitaireModel sample = new EuropeanSolitaireModel();
    MarbleSolitaireTextView textView = new MarbleSolitaireTextView(sample, out);
    textView.renderMessage(null);
    String s = "";
    assertEquals(s + null, out.toString());
  }


}
import org.junit.Before;
import org.junit.Test;

import java.io.StringReader;

import cs3500.marblesolitaire.controller.MarbleSolitaireControllerImpl;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;

/**
 * Representation for an Abstract Controller test (to test shared methods among the models).
 */
public abstract class AbstractControllerTest {

  protected MarbleSolitaireModel normModel;

  @Before
  public abstract void init();

  // testing for bad inputs (empty str)
  @Test(expected = IllegalStateException.class)
  public void badInputs2() {
    Readable re = new StringReader("");
    Appendable app = new StringBuilder();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(normModel, app);
    MarbleSolitaireControllerImpl c = new MarbleSolitaireControllerImpl(normModel, view, re);
    c.playGame();
  }

  // testing null model
  @Test(expected = IllegalArgumentException.class)
  public void nullModel() {
    Readable re = new StringReader("");
    Appendable app = new StringBuilder();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(normModel, app);
    MarbleSolitaireControllerImpl c = new MarbleSolitaireControllerImpl(null, view, re);
    c.playGame();
  }

  // testing for null view
  @Test(expected = IllegalArgumentException.class)
  public void nullView() {
    Readable re = new StringReader("");
    MarbleSolitaireControllerImpl c = new MarbleSolitaireControllerImpl(normModel, null, re);
    c.playGame();
  }

  // testing for null reader
  @Test(expected = IllegalArgumentException.class)
  public void nullRead() {
    Appendable app = new StringBuilder();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(normModel, app);
    MarbleSolitaireControllerImpl c = new MarbleSolitaireControllerImpl(normModel, view, null);
    c.playGame();
  }

  // testing for bad inputs (ran out of inputs)
  @Test(expected = IllegalStateException.class)
  public void noMoreInputs() {
    Readable re = new StringReader("4 6 4 8");
    Appendable app = new StringBuilder();
    MarbleSolitaireTextView view = new MarbleSolitaireTextView(normModel, app);
    MarbleSolitaireControllerImpl c = new MarbleSolitaireControllerImpl(normModel, view, re);
    c.playGame();
  }
}

package cs3500.marblesolitaire.view;

import java.io.IOException;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;

/**
 * A Representation of a TriangleSolitaire Text view. Displays triangle marble solitaire.
 * Has a customizable model and has an appendable object. Overrides toString() method to print.
 */
public class TriangleSolitaireTextView implements MarbleSolitaireView {

  private final MarbleSolitaireModelState model;
  private final Appendable out;

  /**
   * A Constructor to initialize Marble Solitaire Text view.
   *
   * @param model represents which model we are using for marble solitaire
   * @throws IllegalArgumentException if model is null
   */
  public TriangleSolitaireTextView(MarbleSolitaireModelState model)
          throws IllegalArgumentException {
    if (model == null) {
      throw new IllegalArgumentException("Model is null");
    }
    this.model = model;
    this.out = null;
  }

  /**
   * A Constructor for MarbleSolitaireTextView.
   *
   * @param model the model of the game
   * @param out   the appendable object
   * @throws IllegalArgumentException if any of the objects are null
   */
  public TriangleSolitaireTextView(MarbleSolitaireModelState model, Appendable out)
          throws IllegalArgumentException {
    if (model == null || out == null) {
      throw new IllegalArgumentException("Model and/or Appendable object(s) are null");
    }
    this.model = model;
    this.out = out;
  }

  @Override
  public void renderBoard() throws IOException {
    this.out.append(this.toString() + "\n");
  }

  @Override
  public void renderMessage(String message) throws IOException {
    this.out.append(message);
  }

  @Override
  public String toString() {
    String board = "";
    for (int i = 0; i < model.getBoardSize(); i++) {
      for (int j = 0; j < model.getBoardSize() - 1 - i; j++) {
        board += " ";
      }
      for (int k = 0; k < model.getBoardSize(); k++) {
        if (model.getSlotAt(i, k) != MarbleSolitaireModelState.SlotState.Invalid) {
          if (k == i) {
            board += this.getBoardVal(model.getSlotAt(i, k));
          } else {
            board += this.getBoardVal(model.getSlotAt(i, k)) + " ";
          }
        }
      }
      if (i != model.getBoardSize() - 1) {
        board += "\n";
      }
    }
    return board;
  }

  private String getBoardVal(MarbleSolitaireModelState.SlotState s) {
    if (s == MarbleSolitaireModelState.SlotState.Marble) {
      return "O";
    } else if (s == MarbleSolitaireModelState.SlotState.Empty) {
      return "_";
    } else {
      return " ";
    }
  }
}


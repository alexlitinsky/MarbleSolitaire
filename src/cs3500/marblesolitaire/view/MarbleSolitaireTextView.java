package cs3500.marblesolitaire.view;

import java.io.IOException;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;

/**
 * A Representation for a MarbleSolitaire Text View.
 */
public class MarbleSolitaireTextView implements MarbleSolitaireView {
  private final MarbleSolitaireModelState model;
  private final Appendable out;

  /**
   * A Constructor to initialize Marble Solitaire Text view.
   *
   * @param model represents which model we are using for marble solitaire
   * @throws IllegalArgumentException if model is null
   */
  public MarbleSolitaireTextView(MarbleSolitaireModelState model) throws IllegalArgumentException {
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
  public MarbleSolitaireTextView(MarbleSolitaireModelState model, Appendable out)
          throws IllegalArgumentException {
    if (model == null || out == null) {
      throw new IllegalArgumentException("Model and/or Appendable object(s) are null");
    }
    this.model = model;
    this.out = out;
  }

  @Override
  public String toString() {
    String board = "";
    for (int i = 0; i < model.getBoardSize(); i++) {
      for (int j = 0; j < model.getBoardSize(); j++) {
        if (model.getSlotAt(i, j) == MarbleSolitaireModelState.SlotState.Invalid) {
          board += " ";
        }
        if (model.getSlotAt(i, j) == MarbleSolitaireModelState.SlotState.Marble) {
          board += "O";
          if (j < model.getBoardSize() - 1 && model.getSlotAt(i, j + 1)
                  == MarbleSolitaireModelState.SlotState.Invalid || j == model.getBoardSize() - 1) {
            break;
          }
        }
        if (model.getSlotAt(i, j) == MarbleSolitaireModelState.SlotState.Empty) {
          board += "_";
          if (j < model.getBoardSize() - 1 && model.getSlotAt(i, j + 1)
                  == MarbleSolitaireModelState.SlotState.Invalid || j == model.getBoardSize() - 1) {
            break;
          }
        }
        board += " ";
      }
      board += "\n";
    }
    return board.substring(0, board.length() - 1);
  }

  @Override
  public void renderBoard() throws IOException {
    this.out.append(this.toString() + "\n");


  }

  @Override
  public void renderMessage(String message) throws IOException {
    this.out.append(message);
  }

}

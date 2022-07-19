package cs3500.marblesolitaire.model.hw04;

import cs3500.marblesolitaire.model.hw02.AbstractMarbleSolitaireModel;

/**
 * Represents a unique version of Marble Solitaire: European Edition. Has similar constructors
 * in comparison to the English, except that, when creating the board, the edges are rounded out
 * into an octagon-like form. Can move up, down,left,and right.
 */
public class EuropeanSolitaireModel extends AbstractMarbleSolitaireModel {

  /**
   * A Constructor for European Solitaire.
   */
  public EuropeanSolitaireModel() {
    super(3, 3, 3);
  }

  /**
   * A Constructor for European Solitaire with custom arm length.
   *
   * @param armT the arm thickness
   * @throws IllegalArgumentException if arm thickness is invalid
   */
  public EuropeanSolitaireModel(int armT) throws IllegalArgumentException {
    super(armT, 3 * (armT / 2), 3 * (armT / 2));
    if (armT % 2 == 0) {
      throw new IllegalArgumentException("Can't have an even length.");
    }
  }

  /**
   * A Constructor for European Solitaire with custom empty.
   *
   * @param row the row of empty
   * @param col the col of empty
   */
  public EuropeanSolitaireModel(int row, int col) {
    super(3, row, col);
  }

  /**
   * A Constructor for European Solitaire with custom empty and arm thickness.
   *
   * @param armT the arm thickness
   * @param row  the row of empty
   * @param col  the col of empty
   */
  public EuropeanSolitaireModel(int armT, int row, int col) {
    super(armT, row, col);
    if (armT % 2 == 0) {
      throw new IllegalArgumentException("Can't have an even length.");
    }
  }

  @Override
  protected void createBoard(int armT, int sRow, int sCol) throws IllegalArgumentException {
    // overall length of the board
    this.length = (armT - 1) * 2 + armT;
    // corner lengths
    int cLen = armT - 1;
    int diag = -1;
    this.board = new SlotState[this.length][this.length];
    // iteration for board creation
    for (int i = 0; i < this.length; i++) {
      if (i < cLen + 1) {
        diag++;
      }
      if (i > cLen * 2) {
        diag--;
      }
      for (int j = 0; j < this.length; j++) {
        if ((j < cLen - diag) || (j > this.length - cLen + diag - 1)) {
          this.board[i][j] = SlotState.Invalid;
        } else {
          this.board[i][j] = SlotState.Marble;
        }
      }
    }
    // testing for invalid empty slot
    if (this.board[sRow][sCol] == SlotState.Invalid) {
      throw new IllegalArgumentException("Invalid empty cell position at ("
              + sRow + ", " + sCol + ")");
    } else {
      this.board[sRow][sCol] = SlotState.Empty;
    }
  }
}

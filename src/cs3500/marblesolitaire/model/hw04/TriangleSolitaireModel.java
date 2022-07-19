package cs3500.marblesolitaire.model.hw04;

import cs3500.marblesolitaire.model.hw02.AbstractMarbleSolitaireModel;

/**
 * A Representation of a Triangle Solitaire Model. Has a triangular board and
 * can make diagonal moves. Rest of the functionality is the same as
 * the other models.
 */
public class TriangleSolitaireModel extends AbstractMarbleSolitaireModel {

  /**
   * The default Triangle Solitaire Model.
   */
  public TriangleSolitaireModel() {
    super(5, 0, 0);
  }

  /**
   * A Triangle SolitaireModel for custom side length.
   *
   * @param armT the side length
   * @throws IllegalArgumentException if side length is not positive
   */
  public TriangleSolitaireModel(int armT) throws IllegalArgumentException {
    super(armT, 0, 0);
    if (armT <= 0) {
      throw new IllegalArgumentException("Invalid side length.");
    }
  }

  /**
   * A Triangle SolitaireModel for custom empty.
   *
   * @param sRow the row of empty
   * @param sCol the column of empty
   * @throws IllegalArgumentException if the empty position is invalid.
   */
  public TriangleSolitaireModel(int sRow, int sCol) throws IllegalArgumentException {
    super(5, sRow, sCol);
    if (sRow < 0 || sCol < 0 || sRow >= 5 || sCol >= 5) {
      throw new IllegalArgumentException("Invalid position.");
    }
  }

  /**
   * A Triangle SolitaireModel for custom empty and side length.
   *
   * @param armT the side length
   * @param sRow the row of empty
   * @param sCol the column of empty
   * @throws IllegalArgumentException if any of the parameters are invalid
   */
  public TriangleSolitaireModel(int armT, int sRow, int sCol) throws IllegalArgumentException {
    super(armT, sRow, sCol);
    if (armT < 0 || sRow < 0 || sCol < 0 || sRow >= armT || sCol >= armT) {
      throw new IllegalArgumentException("Invalid arguments (position or side length).");
    }

  }

  @Override
  protected void createBoard(int armT, int sRow, int sCol) throws IllegalArgumentException {
    this.length = armT;
    this.board = new SlotState[this.length][this.length];

    for (int i = 0; i < this.length; i++) {
      for (int j = 0; j < this.length; j++) {
        if (j > i) {
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

  @Override
  public void move(int fromRow, int fromCol, int toRow, int toCol) throws IllegalArgumentException {
    int val = this.validMove(fromRow, fromCol, toRow, toCol);
    if (val < 0) {
      throw new IllegalArgumentException("Can't move this marble.");
    }
    switch (val) {
      case 5:
        board[fromRow][fromCol] = SlotState.Empty;
        board[fromRow - 1][fromCol - 1] = SlotState.Empty;
        board[toRow][toCol] = SlotState.Marble;
        break;
      case 6:
        board[fromRow][fromCol] = SlotState.Empty;
        board[fromRow - 1][fromCol + 1] = SlotState.Empty;
        board[toRow][toCol] = SlotState.Marble;
        break;
      case 7:
        board[fromRow][fromCol] = SlotState.Empty;
        board[fromRow + 1][fromCol + 1] = SlotState.Empty;
        board[toRow][toCol] = SlotState.Marble;
        break;
      case 8:
        board[fromRow][fromCol] = SlotState.Empty;
        board[fromRow + 1][fromCol - 1] = SlotState.Empty;
        board[toRow][toCol] = SlotState.Marble;
        break;
      default:
        super.move(fromRow, fromCol, toRow, toCol);
    }
  }

  @Override
  protected int validMove(int fromRow, int fromCol, int toRow, int toCol) {

    if (super.validMove(fromRow, fromCol, toRow, toCol) > 0) {
      return super.validMove(fromRow, fromCol, toRow, toCol);
    } else {
      if (fromRow >= this.length || fromCol >= this.length || toRow >= this.length
              || toCol >= this.length) {
        return -1;
      }
      if (fromRow < 0 || fromCol < 0 || toRow < 0
              || toCol < 0) {
        return -1;
      }
      if (board[fromRow][fromCol] == SlotState.Marble && board[toRow][toCol] == SlotState.Empty &&
              (Math.abs(fromRow - toRow) == 2 && Math.abs(fromCol - toCol) == 2)) {
        if (fromRow < toRow && fromCol < toCol
                && board[fromRow + 1][fromCol + 1] == SlotState.Marble) { // lower right
          return 7;
        } else if (fromRow > toRow && fromCol > toCol
                && board[fromRow - 1][fromCol - 1] == SlotState.Marble) { // top left
          return 5;
        } else if (fromCol < toCol && fromRow > toRow
                && board[fromRow - 1][fromCol + 1] == SlotState.Marble) { // top right
          return 6;
        } else if (fromCol > toCol && fromRow < toRow
                && board[fromRow + 1][fromCol - 1] == SlotState.Marble) { // lower left
          return 8;
        } else {
          return -1;
        }
      } else {
        return -1;
      }
    }
  }

  @Override
  public boolean isGameOver() {
    boolean val = false;
    if (super.isGameOver()) {
      val = true;
    }
    for (int i = 0; i < this.length; i++) {
      for (int j = 0; j < this.length; j++) {
        if (i < 2 && j < 2) { // down right
          if (validMove(i, j, i + 2, j + 2) > 0) {
            return false;
          }
        } else if (i < 2 && j > this.length - 2) { // down left
          if (validMove(i, j, i + 2, j - 2) > 0) {
            return false;
          }
        } else if (i > this.length - 2 && j < 2) { // up right
          if (validMove(i, j, i - 2, j + 2) > 0) {
            return false;
          }
        } else if (i > this.length - 2 && j > this.length - 2) { // up left
          if (validMove(i, j, i - 2, j - 2) > 0) {
            return false;
          }
        } else { // down up right left
          if ((validMove(i, j, i + 2, j - 2) > 0)
                  || (validMove(i, j, i - 2, j - 2) > 0)
                  || (validMove(i, j, i + 2, j + 2) > 0)
                  || (validMove(i, j, i - 2, j + 2) > 0)) {
            return false;
          }
        }
      }
    }
    return val;
  }


}







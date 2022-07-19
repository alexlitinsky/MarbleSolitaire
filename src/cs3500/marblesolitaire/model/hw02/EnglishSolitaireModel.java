package cs3500.marblesolitaire.model.hw02;


/**
 * A Representation of English Solitaire. Has several constructors for customization.
 * Can play a game to completion (while keeping track of the score).
 * Can get the slot states of certain array indices. Can move up, down, left and right.
 */
public class EnglishSolitaireModel extends AbstractMarbleSolitaireModel
        implements MarbleSolitaireModel {

  /**
   * a general constructor for solitaire (default arm thickness of 3).
   */
  public EnglishSolitaireModel() {
    super(3, 3, 3);
    //this.createBoard(3, 3, 3);
  }

  /**
   * a constructor for solitaire with a custom row and column.
   *
   * @param sRow for Empty SlotState.
   * @param sCol column for Empty SlotState.
   * @throws IllegalArgumentException invalid empty slot given.
   */

  public EnglishSolitaireModel(int sRow, int sCol) throws IllegalArgumentException {
    //createBoard(3, sRow, sCol);
    super(3, sRow, sCol);
  }

  /**
   * a constructor of solitaire with a custom arm thickness.
   *
   * @param armT arm thickness of the board.
   * @throws IllegalArgumentException if arm thickness is even.
   */
  public EnglishSolitaireModel(int armT) throws IllegalArgumentException {
    super(armT, 3 * (armT / 2), 3 * (armT / 2));
    if (armT % 2 == 0) {
      throw new IllegalArgumentException("Can't have an even number arm thickness.");
    }

    //createBoard(armT, val, val);
    //super(armT, val, val);

  }

  /**
   * a constructor of solitaire with a custom arm thickness, row, and column.
   *
   * @param armT the arm thickness of a board.
   * @param sRow for Empty SlotState.
   * @param sCol column for Empty SlotState.
   * @throws IllegalArgumentException if arm thickness is even or the empty SlotState is invalid.
   */
  public EnglishSolitaireModel(int armT, int sRow, int sCol) throws IllegalArgumentException {
    super(armT, sRow, sCol);
    if (armT % 2 == 0) {
      throw new IllegalArgumentException("Can't have an even number arm thickness");
    }
    //createBoard(armT, sRow, sCol);

  }

  /**
   * creates a game board given an arm thickness, row, and column.
   *
   * @param armT arm thickness of the board.
   * @param sRow row for Empty SlotState.
   * @param sCol column for Empty SlotState.
   * @throws IllegalArgumentException if there's an invalid empty cell position at sRow and sCol.
   */
  protected void createBoard(int armT, int sRow, int sCol) throws IllegalArgumentException {
    // overall length of the board
    this.length = (armT - 1) * 2 + armT;
    // corner lengths
    int cLen = armT - 1;
    this.board = new SlotState[this.length][this.length];
    // iteration for board creation
    for (int i = 0; i < this.length; i++) {
      for (int j = 0; j < this.length; j++) {
        if ((i < cLen && j < cLen) || (i > this.length - cLen - 1
                && j < cLen) || (i < cLen && j > this.length - cLen - 1)
                || (i > this.length - cLen - 1 && j > this.length - cLen - 1)) {
          board[i][j] = SlotState.Invalid;
        } else {
          board[i][j] = SlotState.Marble;
        }
      }
    }
    // testing for invalid empty slot
    if (board[sRow][sCol] == SlotState.Invalid) {
      throw new IllegalArgumentException("Invalid empty cell position at ("
              + sRow + ", " + sCol + ")");
    } else {
      board[sRow][sCol] = SlotState.Empty;
    }
  }

}

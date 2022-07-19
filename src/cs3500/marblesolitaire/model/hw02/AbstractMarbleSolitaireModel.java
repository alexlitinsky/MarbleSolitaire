package cs3500.marblesolitaire.model.hw02;

/**
 * A Representation of an AbstractMarbleSolitaire Model. Has a constructor for arm thickness,
 * row, and col. Has instances variables to represent the state and length of the board. Has a
 * move function to move marbles around the board. Has a game over function to test whether the game
 * is over. has a getScore method to get the score of the current game. Has a getSlotState to get
 * a specific slot state of the game.
 */
public abstract class AbstractMarbleSolitaireModel implements MarbleSolitaireModel {

  //instance variables
  protected SlotState[][] board;
  protected int length;

  /**
   * a normal constructor for marble solitaire type games.
   *
   * @param armT the arm length
   * @param sRow the row of empty
   * @param sCol the column of empty
   */
  public AbstractMarbleSolitaireModel(int armT, int sRow, int sCol)
          throws IllegalArgumentException {
    if (armT <= 0) {
      throw new IllegalArgumentException("Invalid arm thickness.");
    } else {
      try {
        createBoard(armT, sRow, sCol);
      } catch (ArrayIndexOutOfBoundsException i) {
        throw new IllegalArgumentException("Invalid empty position.");
      }
    }
  }

  /**
   * An abstract method to create a board for a specific concrete implementation.
   *
   * @param armT the arm thickness of the board
   * @param sRow the row of empty
   * @param sCol the col of empty
   */
  abstract protected void createBoard(int armT, int sRow, int sCol);

  @Override
  public void move(int fromRow, int fromCol, int toRow, int toCol) throws IllegalArgumentException {
    int val = validMove(fromRow, fromCol, toRow, toCol);
    if (val < 0) {
      throw new IllegalArgumentException("Can't move this marble.");
    }

    switch (val) {
      case 1:
        board[fromRow][fromCol] = SlotState.Empty;
        board[fromRow][fromCol + 1] = SlotState.Empty;
        board[toRow][toCol] = SlotState.Marble;
        break;
      case 2:
        board[fromRow][fromCol] = SlotState.Empty;
        board[fromRow - 1][fromCol] = SlotState.Empty;
        board[toRow][toCol] = SlotState.Marble;
        break;
      case 3:
        board[fromRow][fromCol] = SlotState.Empty;
        board[fromRow][fromCol - 1] = SlotState.Empty;
        board[toRow][toCol] = SlotState.Marble;
        break;
      case 4:
        board[fromRow][fromCol] = SlotState.Empty;
        board[fromRow + 1][fromCol] = SlotState.Empty;
        board[toRow][toCol] = SlotState.Marble;
        break;
      default:
        // do nothing
    }
  }

  /**
   * checks if we can move a marble to a certain row and column.
   *
   * @param fromRow the original row of the marble.
   * @param fromCol the original column of the marble.
   * @param toRow   the row where we move the marble.
   * @param toCol   the column where we move the marble.
   * @return an integer marking which marble and empty slots to switch, -1 otherwise
   */
  protected int validMove(int fromRow, int fromCol, int toRow, int toCol) {
    if (fromRow >= this.length || fromCol >= this.length || toRow >= this.length
            || toCol >= this.length) {
      return -1;
    }
    if (fromRow < 0 || fromCol < 0 || toRow < 0
            || toCol < 0) {
      return -1;
    }
    if (board[fromRow][fromCol] == SlotState.Marble && board[toRow][toCol] == SlotState.Empty &&
            (Math.abs(fromRow - toRow) == 2 || Math.abs(fromCol - toCol) == 2)) {
      if (fromRow == toRow && fromCol < toCol && board[fromRow][fromCol + 1] == SlotState.Marble) {
        return 1;
      } else if (fromRow == toRow && fromCol > toCol
              && board[fromRow][fromCol - 1] == SlotState.Marble) {
        return 3;
      } else if (fromCol == toCol && fromRow > toRow
              && board[fromRow - 1][fromCol] == SlotState.Marble) {
        return 2;
      } else if (fromCol == toCol && fromRow < toRow
              && board[fromRow + 1][fromCol] == SlotState.Marble) {
        return 4;
      } else {
        return -1;
      }
    } else {
      return -1;
    }
  }

  @Override
  public boolean isGameOver() {
    for (int i = 0; i < this.length; i++) {
      for (int j = 0; j < this.length; j++) {
        // can increase rows and columns
        if (i < 2) {
          if (validMove(i, j, i + 2, j) > 0) {
            return false;
          }
        } else if (i > this.length - 3) {
          if (validMove(i, j, i - 2, j) > 0) {
            return false;
          }
        } else {
          if (validMove(i, j, i - 2, j) > 0 || validMove(i, j, i + 2, j) > 0) {
            return false;
          }
        }
        if (j < 2) {
          if (validMove(i, j, i, j + 2) > 0) {
            return false;
          }
        } else if (j > this.length - 3) {
          if (validMove(i, j, i, j - 2) > 0) {
            return false;
          }
        } else {
          if (validMove(i, j, i, j + 2) > 0 || validMove(i, j, i, j - 2) > 0) {
            return false;
          }
        }
      }
    }
    return true;
  }

  @Override
  public int getBoardSize() {
    return this.length;
  }

  @Override
  public SlotState getSlotAt(int row, int col) throws IllegalArgumentException {
    return board[row][col];
  }

  @Override
  public int getScore() {
    int score = 0;
    for (int i = 0; i < this.length; i++) {
      for (int j = 0; j < this.length; j++) {
        if (board[i][j] == SlotState.Marble) {
          score++;
        }
      }
    }
    return score;
  }
}

package cs3500.marblesolitaire.controller;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireView;

/**
 * A Representation an implementation of a MarbleSolitaireController that stores input and output
 * from the system, and a model for a sample controller with a constructor that initializes the
 * controller given a view, model, and readable input. Has a method to actively play the game.
 */
public class MarbleSolitaireControllerImpl implements MarbleSolitaireController {
  private final MarbleSolitaireModel model;
  private final MarbleSolitaireView view;
  private final Readable in;

  /**
   * A Marble SolitaireController Implementation constructor.
   *
   * @param model the model of a game
   * @param view  the view of the game
   * @param in    the input of the game
   * @throws IllegalArgumentException if any of the mode, view, or in params are null
   */
  public MarbleSolitaireControllerImpl(MarbleSolitaireModel model,
                                       MarbleSolitaireView view, Readable in)
          throws IllegalArgumentException {
    if (model == null || view == null || in == null) {
      throw new IllegalArgumentException("One of model, view, and/or readable object(s) are null.");
    }
    this.model = model;
    this.view = view;
    this.in = in;
  }

  @Override
  public void playGame() throws IllegalStateException {
    Scanner scan = new Scanner(this.in);

    // tracking index and positions for move()
    int pos_ind = 0;
    int[] arr_pos = new int[4];


    // checking for null model
    if (model == null) {
      throw new IllegalArgumentException("Can't have a null model.");
    }

    try {
      this.view.renderBoard();
      this.view.renderMessage("Score: " + this.model.getScore() + "\n"); // do I need this \n?
    } catch (IOException e) {
      throw new IllegalStateException("Can't render output.");
    }
    // main loop (while game isn't over)
    while (!this.model.isGameOver()) {
      // while not all positions of the array have been filled
      while (pos_ind != 4) {
        String inp;
        try {
          inp = scan.next();
        } catch (NoSuchElementException e) {
          throw new IllegalStateException("No more inputs remaining.");
        }
        // trying to get an integer or "q"
        try {
          if (inp.equalsIgnoreCase("q")) {
            try {
              this.view.renderMessage("Game quit!" + "\n");
              this.view.renderMessage("State of game when quit:" + "\n");
              this.view.renderBoard();
              this.view.renderMessage("Score: " + this.model.getScore()); // score marker
              return;
            } catch (IOException e) {
              throw new IllegalStateException("Can't render output.");
            }
          } else if (Integer.parseInt(inp) > 0) {
            arr_pos[pos_ind] = Integer.parseInt(inp) - 1;
            pos_ind++;
          } else {
            try {
              this.view.renderMessage("Please enter a integer(s) as an input." + "\n");
            } catch (IOException e) {
              throw new IllegalStateException("Can't render output.");
            }
          }
        } catch (NumberFormatException nfe) { // if improper input isn't received
          try {
            this.view.renderMessage("Please enter a integer(s) as an input." + "\n");
          } catch (IOException e) {
            throw new IllegalStateException("Can't render output.");
          }
        }
      }
      try {
        // attempts to make a move
        try {
          this.model.move(arr_pos[0], arr_pos[1], arr_pos[2], arr_pos[3]);
          this.view.renderMessage("\n");
        } catch (IOException e) {
          throw new IllegalStateException("Can't render output.");
        }
      } catch (IllegalArgumentException i) {
        try {
          this.view.renderMessage("Invalid move. Play again. Please enter a valid row and column.");
        } catch (IOException e) {
          throw new IllegalStateException("Can't render output.");
        }
      }
      // rendering the board for display
      try {
        this.view.renderBoard();
        this.view.renderMessage("\n" + "Score: " + this.model.getScore() + "\n");
      } catch (IOException e) {
        throw new IllegalStateException("Can't render output.");
      }
      // resetting position
      pos_ind = 0;
    }

    scan.close();
    // checking end game condition
    if (this.model.isGameOver()) {
      try {
        this.view.renderMessage("Game over!" + "\n");
        this.view.renderBoard();
        this.view.renderMessage("Score: " + this.model.getScore()); // score counter
      } catch (IOException e) {
        throw new IllegalStateException("Can't render output.");
      }
    }
  }
}

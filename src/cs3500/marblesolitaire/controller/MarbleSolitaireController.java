package cs3500.marblesolitaire.controller;


/**
 * An interface for a Marble Solitaire Controller.
 */
public interface MarbleSolitaireController {

  /**
   * Plays a new game of Marble Solitaire.
   *
   * @throws IllegalStateException if controller can't read input or transmit output
   */
  void playGame() throws IllegalStateException;
}

package cs3500.marblesolitaire.controller;

import java.util.ArrayList;
import java.util.List;

import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;
import cs3500.marblesolitaire.view.MarbleSolitaireGuiView;


/**
 * Represents a GUI controller.
 */
public class GUIController implements ControllerFeatures {

  private MarbleSolitaireGuiView view;
  private MarbleSolitaireModel model;

  private int[] from;


  public GUIController(MarbleSolitaireGuiView view, MarbleSolitaireModel model) {
    this.view = view;
    this.model = model;
    this.view.addFeature(this);
    this.from = new int[2];
  }


  @Override
  public void takeRowCol(int row, int col) {

      if (this.model.getSlotAt(row, col) == MarbleSolitaireModelState.SlotState.Marble)  {
        from[0] = row;
        from[1] = col;
      } else {
        try {
          this.model.move(from[0], from[1], row, col);
          this.view.refresh();
          from[0] = 0;
          from[1] = 0;
        } catch (IllegalArgumentException i) {
          this.view.renderMessage("Couldn't make move.");
        }
      }
      if (model.isGameOver()) { this.view.renderMessage("Game is over!"); }


    }

}

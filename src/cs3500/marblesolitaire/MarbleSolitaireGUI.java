package cs3500.marblesolitaire;

import cs3500.marblesolitaire.controller.ControllerFeatures;
import cs3500.marblesolitaire.controller.GUIController;
import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.view.SwingGuiView;

/**
 * Represents a GUI for Marble Solitaire.
 */
public class MarbleSolitaireGUI {
  /**
   * The main method of the gui.
   * @param args the args of the main method
   */
  public static void main(String[] args) {

    MarbleSolitaireModel model = new EnglishSolitaireModel();
    SwingGuiView view = new SwingGuiView(model);
    ControllerFeatures feat = new GUIController(view, model);
    view.addFeature(feat);

  }
}

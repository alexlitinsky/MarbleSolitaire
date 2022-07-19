package cs3500.marblesolitaire;

import java.io.InputStreamReader;

import cs3500.marblesolitaire.controller.MarbleSolitaireControllerImpl;
import cs3500.marblesolitaire.model.hw02.EnglishSolitaireModel;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModel;
import cs3500.marblesolitaire.model.hw04.EuropeanSolitaireModel;
import cs3500.marblesolitaire.model.hw04.TriangleSolitaireModel;
import cs3500.marblesolitaire.view.MarbleSolitaireTextView;
import cs3500.marblesolitaire.view.TriangleSolitaireTextView;

/**
 * Represents a MarbleSolitaire-like game.
 */
public final class MarbleSolitaire {
  /**
   * The main method of the game.
   *
   * @param args the arguments being entered within the terminal
   */
  public static void main(String[] args) {
    String text = "";
    int row = 0;
    int col = 0;
    int length = 0;
    boolean isTriangle = false;
    if (args[0].equals("english") || args[0].equals("european")) {
      text = args[0];
      length = 3;
      row = 3;
      col = 3;

    } else if (args[0].equals("triangular")) {
      text = args[0];
      length = 5;
      isTriangle = true;
    }

    if (args.length > 1 && args[1].equals("-size") && !isTriangle) {
      length = Integer.parseInt(args[2]);
      row = 3 * (Integer.parseInt(args[2]) / 2);
      col = 3 * (Integer.parseInt(args[2]) / 2);
    } else if (args.length > 2 && args[1].equals("-hole")) {
      row = Integer.parseInt(args[2]) - 1;
      col = Integer.parseInt(args[3]) - 1;
    }
    if (args.length > 1 && args[1].equals("-size") && isTriangle) {
      length = Integer.parseInt(args[2]);
    }

    if (args.length > 4 && args[4].equals("-size")) {
      length = Integer.parseInt(args[5]);
    } else if (args.length > 5 && args[3].equals("-hole")) {
      row = Integer.parseInt(args[4]) - 1;
      col = Integer.parseInt(args[5]) - 1;
    }


    // USE STRING READER TO TEST SPECIFIC IMPLEMENTATION ONCE RUN
    // USE INPUT STREAM READER OTHERWISE
    //StringReader reader = new StringReader("q");
    InputStreamReader reader = new InputStreamReader(System.in);

    switch (text) {
      case "english":
        MarbleSolitaireModel english = new EnglishSolitaireModel(length, row, col);
        Appendable app = new StringBuilder();
        MarbleSolitaireTextView view1 = new MarbleSolitaireTextView(english, app);
        MarbleSolitaireControllerImpl controller1 =
                new MarbleSolitaireControllerImpl(english, view1, reader);
        controller1.playGame();
        System.out.println(view1.toString());
        break;
      case "european":
        MarbleSolitaireModel european = new EuropeanSolitaireModel(length, row, col);
        Appendable app2 = new StringBuilder();
        MarbleSolitaireTextView view2 = new MarbleSolitaireTextView(european, app2);
        MarbleSolitaireControllerImpl controller2 =
                new MarbleSolitaireControllerImpl(european, view2, reader);
        controller2.playGame();
        System.out.println(view2.toString());
        break;
      case "triangular":
        MarbleSolitaireModel triangular = new TriangleSolitaireModel(length, row, col);
        Appendable app3 = new StringBuilder();
        TriangleSolitaireTextView view3 = new TriangleSolitaireTextView(triangular, app3);
        MarbleSolitaireControllerImpl controller3 =
                new MarbleSolitaireControllerImpl(triangular, view3, reader);
        controller3.playGame();
        System.out.println(view3.toString());
        break;
      default:
        // do nothing
    }


  }
}

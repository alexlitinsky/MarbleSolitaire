package cs3500.marblesolitaire.view;


import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.FileInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

import javax.swing.JPanel;

import cs3500.marblesolitaire.controller.ControllerFeatures;
import cs3500.marblesolitaire.model.hw02.MarbleSolitaireModelState;

/**
 * Represents a Board Panel.
 */
public class BoardPanel extends JPanel implements IBoard {
  private MarbleSolitaireModelState modelState;
  private Image emptySlot;
  private Image marbleSlot;
  private Image blankSlot;
  private final int cellDimension;

  private  ControllerFeatures feat;


  /**
   * A Constructor for a board panel.
   *
   * @param state the state of the board
   * @throws IllegalStateException if the state is invalid.
   */
  public BoardPanel(MarbleSolitaireModelState state) throws IllegalStateException {
    super();
    this.modelState = state;
    this.setBackground(Color.WHITE);
    this.cellDimension = 50;
    try {
      emptySlot = ImageIO.read(new FileInputStream("res/empty.png"));
      emptySlot = emptySlot.getScaledInstance(cellDimension, cellDimension, Image.SCALE_DEFAULT);

      marbleSlot = ImageIO.read(new FileInputStream("res/marble.png"));
      marbleSlot = marbleSlot.getScaledInstance(cellDimension, cellDimension, Image.SCALE_DEFAULT);

      blankSlot = ImageIO.read(new FileInputStream("res/blank.png"));
      blankSlot = blankSlot.getScaledInstance(cellDimension, cellDimension, Image.SCALE_DEFAULT);

      this.setPreferredSize(
              new Dimension((this.modelState.getBoardSize() + 4) * cellDimension
                      , (this.modelState.getBoardSize() + 4) * cellDimension));
    } catch (IOException e) {
      throw new IllegalStateException("Icons not found!");
    }

  }

  @Override
  protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    int originX = (int) (this.getPreferredSize().getWidth() / 2
            - this.modelState.getBoardSize() * cellDimension / 2);
    int originY = (int) (this.getPreferredSize().getHeight() / 2
            - this.modelState.getBoardSize() * cellDimension / 2);


    //your code to the draw the board should go here. 
    //The originX and originY is the top-left of where the cell (0,0) should start
    //cellDimension is the width (and height) occupied by every cell


    for (int i = 0; i < modelState.getBoardSize(); i++) {
      for (int j = 0; j < modelState.getBoardSize(); j++) {
        if (modelState.getSlotAt(i, j) == MarbleSolitaireModelState.SlotState.Invalid) {
          g.drawImage(blankSlot, originX + i * cellDimension, originY + j * cellDimension, new JPanel());
        }
        if (modelState.getSlotAt(i, j) == MarbleSolitaireModelState.SlotState.Marble) {
          g.drawImage(marbleSlot, originX + i * cellDimension, originY + j * cellDimension, new JPanel());
          if (j < modelState.getBoardSize() - 1 && modelState.getSlotAt(i, j + 1)
                  == MarbleSolitaireModelState.SlotState.Invalid
                  || j == modelState.getBoardSize() - 1) {
            break;
          }
        }
        if (modelState.getSlotAt(i, j) == MarbleSolitaireModelState.SlotState.Empty) {
          g.drawImage(emptySlot, originX + i * cellDimension, originY + j * cellDimension, new JPanel());
          if (j < modelState.getBoardSize() - 1 && modelState.getSlotAt(i, j + 1)
                  == MarbleSolitaireModelState.SlotState.Invalid
                  || j == modelState.getBoardSize() - 1) {
            break;
          }
        }
      }
    }

  }


  @Override
  public void acceptFeature(ControllerFeatures feat) {
    this.feat = feat;
    this.addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        int originX = (int) (getPreferredSize().getWidth() / 2
                - modelState.getBoardSize() * cellDimension / 2);
        int originY = (int) (getPreferredSize().getHeight() / 2
                - modelState.getBoardSize() * cellDimension / 2);
        feat.takeRowCol((-originX + e.getX()) / cellDimension, (-originY + e.getY()) / cellDimension);
      }

    });
  }
}
package MainProg;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import java.awt.*;

public class MainPanel extends JPanel {
  /**||===========================||
   * ||    variabeldeklaration    ||
     ||===========================*/
    private int width = 1098;//breddmått på panel
    private int height = 998;//höjdmått på panel.. båda 2 pixlar mindre än frame

    private JPanel pnlTop;//där menubar ska va
    private JPanel pnlCenter;//där textfield ska va

    private JMenuBar menuBarNew;//vänster knapp
    private JMenuBar menuBarSave;//höger knapp

    private JTextArea mainTxtArea;//där textOutput ska vara

    BorderLayout layout;

    public MainPanel(){
        setLayout(new BorderLayout());

        setPreferredSize(new Dimension(width, height));
        CreateComponents();
      // setupPanel();

    }

    private void CreateComponents() {
        JLabel lblNew = new JLabel("New");
        JLabel lblSave = new JLabel("Save");

        menuBarNew = new JMenuBar();
        menuBarSave = new JMenuBar();

        GridLayout layoutTop = new GridLayout(1,2,2,2);
        pnlTop = new JPanel(layoutTop);
        pnlTop.setPreferredSize(new Dimension(998, 20));

        pnlTop.add(lblNew);
        pnlTop.add(lblSave);

        lblNew.add(menuBarNew);
        lblSave.add(menuBarSave);
        menuBarSave.setVisible(true);

        add(pnlTop, BorderLayout.NORTH);

    }
    private void setupPanel() {
        add(pnlCenter, layout.CENTER);
        pnlCenter.add(mainTxtArea);
        layout = new BorderLayout();
        setLayout(layout);
        Border border = this.getBorder();
        Border margin = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(new CompoundBorder(border, margin));

    }
        public void setMainTxtArea(String text){
        mainTxtArea.setText(text);
    }

}


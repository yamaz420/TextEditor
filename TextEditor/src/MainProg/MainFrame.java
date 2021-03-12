package MainProg;

import javax.swing.*;

public class MainFrame extends JFrame {
    private int width = 1100;
    private int height = 1000;

    MainPanel panel;


    public MainFrame(){
        setupFrame();

    }
    public void setupFrame(){
        final int offsetX = width/2;
        final int offsetY = height/2;

        setSize(width,height);
        setTitle("TextEditor");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocation(offsetX, offsetY);

        panel = new MainPanel();
        setContentPane(panel);
        pack();

        setVisible(true);

    }
}

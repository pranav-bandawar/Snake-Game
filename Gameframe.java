import javax.swing.*;

public class GameFrame  extends JFrame {
    GameFramerame(){
        Gamepanel gamepanel = new Gamepanel();

        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);

    }
}

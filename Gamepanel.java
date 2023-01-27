import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Gamepanel extends JPanel implements ActionListener {
    static final int SCREEN_WIDTH =600;
    static final int SCREEN_HEIGHT =600;
    static final int UNIT_SIZE =25;
    static final int GAME_UNITS =(SCREEN_HEIGHT*SCREEN_WIDTH)/UNIT_SIZE;
    static final int DELAY=75;
    final int x[] = new int[GAME_UNITS];
    final int y[] = new int[GAME_UNITS];
    int bodyparts =6;
    int appleeaten =0;
    int appleX ;
    int appley;
    char direction ='R';
    boolean running =false;
    Timer timer;
    Random random;

    Gamepanel(){
        random =new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_WIDTH));
        this.setBackground(Color.BLACK);
        this.setFocusable(true);
        this.addKeyListener(new Mykeyadapter());
        startGame();

    }
    public void startGame(){
        newapple();
        running=true;
        timer =new Timer(DELAY,this);
        timer.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        draw(g);


    }
    public void draw(Graphics g){

    }
    public void newapple(){

    }
    public void move(){

    }
    public void checkApple(){

    }
    public void checkCollision(){

    }
    public void gameOver(){

    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    public  class Mykeyadapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e){

        }
    }
}

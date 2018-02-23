import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

public class MothFrame extends JComponent implements KeyListener{
    private int x=400;
    private int y=300;
    private ArrayList<KeyEvent> keysPressed;
    public static void main(String[] args) {
        JFrame window = new JFrame("First Graphics");
        MothFrame graphical = new MothFrame();
        window.add(graphical);
        window.pack();
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
        window.addKeyListener(graphical);
    }
    public MothFrame(){
        this.addKeyListener(this);
    }
    public Dimension getPreferredSize() {
        return new Dimension(800, 600);
    }
    public void paintComponent(Graphics g){
        g.setColor(new Color(3, 138, 4));
        g.fillRect(x, y, 30, 30);
    }
    public void keyReleased(KeyEvent e){
        keysPressed.remove(e);
    }
    public void keyPressed(KeyEvent e){
        keysPressed.add(e);
        if(e.getKeyCode()==KeyEvent.VK_RIGHT){
            x++;
            repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_LEFT){
            x--;
            repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_UP){
            y--;
            repaint();
        }
        if(e.getKeyCode()==KeyEvent.VK_DOWN){
            y++;
            repaint();
        }
    }
    public void keyTyped(KeyEvent e){

    }
}

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener
{
    private boolean[] keys = new boolean[120];
    public boolean up, down, left, right;

    public void update() {
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_S];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_D];


        if(up)
            System.out.println("UP");
        else if(down)
            System.out.println("DOWN");
        else if(left)
            System.out.println("LEFT");
        else if(right)
            System.out.println("RIGHT");
    }

    public void keyPressed(KeyEvent e)
    {
        keys[e.getKeyCode()] = true;
    }

    public void keyReleased(KeyEvent e)
    {
        keys[e.getKeyCode()] = false;
    }

    public void keyTyped(KeyEvent e){}
}

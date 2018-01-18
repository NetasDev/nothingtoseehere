import java.awt.event.KeyEvent;

public class Keyboard
{
    private boolean[] keys = new boolean[120];
    public boolean up, down, left, right;

    public void update()
    {
        up = keys[KeyEvent.VK_W];
        down = keys[KeyEvent.VK_D];
        left = keys[KeyEvent.VK_A];
        right = keys[KeyEvent.VK_R];
    }

    public void keyPressed(KeyEvent e)
    {
        keys[e.getKeyCode()] = true;
    }

    public void keyReleased(KeyEvent e)
    {
        keys[e.getKeyCode()] = false;
    }

    public void keyTyepd(KeyEvent e){}
}

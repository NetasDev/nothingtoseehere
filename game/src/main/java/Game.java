import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.util.EventListener;

public class Game extends Canvas implements Runnable, EventListener
{
    public JFrame frame;
    private Keyboard keyboard;
    private Window window;

    private int width = 800;
    private int height = 600;

    private BufferedImage bufferedImage;
    private int[] pixels;

    private boolean running = false;

    public Game()
    {
        window = new Window(width, height);
        frame = new JFrame();
        keyboard = new Keyboard();

        frame.setTitle("Unser Game");
        frame.setResizable(false);
        frame.add(this);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(width,height);
        frame.setFocusable(true);
        frame.setVisible(true);

        addKeyListener(keyboard);

        bufferedImage = new BufferedImage(width,height, BufferedImage.TYPE_INT_RGB);
        pixels = ((DataBufferInt) bufferedImage.getRaster().getDataBuffer()).getData();
    }


    public void run()
    {
        running = true;

        while(running)
        {
            update();
            draw();
        }
    }

    private void update()
    {
        keyboard.update();
    }

    private void draw()
    {
        BufferStrategy bufferStrategy = getBufferStrategy();
        if(bufferStrategy == null)
        {
            createBufferStrategy(3);
            return;
        }

        window.clear();
        window.fillPixels();

        Graphics graphics = bufferStrategy.getDrawGraphics();

        for(int i = 0; i < pixels.length; i++)
        {
            pixels[i] = window.pixels[i];
        }

        graphics.drawImage(bufferedImage, 0,0, width, height, null);

        graphics.dispose();
        bufferStrategy.show();
    }
}

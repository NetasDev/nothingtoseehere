import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;

@SuppressWarnings("serial")
public class Main extends JPanel {

    @Override
    public void paint(Graphics g){
        Graphics2D gra = (Graphics2D) g;
        gra.setColor(Color.RED);
        gra.drawOval(10,5,70,50);
        gra.draw(new Ellipse2D.Double(0,40,20,20));
        doppelkreis a = new doppelkreis(50,50,50,80,30,30);
        a.drawhere((Graphics2D) g);


    }

    private void moveObjects(){


    }

    public static void main(String[] args){
        JFrame frame = new JFrame("Unser game");
        frame.add(new Main());
        frame.setSize(1000,1000);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}

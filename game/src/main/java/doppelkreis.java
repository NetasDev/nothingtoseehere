import java.awt.*;

public class doppelkreis extends Objekts{
    public int Xr;
    public int Xl;
    public int Yr;
    public int Yl;
    public int Rr;
    public int Rl;

    public doppelkreis(int Xre,int Xli,int Yre,int Yli,int Rre,int Rli) {
    Xr = Xre;
    Xl = Xli;
    Yr = Yre;
    Yl = Yli;
    Rr = Rre;
    Rl = Rli;
    }
    @Override
    public void drawhere(Graphics2D g){
        Graphics2D gra = (Graphics2D) g;
        gra.drawOval(Xr,Yr,Rr,Rr);
        gra.drawOval(Xl,Yl,Rl,Rl);

    }

}

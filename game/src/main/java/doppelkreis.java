import java.awt.*;

public class doppelkreis {
    public static int Xr;
    public static int Xl;
    public static int Yr;
    public static int Yl;
    public static int Rr;
    public static int Rl;

    public doppelkreis(int Xre,int Xli,int Yre,int Yli,int Rre,int Rli) {
    Xr = Xre;
    Xl = Xli;
    Yr = Yre;
    Yl = Yli;
    Rr = Rre;
    Rl = Rli;
    }

    public static void drawnow(Graphics2D g){
        Graphics2D gra = (Graphics2D) g;
        gra.drawOval(Xr,Yr,Rr,Rr);
        gra.drawOval(Xl,Yl,Rl,Rl);

    }

}

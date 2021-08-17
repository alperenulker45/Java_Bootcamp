package Gun42.Ornek5;

public class Dikdortgen implements IGeometri {


    @Override
    public double alan(int... dizi) {
        double alan=0;
        if (dizi.length<2)
        alan = Math.pow(dizi[0],2);
        else alan=dizi[0]*dizi[1];
        return alan;
    }

    @Override
    public double cevre(int... dizi) {
        double cevre=0;
        if (dizi.length<2)
            cevre = 2*dizi[0];
        else cevre=2*(dizi[0]+dizi[1]);
        return cevre;
    }
}

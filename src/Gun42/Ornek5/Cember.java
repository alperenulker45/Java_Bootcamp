package Gun42.Ornek5;

public class Cember implements IGeometri {

    @Override
    public double alan(int... dizi) {
        return Math.PI*Math.pow(dizi[0], 2);
    }

    @Override
    public double cevre(int... dizi) {
        return 2*Math.PI*dizi[0];
    }
}

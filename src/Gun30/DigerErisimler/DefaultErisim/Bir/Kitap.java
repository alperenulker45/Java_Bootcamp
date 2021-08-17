package Gun30.DigerErisimler.DefaultErisim.Bir;

public class Kitap {

    String name;//basina public private gbi birsey yazmadigimizdan String name de defaul olur

    Kitap(){//default olusturduk
    }

    public Kitap (String name) {//public constructor olusturduk
        this.name=name;
    }
}

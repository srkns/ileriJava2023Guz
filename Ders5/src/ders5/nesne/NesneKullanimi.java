package ders5.nesne;

import ders5.degistirici.*;

public class NesneKullanimi {

    public static void main(String[] args) {
        OrnekSinif ornekNesne = new OrnekSinif(1);
        System.out.println(ornekNesne.sira);

        OrnekSinif ornekNesne2 = new OrnekSinif(2);
        System.out.println(ornekNesne2.sira);

        DegistiriciOrnekSinif degistiriciOrnekSinif = new DegistiriciOrnekSinif();



        //ornekNesne.sira = 1;
        //ornekNesne2.sira = 2;

        //System.out.println(ornekNesne.sira);
        //System.out.println(ornekNesne2.sira);

        OrnekSinif2.statikMetod(); // Math.random();

        OrnekSinif2 ornekNesne3 = new OrnekSinif2();
        ornekNesne3.publicMetod();

    }

}

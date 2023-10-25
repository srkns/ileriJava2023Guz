public class Methods {

    public static void main(String[] args) {

        int sayi = 5;
        //int sayi1faktoriyelSonucu = faktoriyelHesapla(sayi);
        //System.out.println(sayi + "! = " + sayi1faktoriyelSonucu);
        System.out.println(sayi + "! = " + faktoriyelHesapla(sayi));

        int sayi2 = 7;
        System.out.println(sayi2 + "! = " + faktoriyelHesapla(sayi2));

    }

    static int faktoriyelHesapla(int sayi) {
        int sonuc = 1;
        for(int i = 1; i <= sayi; i++) {
            sonuc = sonuc * i;
        }
        //System.out.println(sayi + "! = " + sonuc);
        return sonuc;
    }

}

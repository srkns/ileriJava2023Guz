public class Recursion {

    public static void main(String[] args) {
        System.out.println("SONUC: " + faktoriyelHesapla(3));
    }

    static int faktoriyelHesapla(int sayi) {
        if (sayi == 0) {
            return 1;
        }
        return sayi * faktoriyelHesapla(sayi - 1);
    }

}

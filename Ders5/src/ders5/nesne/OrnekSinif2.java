package ders5.nesne;

public class OrnekSinif2 {

    static void statikMetod() {
        System.out.println("Merhaba Statik!");
    }

    public void publicMetod() {
        System.out.println("Merhaba Public!");
    }

    public static void main(String[] args) {
        OrnekSinif2.statikMetod();
        statikMetod();
    }

}

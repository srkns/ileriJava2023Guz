public class Array {

    public static void main(String args[]) {
        int a = 5;
        int b = 7;
        int c = 9;
        //...
        a *= 2; // a = a * 2;
        b *= 2;
        c *= 2;

        int k = 10;
        int t, l, y;
        int e, u, o[];
        int[] w, q, x;

        // int sayiDizisi[] = new int[3]; // 0 1 2
        // int[] sayiDizisi = {5, 7, 9};
        int sayiDizisi[] = {5, 7, 9};
        //int[] sayiDizisi = new int[3];
        //sayiDizisi[0] = 5;
        //sayiDizisi[1] = 7;
        //sayiDizisi[2] = 9;

        //sayiDizisi[0] *= 2;
        //sayiDizisi[1] *= 2;
        //sayiDizisi[2] *= 2;

        for (int i = 0; i < sayiDizisi.length; i++) {
            sayiDizisi[i] *= 2;
            System.out.println(sayiDizisi[i]);
        }

        System.out.println();

        int[][] sayilarim = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < sayilarim.length; ++i) {
            for(int j = 0; j < sayilarim[i].length; ++j) {
                System.out.print(sayilarim[i][j] + " "); // i + "," + j + " = " +
            }
            System.out.print("\n");
        }

    }

}
public class StringOps {

    public static void main(String[] args) {

        String deneme = "Bir Metin olabileceği";
        String deneme2 = "Bir Metin Olabileceği";

        System.out.println(deneme);
        System.out.println(deneme.length());

        System.out.println(deneme.toUpperCase());
        System.out.println(deneme.toLowerCase());

        System.out.println("metindeki 'e' harfinin yeri : " + deneme.indexOf('e'));
        System.out.println("metindeki 'il' metninin yeri : " + deneme.indexOf("il"));

        String merhabaMetni = "Merhaba";
        merhabaMetni = merhabaMetni.replace('a', 'i');
        System.out.println(merhabaMetni);
        System.out.println(merhabaMetni);

        int b = 7;
        String sayimB = String.valueOf(b);

        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

    }

}
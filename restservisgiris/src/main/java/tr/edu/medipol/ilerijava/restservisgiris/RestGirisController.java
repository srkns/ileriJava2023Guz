package tr.edu.medipol.ilerijava.restservisgiris;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestGirisController {

    @GetMapping("/")
    public String selamlama() {
        return "Merhaba İleri Java Dersidekiler!";
    }

    @GetMapping("/selam")
    public String selamVer(String isim) {
        return "Merhaba Hoşgeldin " + isim + " !";
    }

    @GetMapping("/toplama")
    public Integer selamVer(Integer sayi1, Integer sayi2) {
        return sayi1 + sayi2;
    }

}

package tr.edu.medipol.ilerijava.restservisler;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class RestServisController2 {

    @GetMapping
    public String selamla() {
        return "Merhaba Medipol!";
    }

    @GetMapping("/selam")
    public String selamlama(String isim) {
        return "Selamlar " + isim + "!";
    }

    @GetMapping("/topla")
    public Integer toplama(Integer sayi1, Integer sayi2) { // query parameters
        return sayi1 + sayi2;
    }

    @GetMapping("/test/{isim}") //path variable
    public String test(@PathVariable String isim) {
        return "Selamlar " + isim + "!";
    }

    @PostMapping("/testpost")
    public String testPost(@RequestBody String ad) {
        return "Merhaba " + ad + "!";
    }

    @PostMapping("/testpost2")
    public String testPost(@RequestBody PostMetoduGirdisi postMetoduGirdisi) {
        return "Merhaba " + postMetoduGirdisi.getAd() + " " + postMetoduGirdisi.getSoyad() + "!";
    }

}

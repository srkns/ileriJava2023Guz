package tr.edu.medipol.ilerijava.restveri.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.ilerijava.restveri.dto.KullaniciDTO;
import tr.edu.medipol.ilerijava.restveri.entity.Kullanici;
import tr.edu.medipol.ilerijava.restveri.service.KullaniciServiceImpl;

import java.util.ArrayList;
import java.util.List;

@RestController
@Slf4j
public class RestVeriController {

    @Autowired
    KullaniciServiceImpl kullaniciService;

    @PostMapping("/kullaniciOlustur")
    public String kullaniciOlustur(@RequestBody KullaniciDTO kullaniciDTO) {
        log.info("kullaniciOlustur servisi çağrıldı. Parametreler:" + kullaniciDTO);
        try {
            Kullanici kullanici = new Kullanici();
            log.debug("kullaniciOlustur servisi : Kullanici nesnesi oluşturuldu");
            kullanici.setUsername(kullaniciDTO.getUsername());
            kullanici.setPassword(kullaniciDTO.getPassword());
            kullanici.setEmail(kullaniciDTO.getEmail());
            log.debug("kullaniciOlustur servisi : Kullanici nesnesinin değerleri atandı.");
            Kullanici kaydedilmisKullanici = kullaniciService.kullaniciyiKaydet(kullanici);
            log.debug("kullaniciOlustur servisi : Kullanici servisi çağrıldı.");
            return kaydedilmisKullanici.getUsername() + " kullanici ismi ile yeni bir kullanici oluşturuldu.";
        } catch (Exception e) {
            log.error("kullaniciOlustur servisi çalışırken hata aldı. "
                    + "Parametreler:" + kullaniciDTO
                    + "Hata:" + e.getMessage());
        }
        return null;
    }

    @GetMapping("/kullaniciGetir")
    public KullaniciDTO kullaniciyiGetir(Long id) {
        Kullanici kullanici = kullaniciService.kullaniciyiGetir(id);
        KullaniciDTO kullaniciDTO = new KullaniciDTO(kullanici.getID(), kullanici.getUsername(), kullanici.getPassword(), kullanici.getEmail());
        return kullaniciDTO;
    }

    @PutMapping("/kullaniciGuncelle/{id}")
    public KullaniciDTO kullaniciGuncelle(@PathVariable Long id, @RequestBody KullaniciDTO kullaniciDTO) {
        Kullanici kullanici = kullaniciService.kullaniciyiGetir(id);
        kullanici.setUsername(kullaniciDTO.getUsername());
        kullanici.setPassword(kullaniciDTO.getPassword());
        kullanici.setEmail(kullaniciDTO.getEmail());
        kullaniciService.kullaniciyiKaydet(kullanici);
        return new KullaniciDTO(kullanici.getID(), kullanici.getUsername(), kullanici.getPassword(), kullanici.getEmail());
    }

    @DeleteMapping("/kullaniciSil")
    public String kullaniciSil(Long id) {
        if (id < 1) {
            return "ID bilgisi boş olamaz!";
        }
        kullaniciService.kullaniciyiSil(id);
        return id + " id nolu Kullanıcı silindi!";
    }

    @GetMapping("/tumKullanicilariListele")
    public List<KullaniciDTO> tumKullanicilariListele() {
        log.info("tumKullanicilariListele servisi çağrıldı!");
        List<Kullanici> kullaniciListesi = kullaniciService.kullanicilariGetir();
        List<KullaniciDTO> tumKullanicilar = new ArrayList<>();
        for (Kullanici k : kullaniciListesi) {
            KullaniciDTO kDTO = new KullaniciDTO(k.getID(), k.getUsername(), k.getPassword(), k.getEmail());
            tumKullanicilar.add(kDTO);
        }

        return tumKullanicilar;
    }

}

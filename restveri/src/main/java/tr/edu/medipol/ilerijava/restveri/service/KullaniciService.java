package tr.edu.medipol.ilerijava.restveri.service;

import org.springframework.stereotype.Service;
import tr.edu.medipol.ilerijava.restveri.entity.Kullanici;

import java.util.List;

@Service
public interface KullaniciService {

    Kullanici kullaniciyiGetir(Long id);

    Kullanici kullaniciyiKaydet(Kullanici kullanici);

    List<Kullanici> kullanicilariGetir();

    Kullanici kullaniciGuncelle(Kullanici kullanici);

    void kullaniciyiSil(Long id);

}

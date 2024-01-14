package tr.edu.medipol.ilerijava.restveri.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tr.edu.medipol.ilerijava.restveri.entity.Kullanici;
import tr.edu.medipol.ilerijava.restveri.repo.KullaniciRepository;

import java.util.List;
@Component
@Slf4j
public class KullaniciServiceImpl implements KullaniciService {

    @Autowired
    KullaniciRepository kullaniciRepo;

    @Override
    public Kullanici kullaniciyiGetir(Long id) {
        log.info("kullaniciyiGetir servisi çağırıldı.");
        return kullaniciRepo.getReferenceById(id);
    }

    @Override
    public Kullanici kullaniciyiKaydet(Kullanici kullanici) {
        return kullaniciRepo.save(kullanici);
    }

    @Override
    public List<Kullanici> kullanicilariGetir() {
        return kullaniciRepo.findAll();
    }

    @Override
    public Kullanici kullaniciGuncelle(Kullanici kullanici) {
        return kullaniciRepo.save(kullanici);
    }

    @Override
    public void kullaniciyiSil(Long id) {
        kullaniciRepo.deleteById(id);
    }

}

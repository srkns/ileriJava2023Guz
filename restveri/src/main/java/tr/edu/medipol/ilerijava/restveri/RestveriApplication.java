package tr.edu.medipol.ilerijava.restveri;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tr.edu.medipol.ilerijava.restveri.entity.Kullanici;
import tr.edu.medipol.ilerijava.restveri.repo.KullaniciRepository;

@SpringBootApplication
public class RestveriApplication implements CommandLineRunner {

	@Autowired
	KullaniciRepository kullaniciRepository;

	public static void main(String[] args) {
		SpringApplication.run(RestveriApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Kullanici kullanici = new Kullanici();
		kullanici.setUsername("kardeslik");
		kullanici.setPassword("M1!");
		kullanici.setEmail("medipolkardeş@medipol.com");
		kullaniciRepository.save(kullanici);
	}

}

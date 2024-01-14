package tr.edu.medipol.ilerijava.restveri.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class KullaniciDTO { // Data Transfer Object
    private Long ID;
    private String username;
    private String password;
    private String email;

}

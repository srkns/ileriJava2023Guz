package tr.edu.medipol.ilerijava.restveri.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class Kullanici {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long ID;
    private String username;
    private String password;
    private String email;
}

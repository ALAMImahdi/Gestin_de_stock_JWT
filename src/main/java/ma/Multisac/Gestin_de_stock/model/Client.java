package ma.Multisac.Gestin_de_stock.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="client")
@Data @NoArgsConstructor @AllArgsConstructor
public class Client {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String code;
    private String nom;
    private String prenom;
    private String adresse;
    private String tel;
    private String email;
    private String password;

}

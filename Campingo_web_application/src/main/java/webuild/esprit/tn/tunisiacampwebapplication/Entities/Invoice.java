package webuild.esprit.tn.tunisiacampwebapplication.Entities;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Invoice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInvoice;
    private String Reference;
    @NotNull
    float prixTotal;
    @NotNull
    float montantRemise;
    @NotNull
    int qte;
    @Temporal(TemporalType.DATE)
    private Date CreationDate;
    @NonNull
    @OneToOne
    private Commande commande;
}

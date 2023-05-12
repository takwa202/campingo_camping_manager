package webuild.esprit.tn.tunisiacampwebapplication.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DetailBasket implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDetail;
    private Integer NbrperPiece;
    private Integer NbrPieceTotal;
    @NonNull
    @Temporal(TemporalType.DATE)
    private Date PurchaseDate;
    @NonNull
    @ManyToOne
    Commande commande;
    @NonNull
    @ManyToOne
    Basket basket;
    @NonNull
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "detailBasket")
    private Set<Tools> tools;

}

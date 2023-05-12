package webuild.esprit.tn.tunisiacampwebapplication.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Tools implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTools;
    private String Type;
    private String Brand;
    private String Category;
    private String Description;
    @NonNull
    @Enumerated(EnumType.STRING)
    private State state;
    @NonNull
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private int Promotion;
    private float PriceperUnit;
    private Integer quantity;
    private String Weight;

    @NonNull
    @ManyToOne(cascade = CascadeType.ALL)
    User user;
    @NonNull
    @ManyToOne
    DetailBasket detailBasket;
}

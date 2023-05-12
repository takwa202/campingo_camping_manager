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
public class FormWishes implements Serializable
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idFormWish")
    private Integer idFormWish;
    private String location;
    private Integer membernumber;


}

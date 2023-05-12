package webuild.esprit.tn.tunisiacampwebapplication.Entities;

import com.fasterxml.jackson.annotation.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonInclude.Include;


import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idpublication")
public class Publication implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idpublication")
    private Integer idpublication;
    @Temporal (TemporalType.DATE)

    private Date datepublication;
    @Column(columnDefinition = "boolean default false")
    private boolean isarchived;
    private String content;
    private String location ;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<PostComments> PostComments;
@JsonIgnore
    @ManyToOne
    @JoinColumn(name = "user_id")
    User userpub;

    @OneToOne
    private Picture pictures  ;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="publication")
    private List<Reaction> reactions;


}

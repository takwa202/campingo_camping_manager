package webuild.esprit.tn.tunisiacampwebapplication.Services;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import webuild.esprit.tn.tunisiacampwebapplication.Entities.Publication;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.Reaction;
import webuild.esprit.tn.tunisiacampwebapplication.Repositories.Iuser;
import webuild.esprit.tn.tunisiacampwebapplication.Repositories.PublicationRepo;


import webuild.esprit.tn.tunisiacampwebapplication.Repositories.ReactionRepo;


import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Service
public class ReactionService {
    @Autowired
    ReactionRepo RR;
    @Autowired
    PublicationRepo pub;
    @Autowired
    Iuser userR;




    public List<Reaction> retrieveReactionsByPostId(Integer postId) {
        Publication publ = pub.findById(postId).get();
        return publ.getReactions();
    }

    public Reaction addReaction(Reaction w , Integer idpost, Integer iduser) {
        w.setIduser(iduser);
        Publication publ = pub.findById(idpost).get();
        List<Reaction> reactions = publ.getReactions();
        Reaction existingReaction = reactions.stream()
                .filter(r -> r.getIduser().equals(iduser))
                .findFirst()
                .orElse(null);
        if (existingReaction != null) {
            existingReaction.setReactiontype(w.getReactiontype());
            return RR.save(existingReaction);
        }
        publ.getReactions().add(w);
        w.setPublication(publ);
        //pub.save(publ);

        return RR.save(w);
    }


    public Reaction PostReaction(Reaction w) {

        return RR.save(w);
    }


    public Reaction retrieveReaction(Integer idReaction) {
        return RR.findById(idReaction).get();
    }

    public void removeReactionbyid(Integer idReaction) {
        RR.deleteById(idReaction);
    }

}

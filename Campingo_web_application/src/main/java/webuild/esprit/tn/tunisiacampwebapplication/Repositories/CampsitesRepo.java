package webuild.esprit.tn.tunisiacampwebapplication.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.Campsites;

import java.util.List;


@Repository

public interface CampsitesRepo extends JpaRepository<Campsites,Integer> {


}

package webuild.esprit.tn.tunisiacampwebapplication.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.Activitesaison;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.Activity;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.ActivityType;

import java.util.List;

@Repository
public interface ActivityRepository extends JpaRepository<Activity,Integer>
{




}

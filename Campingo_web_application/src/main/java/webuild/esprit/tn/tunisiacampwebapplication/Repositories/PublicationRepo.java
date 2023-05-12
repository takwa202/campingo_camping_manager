package webuild.esprit.tn.tunisiacampwebapplication.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.Publication;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.User;

import java.util.List;

@Repository
public interface PublicationRepo extends JpaRepository<Publication, Integer> {
    @Query("SELECT p FROM Publication p WHERE p.userpub.idUser = :userId")
    List<Publication> findPublicationsByUserId(@Param("userId") Integer userId);

}


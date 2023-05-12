package webuild.esprit.tn.tunisiacampwebapplication.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import webuild.esprit.tn.tunisiacampwebapplication.Entities.PostComments;

import java.util.List;

@Repository
public interface PostCommentsRepo extends JpaRepository<PostComments, Integer> {
  /**  @Query("SELECT pc FROM PostComments pc WHERE pc..id = :publicationId")
    List<PostComments> findPostCommentsByPublicationId(@Param("publicationId") Integer publicationId);**/
}

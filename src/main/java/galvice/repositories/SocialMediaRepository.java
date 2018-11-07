package galvice.repositories;

import galvice.model.Me;
import galvice.model.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialMediaRepository extends JpaRepository<SocialMedia, Long> {

}
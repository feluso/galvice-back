package galvice.repositories;

import galvice.model.Me;
import galvice.model.SocialMedia;
import galvice.model.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StatesRepository extends JpaRepository<State, String> {

}
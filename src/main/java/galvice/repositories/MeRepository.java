package galvice.repositories;

import galvice.model.Me;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeRepository extends JpaRepository<Me, Long> {

}
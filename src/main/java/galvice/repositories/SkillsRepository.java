package galvice.repositories;

import galvice.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillsRepository extends JpaRepository<Skill, Long> {

}

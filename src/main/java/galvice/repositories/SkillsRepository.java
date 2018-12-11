package galvice.repositories;

import galvice.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SkillsRepository extends JpaRepository<Skill, Long> {

    public List<Skill> findAllByOrderByIdAsc();


}

package galvice;

import galvice.model.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import galvice.repositories.MeRepository;
import galvice.repositories.SkillsRepository;

import java.util.List;

@RestController
public class SkillsController {

	@Autowired
	private SkillsRepository skillsRepository;

	@RequestMapping("/skills")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Skill> getSkills() {
		List<Skill> skills = skillsRepository.findAll();
		return skills;

	}

}

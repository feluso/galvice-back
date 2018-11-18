package galvice;

import galvice.model.Experience;
import galvice.model.SocialMedia;
import galvice.repositories.ExperienceRepository;
import galvice.repositories.SocialMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExperienceController {

	@Autowired
	private ExperienceRepository experienceRepository;

	@RequestMapping("/experience")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<Experience> getExperience() {
		List<Experience> experiences = experienceRepository.findAll();
		return experiences;
	}

}

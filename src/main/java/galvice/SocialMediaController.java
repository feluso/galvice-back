package galvice;

import galvice.model.Skill;
import galvice.model.SocialMedia;
import galvice.repositories.SocialMediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import galvice.repositories.MeRepository;
import galvice.repositories.SkillsRepository;

import java.util.List;

@RestController
public class SocialMediaController {

	@Autowired
	private SocialMediaRepository socialMediaRepository;

	@RequestMapping("/social-media")
	@CrossOrigin(origins = "http://localhost:4200")
	public List<SocialMedia> getSocialMedia() {
		List<SocialMedia> socialMedia = socialMediaRepository.findAll();
		return socialMedia;

	}

}

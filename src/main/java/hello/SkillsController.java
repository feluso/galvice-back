package hello;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import profile.Skill;

@RestController
public class SkillsController {

	@RequestMapping("/skills")
	public ArrayList<Skill> getSkills() {
		ArrayList<Skill> skillList = new ArrayList<>();
		skillList.add(new Skill("Technical Profficency"));
		skillList.add(new Skill("Java", 3));
		skillList.add(new Skill("SQL", 3));
		skillList.add(new Skill("Javascript", 3));
		skillList.add(new Skill("Angular", 3));
		
		return skillList;

	}

}

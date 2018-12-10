package galvice;

import galvice.model.State;
import galvice.repositories.StatesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StateController {

	@Autowired
	private StatesRepository stateRepository;

	@RequestMapping(value = "/state", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public int saveState(@RequestBody String name) {

		Optional<State> state = stateRepository.findById(name);
		state.get().increment();
		return stateRepository.save(state.get()).getAmount();

	}

}
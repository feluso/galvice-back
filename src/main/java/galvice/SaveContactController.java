package galvice;

import galvice.model.Contact;
import galvice.repositories.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class SaveContactController {

	@Autowired
	private ContactRepository contactRepository;

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	@CrossOrigin(origins = "http://localhost:4200")
	public Contact getContact(@RequestBody Contact contact) {
		return contactRepository.save(contact);

	}

}
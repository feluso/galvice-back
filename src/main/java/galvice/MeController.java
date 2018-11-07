package galvice;


import galvice.model.Me;
import galvice.repositories.MeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MeController {
    @Autowired
    private MeRepository meRepository;

    @RequestMapping("/me")
    @CrossOrigin(origins = "http://localhost:4200")
    public Me getMe() {
        List<Me> me = meRepository.findAll();
        return me.get(0);

    }
}

package galvice.repositories;

import galvice.model.Contact;
import galvice.model.Experience;
import galvice.model.SocialMedia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

    

}
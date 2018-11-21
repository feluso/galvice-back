package galvice.model;

import javax.persistence.*;


@Entity
@Table
public class Contact {


    @Id
    @GeneratedValue(generator = "contact_generator")
    @SequenceGenerator(
            name = "contact_generator",
            sequenceName = "contact_sequence",
            initialValue = 1
    )
    private Long id;

    private String name;
    private String email;
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


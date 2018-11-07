package galvice.model;

import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Table(name ="Me")
public class Me extends AuditModel  {

    @Id
    @GeneratedValue(generator = "me_generator")
    @SequenceGenerator(
            name = "me_generator",
            sequenceName = "me_sequence",
            initialValue = 1
    )
    private Long id;

    private String name;
    private String email;
    private long number;

    @Lob
    @Column(length = 1024)
    @Type(type = "org.hibernate.type.TextType")
    private String description;



    public Me(){
        super();
    }

    public Me(String name, String email, boolean measurable, long number) {
        super();
        this.setName(name);
        this.setEmail(email);
        this.setNumber(number);
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

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

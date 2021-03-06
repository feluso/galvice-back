package galvice.model;

import javax.persistence.*;

@Entity
@Table(name ="Experience")
public class Experience extends AuditModel {

    @Id
    @GeneratedValue(generator = "experience_generator")
    @SequenceGenerator(
            name = "experience_generator",
            sequenceName = "experience_generator",
            initialValue = 1
    )
    private Long id;

    @Column(length=10000)
    private String icon;
    private String title;
    @Column(length=2000)
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}


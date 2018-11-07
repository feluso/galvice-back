package galvice.model;

import javax.persistence.*;

@Entity
@Table(name ="SocialMedia")
public class SocialMedia extends AuditModel {

    @Id
    @GeneratedValue(generator = "socialmedia_generator")
    @SequenceGenerator(
            name = "socialmedia_generator",
            sequenceName = "socialmedia_generator",
            initialValue = 1
    )
    private Long id;

    private String icon;
    private String platform;
    private String platformUrl;


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

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatformUrl() {
        return platformUrl;
    }

    public void setPlatformUrl(String platformUrl) {
        this.platformUrl = platformUrl;
    }
}


package galvice.model;

import javax.persistence.*;

@Entity
@Table(name ="Skill")
public class Skill extends AuditModel  {

	private String name;
	private boolean grouping;
	private boolean measurable;
	private int levelValue;

	@Id
	@GeneratedValue(generator = "skill_generator")
	@SequenceGenerator(
			name = "skill_generator",
			sequenceName = "skill_sequence",
			initialValue = 1
	)
	private Long id;

	public Skill(String name, boolean grouping, boolean measurable, int levelValue) {
		super();
		this.setName(name);
		this.setGrouping(grouping);
		this.setMeasurable(measurable);
		this.setLevelValue(levelValue);
	}

	public Skill(){
		super();
	}

	public Skill(String name) {
		this(name, true, false, -1);
	}

	public Skill(String name, int levelValue) {
		this(name, false, true, levelValue);
	}

	public Skill(String name, boolean measurable) {
		this(name, false, false, -1);
	}

	public String getName() {
		return name;
	}

	public boolean isGrouping() {
		return grouping;
	}

	public boolean isMeasurable() {
		return measurable;
	}

	public int getLevelValue() {
		return levelValue;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setGrouping(boolean grouping) {
		this.grouping = grouping;
	}

	public void setMeasurable(boolean measurable) {
		this.measurable = measurable;
	}

	public void setLevelValue(int levelValue) {
		this.levelValue = levelValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}

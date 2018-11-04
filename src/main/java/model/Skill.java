package profile;

public class Skill {
	private String name;
	private boolean group;
	private boolean measurable;
	private int level;

	public Skill(String name, boolean group, boolean measurable, int level) {
		super();
		this.name = name;
		this.group = group;
		this.measurable = measurable;
		this.level = level;
	}

	public Skill(String name) {
		this(name, true, false, -1);
	}

	public Skill(String name, int level) {
		this(name, false, true, level);
	}

	public Skill(String name, boolean measurable) {
		this(name, false, false, -1);
	}

	public String getName() {
		return name;
	}

	public boolean isGroup() {
		return group;
	}

	public boolean isMeasurable() {
		return measurable;
	}

	public int getLevel() {
		return level;
	}

}

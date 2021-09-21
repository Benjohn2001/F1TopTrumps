
public class driver {
	int id;
	String name;
	int age;
	int wins;
	int podiums;
	int speed;
	int experience;
	int racecraft;
	int reliability;
	String description;
	String imagePath;

	public driver(int id,String name, int age, int wins,int podiums, int speed, int experience, int racecraft,int reliability,
			String description, String imagePath) {
		super();
		this.id=id;
		this.name = name;
		this.age = age;
		this.wins = wins;
		this.podiums = podiums;
		this.speed = speed;
		this.experience = experience;
		this.racecraft = racecraft;
		this.reliability=reliability;
		this.description = description;
		this.imagePath = imagePath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getWins() {
		return wins;
	}

	public void setWins(int wins) {
		this.wins = wins;
	}

	public int getPodiums() {
		return podiums;
	}

	public void setPodiums(int podiums) {
		this.podiums = podiums;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getRacecraft() {
		return racecraft;
	}

	public void setRacecraft(int racecraft) {
		this.racecraft = racecraft;
	}

	public int getReliability() {
		return reliability;
	}

	public void setReliability(int reliability) {
		this.reliability = reliability;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	
}



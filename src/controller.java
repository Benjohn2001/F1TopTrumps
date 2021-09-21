
public class controller {
	
	public static void createDrivers() {
		driver verstappen = new driver(33,"Max Verstappen",23,17,52,99,99,99,99,"description","imagepath");
		driver hamilton = new driver(44,"Lewis Hamilton",36,99,175,99,99,99,99,"description","imagepath");
		driver bottas = new driver(77,"Valtteri Bottas",32,9,64,99,99,99,99,"description","imagepath");
		driver norris = new driver(4,"Lando Norris",21,0,5,99,99,99,99,"description","imagepath");
		driver perez = new driver(11,"Sergio Perez",31,2,12,99,99,99,99,"description","imagepath");
		driver leclerc = new driver(16,"Charles Leclerc",23,2,13,99,99,99,99,"description","imagepath");
		driver sainz = new driver(55,"Carlos Sainz",27,0,4,99,99,99,99,"description","imagepath");
		driver ricciardo = new driver(3,"Daniel Ricciardo",32,8,32,99,99,99,99,"description","imagepath");
		driver gasly = new driver(10,"Pierre Gasly",25,1,3,99,99,99,99,"description","imagepath");
		driver alonso = new driver(14,"Fernando Alonso",40,32,97,99,99,99,99,"description","imagepath");
		driver ocon = new driver(31,"Esteban Ocon",25,1,2,99,99,99,99,"description","imagepath");
		driver vettel = new driver(5,"Sebastian Vettel",34,53,122,99,99,99,99,"description","imagepath");
		driver stroll = new driver(18,"Lawrence Stroll",22,0,3,99,99,99,99,"description","imagepath");
		driver tsunoda = new driver(22,"Yuki Tsunoda",21,0,0,99,99,99,99,"description","imagepath");
		driver russell = new driver(63,"George Russell",23,0,1,99,99,99,99,"description","imagepath");
		driver latifi = new driver(6,"Nicholas Latifi",26,0,0,99,99,99,99,"description","imagepath");
		driver raikkonen = new driver(7,"Kimi Raikkonen",41,21,103,99,99,99,99,"description","imagepath");
		driver giovinazzi = new driver(99,"Antonio Giovinazzi",27,0,0,99,99,99,99,"description","imagepath");
		driver schumacherJr = new driver(47,"Mick Schumacher",22,0,0,99,99,99,99,"description","imagepath");
		driver mazepin = new driver(9,"Nikita Mazepin",22,0,0,99,99,99,99,"description","imagepath");
		driver[] drivers={verstappen,hamilton,bottas,norris,perez,leclerc,sainz,ricciardo,gasly,alonso,ocon,vettel,stroll,tsunoda,russell,latifi,raikkonen,giovinazzi,schumacherJr,mazepin};
	}
	
	public static void main(String[] args) {
		createDrivers();
		
	}

}

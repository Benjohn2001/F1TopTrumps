
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * @author benjohnston Controller class to create drivers and assign the player
 *         and cpu a deck
 */
public class controller {
	public static driver[] drivers;
	public static Queue<driver> userDeck;
	public static Queue<driver> cpuDeck;

	public static void createDrivers() {
		driver verstappen = new driver(33, "Max Verstappen", 23, 17, 52, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/verstappen.png");
		driver hamilton = new driver(44, "Lewis Hamilton", 36, 99, 175, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/hamilton.png");
		driver bottas = new driver(77, "Valtteri Bottas", 32, 9, 64, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/bottas.png");
		driver norris = new driver(4, "Lando Norris", 21, 0, 5, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/norris.png");
		driver perez = new driver(11, "Sergio Perez", 31, 2, 12, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/perez.png");
		driver leclerc = new driver(16, "Charles Leclerc", 23, 2, 13, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/leclerc.png");
		driver sainz = new driver(55, "Carlos Sainz", 27, 0, 4, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/sainz.png");
		driver ricciardo = new driver(3, "Daniel Ricciardo", 32, 8, 32, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/ricciardo.png");
		driver gasly = new driver(10, "Pierre Gasly", 25, 1, 3, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/gasly.png");
		driver alonso = new driver(14, "Fernando Alonso", 40, 32, 97, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/alonso.png");
		driver ocon = new driver(31, "Esteban Ocon", 25, 1, 2, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/Ocon.png");
		driver vettel = new driver(5, "Sebastian Vettel", 34, 53, 122, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/vettel.png");
		driver stroll = new driver(18, "Lawrence Stroll", 22, 0, 3, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/stroll.png");
		driver tsunoda = new driver(22, "Yuki Tsunoda", 21, 0, 0, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/tsunoda.png");
		driver russell = new driver(63, "George Russell", 23, 0, 1, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/russell.png");
		driver latifi = new driver(6, "Nicholas Latifi", 26, 0, 0, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/latifi.png");
		driver raikkonen = new driver(7, "Kimi Raikkonen", 41, 21, 103, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/raikkonen.png");
		driver giovinazzi = new driver(99, "Antonio Giovinazzi", 27, 0, 0, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/giovinazzi.png");
		driver schumacherJr = new driver(47, "Mick Schumacher", 22, 0, 0, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/schumacherJr.png");
		driver mazepin = new driver(9, "Nikita Mazepin", 22, 0, 0, 99, 99, 99, 99, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/mazepin.png");
		drivers = new driver[] { verstappen, hamilton, bottas, norris, perez, leclerc, sainz, ricciardo, gasly, alonso,
				ocon, vettel, stroll, tsunoda, russell, latifi, raikkonen, giovinazzi, schumacherJr, mazepin };
	}

	public static void createDeck() {
		userDeck = new LinkedList<>();
		cpuDeck = new LinkedList<>();
		ArrayList<driver> temp = new ArrayList<>(Arrays.asList(drivers));
		int index = 0;
		while (index < (drivers.length / 2)) {
			int random = new Random().nextInt(drivers.length);
			if (temp.contains(drivers[random])) {
				userDeck.add(drivers[random]);
				index++;
				temp.remove(drivers[random]);
			}
		}
		for (int i = 0; i < (drivers.length / 2); i++) {
			cpuDeck.add(temp.get(0));
			temp.remove(0);
		}
	}

	public static void main(String[] args) {
		createDrivers();
//		System.out.println(drivers.length);
//		for(driver d : drivers) {
//			System.out.println(d.toString());
//		}
		createDeck();
//		System.out.println(userDeck.size());
//		for (driver d : userDeck) {
//			System.out.println(d.name);
//		}
//		System.out.println("\n\n");
//		System.out.println(cpuDeck.size());
//		for (driver d : cpuDeck) {
//			System.out.println(d.name);
//		}

	}

}

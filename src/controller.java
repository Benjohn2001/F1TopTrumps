
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;

/**
 * @author benjohnston Controller class to create drivers and assign the player
 *         and cpu a deck
 */
public class controller {
	public static driver[] drivers;
	public static Queue<driver> userDeck;
	public static Queue<driver> cpuDeck;
	public static int userChoice;
	public static int cpuChoice;
	public static int cat;
	public static driver userCurrent;
	public static driver cpuCurrent;

	public static void createDrivers() {
		driver verstappen = new driver(33, "Max Verstappen", 23, 17, 52, 1, 2, 3, 4, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/verstappen.png");
		driver hamilton = new driver(44, "Lewis Hamilton", 36, 99, 175, 5, 6, 7, 8, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/hamilton.png");
		driver bottas = new driver(77, "Valtteri Bottas", 32, 9, 64, 9, 10, 11, 12, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/bottas.png");
		driver norris = new driver(4, "Lando Norris", 21, 0, 5, 13, 14, 15, 16, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/norris.png");
		driver perez = new driver(11, "Sergio Perez", 31, 2, 12, 17, 18, 19, 20, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/perez.png");
		driver leclerc = new driver(16, "Charles Leclerc", 23, 2, 13, 21, 22, 23, 24, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/leclerc.png");
		driver sainz = new driver(55, "Carlos Sainz", 27, 0, 4, 25, 26, 27, 28, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/sainz.png");
		driver ricciardo = new driver(3, "Daniel Ricciardo", 32, 8, 32, 29, 30, 31, 32, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/ricciardo.png");
		driver gasly = new driver(10, "Pierre Gasly", 25, 1, 3, 33, 34, 35, 36, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/gasly.png");
		driver alonso = new driver(14, "Fernando Alonso", 40, 32, 97, 37, 38, 39, 40, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/alonso.png");
		driver ocon = new driver(31, "Esteban Ocon", 25, 1, 2, 41, 42, 43, 44, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/Ocon.png");
		driver vettel = new driver(5, "Sebastian Vettel", 34, 53, 122, 45, 46, 47, 48, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/vettel.png");
		driver stroll = new driver(18, "Lawrence Stroll", 22, 0, 3, 49, 50, 51, 52, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/stroll.png");
		driver tsunoda = new driver(22, "Yuki Tsunoda", 21, 0, 0, 53, 54, 55, 56, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/tsunoda.png");
		driver russell = new driver(63, "George Russell", 23, 0, 1, 57, 58, 59, 60, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/russell.png");
		driver latifi = new driver(6, "Nicholas Latifi", 26, 0, 0, 61, 62, 63, 64, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/latifi.png");
		driver raikkonen = new driver(7, "Kimi Raikkonen", 41, 21, 103, 65, 66, 67, 68, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/raikkonen.png");
		driver giovinazzi = new driver(99, "Antonio Giovinazzi", 27, 0, 0, 69, 70, 71, 72, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/giovinazzi.png");
		driver schumacherJr = new driver(47, "Mick Schumacher", 22, 0, 0, 73, 74, 75, 76, "description",
				"/Users/benjohnston/F1TopTrumps/imgs/schumacherJr.png");
		driver mazepin = new driver(9, "Nikita Mazepin", 22, 0, 0, 77, 78, 79, 80, "description",
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

	public static int userToChoose() {
		if (!(userDeck.isEmpty())) {
			userCurrent = userDeck.peek();
			System.out.println("Here is your next card " + userCurrent.getName() + " number " + userCurrent.getId());
			System.out.println(userCurrent.getName() + " is " + userCurrent.getAge() + " years old and has "
					+ userCurrent.getWins() + " wins and " + userCurrent.getPodiums() + " podiums. ");
			System.out.println(userCurrent.getDescription());
			System.out.println("Choose from (1) SPEED: " + userCurrent.getSpeed() + " (2) EXPERIENCE: "
					+ userCurrent.getExperience() + " (3) RACECRAFT: " + userCurrent.getRacecraft()
					+ " (4) RELIABILITY: " + userCurrent.getReliability());
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter your choice (1 to 4): ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				userChoice = userCurrent.getSpeed();
				break;
			case 2:
				userChoice = userCurrent.getExperience();
				break;
			case 3:
				userChoice = userCurrent.getRacecraft();
				break;
			case 4:
				userChoice = userCurrent.getReliability();
				break;

			}
			return choice;
		}
		return 0;
	}

	public static void userResponse(int cat) {
		userCurrent = userDeck.peek();
		switch (cat) {
		case 1:
			userChoice = userCurrent.getSpeed();
			break;
		case 2:
			userChoice = userCurrent.getExperience();
			break;
		case 3:
			userChoice = userCurrent.getRacecraft();
			break;
		case 4:
			userChoice = userCurrent.getReliability();
			break;

		}
	}

	public static int cpuToChoose() {
		int choice = 0;
		if (!(cpuDeck.isEmpty())) {
			cpuCurrent = cpuDeck.peek();
			if (cpuCurrent.getSpeed() >= cpuCurrent.getExperience()) {
				if (cpuCurrent.getSpeed() >= cpuCurrent.getRacecraft()) {
					if (cpuCurrent.getSpeed() >= cpuCurrent.getReliability()) {
						choice = 1;
						cpuChoice = cpuCurrent.getSpeed();
					}
				}
			}
			if (cpuCurrent.getExperience() >= cpuCurrent.getSpeed()) {
				if (cpuCurrent.getExperience() >= cpuCurrent.getRacecraft()) {
					if (cpuCurrent.getExperience() >= cpuCurrent.getReliability()) {
						choice = 2;
						cpuChoice = cpuCurrent.getExperience();
					}
				}
			}
			if (cpuCurrent.getRacecraft() >= cpuCurrent.getSpeed()) {
				if (cpuCurrent.getRacecraft() >= cpuCurrent.getExperience()) {
					if (cpuCurrent.getRacecraft() >= cpuCurrent.getReliability()) {
						choice = 3;
						cpuChoice = cpuCurrent.getRacecraft();
					}

				}
			}
			if (cpuCurrent.getReliability() >= cpuCurrent.getSpeed()) {
				if (cpuCurrent.getReliability() >= cpuCurrent.getExperience()) {
					if (cpuCurrent.getReliability() >= cpuCurrent.getRacecraft()) {
						choice = 4;
						cpuChoice = cpuCurrent.getReliability();
					}
				}

			}

			return choice;

		}
		return 0;
	}

	public static void cpuResponse(int cat) {
		cpuCurrent = cpuDeck.peek();
		switch (cat) {
		case 1:
			cpuChoice = cpuCurrent.getSpeed();
			break;
		case 2:
			cpuChoice = cpuCurrent.getExperience();
			break;
		case 3:
			cpuChoice = cpuCurrent.getRacecraft();
			break;
		case 4:
			cpuChoice = cpuCurrent.getReliability();
			break;

		}
	}

	public static void userTurn() {
		System.out.println("\n\n");
		cat = userToChoose();
		System.out.println("Your stats value chosen is: ");
		System.out.println(userChoice);
		cpuResponse(cat);
		System.out.println("\nThe CPU had: ");
		System.out.println(cpuCurrent.toString());
		System.out.println("Your opponents stats value for the number (" + cat + ") chosen is: ");
		System.out.println(cpuChoice);
	}

	public static void cpuTurn() {
		System.out.println("\n\n");
		cat = cpuToChoose();
		System.out.println("\nThe CPU had: ");
		System.out.println(cpuCurrent.toString());
		System.out.println("The CPU's value chosen is: ");
		System.out.println(cpuChoice);
		userResponse(cat);
		System.out.println("\nYou had: ");
		System.out.println(userCurrent.toString());
		System.out.println("Your stats value for the number (" + cat + ") chosen is: ");
		System.out.println(userChoice);
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

		userTurn();
		cpuTurn();

	}

}

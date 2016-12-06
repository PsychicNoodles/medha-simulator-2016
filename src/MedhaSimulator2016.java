import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.Room;
import items.Item;
import rooms.Bedroom;

public class MedhaSimulator2016 {
	public static void main(String[] args) {
		System.out.println();
		System.out.println("Welcome to Medha Simulator 2016!");
		System.out.println("Your goal is to get to 207 on time.");
		System.out.println();
		
		Room[] rooms = new Room[]{ new Bedroom() };
		List<Item> inventory = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int round = 1;
		
		for(Room r : rooms) {
			while(!r.shouldLeave()) {
				System.out.println(fmtRound(round) + " =====");
				System.out.println(r.getFlavor());

				System.out.print("> ");
				String cmd = in.nextLine();
				System.out.println();

				System.out.println(r.processCommand(cmd, inventory));
				round++;
			}
		}
		
		in.close();
	}
	
	private static String fmtRound(int round) {
		if(round < 10) {
			return "00" + round;
		} else if(round < 100) {
			return "0" + round;
		} else {
			return Integer.toString(round);
		}
	}
}

package rooms;

import java.util.List;

import interfaces.Room;
import items.Item;
import items.MathHomework;

public class Bedroom extends Room {

	private boolean hasPcard;
	private boolean isDressed;
	
	private static final String FLAVOR = "bedroom";
	private static final String[] LOOKS = {"you look around", "look some more"};
	
	public Bedroom() {
		super("Bedroom", FLAVOR, LOOKS);
		hasPcard = false;
		isDressed = false;
		roomItems.put("pcard", new Item("PCard",
										"You stuff your PCard into your pocket",
										"You try to swipe your PCard on thin air, but it does nothing!",
										"You always hated your PCard picture...",
										"You punch the PCard. It does not care.",
										true));
		roomItems.put("clothes", new Item("clothes",
										  "You hastily change into your clothes for the day",
										  "You note your outfit is all black, as usual.",
										  "You pat your clothes. You remember you need to do laundry.",
										  "You punch your clothes. That felt good!",
										  true));
		roomItems.put("math homework", new MathHomework("math homework",
														null,
														null,
														"You question why you chose to major in math",
														"You rip up the paper and immediately regret"
														+ " your decision.",
														false,
														"You poke the remains of the homework."));
	}
	
	@Override
	public String pickUpResponse(Item itm, List<Item> inventory) {
		if(itm.getName().equals("PCard")) {
			hasPcard = true;
		} else if(itm.getName().equals("clothes")) {
			isDressed = true;
		}
		
		return super.pickUpResponse(itm, inventory);
	}

	@Override
	public boolean complete() {
		return hasPcard && isDressed;
	}

}

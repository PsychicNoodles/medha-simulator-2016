package items;

public class Item {
	protected String name; 
	protected String pickUp;
	protected String use;
	protected String interact;
	protected String attack;
	protected boolean pickUpable;
	
	public Item(String name, String pickUp, String use, String interact, String attack,
				boolean pickUpable) {
		this.name = name;
		this.pickUp = pickUp;
		this.use = use;
		this.interact = interact;
		this.attack = attack;
		this.pickUpable = pickUpable;
	}

	public String getName() {
		return name;
	}
	
	public String getPickUp() {
		return pickUp;
	}

	public String getUse() {
		return use;
	}

	public String getInteract() {
		return interact;
	}

	public String getAttack() {
		return attack;
	}
	
	public boolean getPickUpable() {
		return pickUpable;
	}
	
}
